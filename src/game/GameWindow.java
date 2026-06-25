package game;

import model.battle.BattleManager;
import model.battle.Round;
import model.battle.ScoreSystem;
import model.character.Character;
import model.character.*;
import model.question.*;

import javax.swing.*;
import java.awt.*;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class GameWindow extends JFrame {
    private CardLayout cardLayout;
    private JPanel mainPanel;


    private Character player;
    private List<Supplier<Enemy>> enemyFactories;
    private List<Enemy> enemies;
    private int currentBattleIndex = 0;
    private BattleManager battleManager;
    private Round currentRound;
    private ScoreSystem scoreSystem;


    private Timer questionTimer;
    private int timeLeft = 0;


    private JTextArea txtLog;
    private JLabel lblPlayerHealth, lblEnemyHealth, lblTimerDisplay;
    private JTextArea txtQuestionArea;
    private JButton btnOptA, btnOptB, btnOptC, btnOptD;


    private CardLayout inputCardLayout;
    private JPanel inputPanel;
    private JTextField txtFillBlank;
    private JButton btnConfirm;


    private JLabel lblFinalTitle, lblFinalStats;

    public GameWindow() {
        setTitle("CodeArena RPG");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1220, 550);
        setLocationRelativeTo(null);

        cardLayout = new CardLayout();
        mainPanel = new JPanel(cardLayout);

        mainPanel.add(createMenuPanel(), "MENU");
        mainPanel.add(createCharacterSelectPanel(), "CHAR_SELECT");
        mainPanel.add(createBattlePanel(), "BATTLE");
        mainPanel.add(createHowToPlayPanel(), "HOW_TO_PLAY");
        mainPanel.add(createGameOverPanel(), "GAME_OVER");

        add(mainPanel);
        initEnemies();
    }



    private JPanel createMenuPanel() {
        JPanel panel = new JPanel(new GridLayout(4, 1, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(50, 100, 50, 100));

        JLabel title = new JLabel("CodeArena RPG", SwingConstants.CENTER);
        title.setFont(new Font("Arial", Font.BOLD, 28));
        panel.add(title);

        JButton btnStart = new JButton("Novo Jogo");
        btnStart.addActionListener(e -> cardLayout.show(mainPanel, "CHAR_SELECT"));
        panel.add(btnStart);

        JButton btnHelp = new JButton("Como Jogar");
        btnHelp.addActionListener(e -> cardLayout.show(mainPanel, "HOW_TO_PLAY"));
        panel.add(btnHelp);

        JButton btnExit = new JButton("Sair");
        btnExit.addActionListener(e -> System.exit(0));
        panel.add(btnExit);

        return panel;
    }

    private JPanel createCharacterSelectPanel() {
        JPanel panel = new JPanel(new BorderLayout());
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        JLabel title = new JLabel("Selecione seu Campeão", SwingConstants.CENTER);
        title.setFont(new Font("Arial", Font.BOLD, 20));
        panel.add(title, BorderLayout.NORTH);

        JPanel charsPanel = new JPanel(new GridLayout(1, 3, 15, 15));
        charsPanel.add(createCharCard("Vampiro", Vampire::new));
        charsPanel.add(createCharCard("Cartomante", FortuneTeller::new));
        charsPanel.add(createCharCard("Bobo", Fool::new));
        panel.add(charsPanel, BorderLayout.CENTER);

        JButton btnBack = new JButton("Voltar ao Menu");
        btnBack.addActionListener(e -> cardLayout.show(mainPanel, "MENU"));
        panel.add(btnBack, BorderLayout.SOUTH);

        return panel;
    }

    private JPanel createCharCard(String name, Supplier<Character> characterFactory) {
        JPanel card = new JPanel(new BorderLayout(5, 5));
        card.setBorder(BorderFactory.createEtchedBorder());

        Character previewInstance = characterFactory.get();

        String details = String.format(
                "<html><center><b>%s</b><br><br>🩸 HP: %d<br>⚔ ATK: %d<br>🛡 DEF: %d<br>⚡ SPD: %d<br><br><i>%s</i></center></html>",
                name, previewInstance.getMaxHealth(), previewInstance.getDamage(),
                previewInstance.getDefense(), previewInstance.getSpeed(),
                (previewInstance instanceof SpecialAbility sa) ? sa.getAbilityDescription() : ""
        );

        JLabel lblInfo = new JLabel(details, SwingConstants.CENTER);
        card.add(lblInfo, BorderLayout.CENTER);

        JButton btnSelect = new JButton("Escolher " + name);
        btnSelect.addActionListener(e -> {
            this.player = characterFactory.get();
            this.currentBattleIndex = 0;
            this.scoreSystem = new ScoreSystem();
            spawnFreshEnemies();
            startBattle();
        });
        card.add(btnSelect, BorderLayout.SOUTH);

        return card;
    }

    private JPanel createBattlePanel() {
        JPanel panel = new JPanel(new BorderLayout(10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JPanel topPanel = new JPanel(new GridLayout(1, 3, 10, 10));
        lblPlayerHealth = new JLabel("Jogador: --", SwingConstants.LEFT);
        lblPlayerHealth.setFont(new Font("Monospaced", Font.BOLD, 12));

        lblTimerDisplay = new JLabel("⏱ Tempo: --", SwingConstants.CENTER);
        lblTimerDisplay.setFont(new Font("Arial", Font.BOLD, 14));
        lblTimerDisplay.setForeground(Color.RED);

        lblEnemyHealth = new JLabel("Inimigo: --", SwingConstants.RIGHT);
        lblEnemyHealth.setFont(new Font("Monospaced", Font.BOLD, 12));

        topPanel.add(lblPlayerHealth);
        topPanel.add(lblTimerDisplay);
        topPanel.add(lblEnemyHealth);
        panel.add(topPanel, BorderLayout.NORTH);

        JPanel centerPanel = new JPanel(new GridLayout(2, 1, 5, 5));

        txtQuestionArea = new JTextArea("Carregando pergunta...");
        txtQuestionArea.setFont(new Font("Arial", Font.PLAIN, 15));
        txtQuestionArea.setLineWrap(true);
        txtQuestionArea.setWrapStyleWord(true);
        txtQuestionArea.setEditable(false);
        txtQuestionArea.setBackground(new Color(245, 245, 245));
        txtQuestionArea.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(Color.LIGHT_GRAY),
                BorderFactory.createEmptyBorder(10, 10, 10, 10)
        ));
        centerPanel.add(txtQuestionArea);

        txtLog = new JTextArea();
        txtLog.setEditable(false);
        txtLog.setFont(new Font("Monospaced", Font.PLAIN, 12));
        centerPanel.add(new JScrollPane(txtLog));

        panel.add(centerPanel, BorderLayout.CENTER);


        JPanel btnPanel = new JPanel(new GridLayout(2, 2, 5, 5));
        btnOptA = new JButton("A");
        btnOptB = new JButton("B");
        btnOptC = new JButton("C");
        btnOptD = new JButton("D");

        btnOptA.addActionListener(e -> handleAnswer("A"));
        btnOptB.addActionListener(e -> handleAnswer("B"));
        btnOptC.addActionListener(e -> handleAnswer("C"));
        btnOptD.addActionListener(e -> handleAnswer("D"));

        btnPanel.add(btnOptA);
        btnPanel.add(btnOptB);
        btnPanel.add(btnOptC);
        btnPanel.add(btnOptD);


        JPanel fillPanel = new JPanel(new BorderLayout(5, 0));
        fillPanel.setBorder(BorderFactory.createEmptyBorder(5, 0, 5, 0));
        txtFillBlank = new JTextField();
        txtFillBlank.setFont(new Font("Arial", Font.PLAIN, 14));
        btnConfirm = new JButton("Confirmar ✔");
        btnConfirm.addActionListener(e -> handleAnswer(txtFillBlank.getText().trim()));

        txtFillBlank.addActionListener(e -> handleAnswer(txtFillBlank.getText().trim()));
        fillPanel.add(txtFillBlank, BorderLayout.CENTER);
        fillPanel.add(btnConfirm, BorderLayout.EAST);


        inputCardLayout = new CardLayout();
        inputPanel = new JPanel(inputCardLayout);
        inputPanel.add(btnPanel, "BUTTONS");
        inputPanel.add(fillPanel, "FILL_BLANK");

        panel.add(inputPanel, BorderLayout.SOUTH);
        return panel;
    }

    private JPanel createHowToPlayPanel() {
        JPanel panel = new JPanel(new BorderLayout());
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        JTextArea helpText = new JTextArea("Como Jogar Arena Code RPG:\n\n" +
                "1. Selecione sua classe.\n" +
                "2. Utilize os botões para responder às questões apresentadas.\n" +
                "3. Preste atenção no tempo limite exibido em tela.\n" +
                "4. Derrote todos os inimigos para vencer.");
        helpText.setEditable(false);
        helpText.setLineWrap(true);
        helpText.setWrapStyleWord(true);
        panel.add(new JScrollPane(helpText), BorderLayout.CENTER);

        JButton btnBack = new JButton("Voltar");
        btnBack.addActionListener(e -> cardLayout.show(mainPanel, "MENU"));
        panel.add(btnBack, BorderLayout.SOUTH);

        return panel;
    }

    private JPanel createGameOverPanel() {
        JPanel panel = new JPanel(new BorderLayout(10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(40, 80, 40, 80));

        lblFinalTitle = new JLabel("Fim de Jogo", SwingConstants.CENTER);
        lblFinalTitle.setFont(new Font("Arial", Font.BOLD, 26));
        panel.add(lblFinalTitle, BorderLayout.NORTH);

        lblFinalStats = new JLabel("", SwingConstants.CENTER);
        lblFinalStats.setFont(new Font("Monospaced", Font.PLAIN, 16));
        panel.add(lblFinalStats, BorderLayout.CENTER);

        JButton btnBackToMenu = new JButton("Voltar ao Menu");
        btnBackToMenu.addActionListener(e -> cardLayout.show(mainPanel, "MENU"));
        panel.add(btnBackToMenu, BorderLayout.SOUTH);

        return panel;
    }



    private void startBattle() {
        if (currentBattleIndex >= enemies.size()) return;

        Enemy enemy = enemies.get(currentBattleIndex);
        battleManager = new BattleManager(player, enemy, currentBattleIndex + 1);


        Difficulty selectedDifficulty = calculateDefaultDifficulty();
        if (battleManager.playerChoosesDifficulty()) {
            selectedDifficulty = askFortuneTellerDifficulty();
        }

        battleManager.prepareQuestions(selectedDifficulty);
        txtLog.setText("Combate iniciado contra: " + enemy.getName() + "!\n" + enemy.getEnemyDescription()+ "!\n");

        updateStatus();
        cardLayout.show(mainPanel, "BATTLE");
        showNextQuestion();
    }

    private void nextBattle() {
        if (currentBattleIndex >= enemies.size()) {
            showFinalScreen(true);
            return;
        }

        Enemy enemy = enemies.get(currentBattleIndex);
        battleManager = new BattleManager(player, enemy, currentBattleIndex + 1);

        Difficulty selectedDifficulty = calculateDefaultDifficulty();
        if (battleManager.playerChoosesDifficulty()) {
            selectedDifficulty = askFortuneTellerDifficulty();
        }

        battleManager.prepareQuestions(selectedDifficulty);
        txtLog.append("\nNova ameaça: " + enemy.getName() + "\n" + enemy.getEnemyDescription() + "\n" );

        updateStatus();
        showNextQuestion();
    }



    private void handleAnswer(String selectedAnswer) {
        stopTimer();
        if (battleManager == null) return;

        Difficulty questionDifficulty = currentRound.getRoundQuestion().getDifficulty();

        Round.RoundResult playerResult = currentRound.executePlayerTurn(selectedAnswer);
        playerResult.logs.forEach(log -> txtLog.append(log + "\n"));

        if (scoreSystem != null) {
            scoreSystem.registerAnswer(playerResult.correct, questionDifficulty);
        }

        if (battleManager.getEnemy().isAlive()) {
            Round.RoundResult botResult = currentRound.executeBotTurn();
            botResult.logs.forEach(log -> txtLog.append(log + "\n"));
        }

        battleManager.refreshBattleStatus();
        updateStatus();
        battleManager.advanceRound();
        checkBattleState();
    }

    private void checkBattleState() {
        BattleManager.BattleStatus status = battleManager.getBattleStatus();

        if (status == BattleManager.BattleStatus.ENEMY_WON) {
            showFinalScreen(false);
            return;
        }

        if (status == BattleManager.BattleStatus.PLAYER_WON) {
            txtLog.append("\n🏆 VITÓRIA! " + battleManager.getEnemy().getName() + " foi finalizado!\n");
            if (scoreSystem != null) {
                scoreSystem.registerEnemyDefeated();
            }
            battleManager.applyPostBattleHeal();
            JOptionPane.showMessageDialog(this, "Fim do combate! Cura passiva executada.");
            currentBattleIndex++;
            nextBattle();
            return;
        }

        showNextQuestion();
    }



    private void showFinalScreen(boolean victory) {
        stopTimer();

        int totalScore = (scoreSystem != null) ? scoreSystem.getTotalScore() : 0;
        int correct = (scoreSystem != null) ? scoreSystem.getCorrectAnswers() : 0;
        int wrong = (scoreSystem != null) ? scoreSystem.getWrongAnswers() : 0;
        int defeated = (scoreSystem != null) ? scoreSystem.getEnemiesDefeated() : 0;
        double accuracy = (scoreSystem != null) ? scoreSystem.getAccuracyPercentage() : 0.0;

        if (victory) {
            lblFinalTitle.setText("🏆 VITÓRIA! Você é o campeão da CodeArena!");
        } else {
            String enemyName = (battleManager != null) ? battleManager.getEnemy().getName() : "um inimigo";
            lblFinalTitle.setText("💀 GAME OVER! Derrotado por " + enemyName + ".");
        }

        String stats = String.format(
                "<html><center>Pontuação final: <b>%d</b><br><br>" +
                        "Inimigos derrotados: %d / %d<br>" +
                        "Respostas certas: %d &nbsp;|&nbsp; Respostas erradas: %d<br>" +
                        "Taxa de acerto: %.1f%%</center></html>",
                totalScore, defeated, enemies.size(), correct, wrong, accuracy
        );
        lblFinalStats.setText(stats);

        currentBattleIndex = 0;
        cardLayout.show(mainPanel, "GAME_OVER");
    }



    private void showNextQuestion() {
        if (battleManager == null) return;


        currentRound = battleManager.buildCurrentRound();
        currentRound.preparePlayerTurn();

        Question question = currentRound.getRoundQuestion();
        txtQuestionArea.setText(question.getText());


        char eliminated = currentRound.getEliminatedOption();
        if (eliminated != 0) {
            txtLog.append("[" + player.getName() + "] Alternativa [" + eliminated + "] é incorreta!\n");
        }

        configureButtons(question);


        if (question instanceof TimedQuestion timedQ) {
            timeLeft = timedQ.getTimeLimitInSeconds();
            lblTimerDisplay.setText("⏱ Tempo: " + timeLeft + "s");

            questionTimer = new Timer(1000, e -> {
                timeLeft--;
                if (timeLeft <= 0) {
                    stopTimer();
                    lblTimerDisplay.setText("⏱ Tempo: ESGOTADO!");
                    handleAnswer("");
                } else {
                    lblTimerDisplay.setText("⏱ Tempo: " + timeLeft + "s");
                }
            });
            questionTimer.start();
        } else {
            lblTimerDisplay.setText("⏱ Sem Tempo Limite");
        }
    }


    private void configureButtons(Question question) {
        if (question instanceof FillBlankQuestion) {
            txtFillBlank.setText("");
            inputCardLayout.show(inputPanel, "FILL_BLANK");

            SwingUtilities.invokeLater(() -> txtFillBlank.requestFocusInWindow());
        } else {
            inputCardLayout.show(inputPanel, "BUTTONS");

            if (question instanceof TrueFalseQuestion) {
                btnOptA.setText("A) Verdadeiro");
                btnOptB.setText("B) Falso");
                btnOptC.setVisible(false);
                btnOptD.setVisible(false);
            } else if (question instanceof MultipleChoiceQuestion mcq) {
                List<String> options = mcq.getOptions();
                btnOptA.setText("A) " + (options.size() > 0 ? options.get(0) : ""));
                btnOptB.setText("B) " + (options.size() > 1 ? options.get(1) : ""));
                btnOptC.setText("C) " + (options.size() > 2 ? options.get(2) : ""));
                btnOptD.setText("D) " + (options.size() > 3 ? options.get(3) : ""));
                btnOptC.setVisible(true);
                btnOptD.setVisible(true);
            }
        }
    }



    private void stopTimer() {
        if (questionTimer != null && questionTimer.isRunning()) {
            questionTimer.stop();
        }
    }

    private void updateStatus() {
        if (player == null || battleManager == null) return;
        Enemy enemy = battleManager.getEnemy();

        lblPlayerHealth.setText(String.format("%s | HP: %d/%d | ATK: %d | DEF: %d",
                player.getName(), player.getHealth(), player.getMaxHealth(),
                player.getDamage(), player.getDefense()));

        lblEnemyHealth.setText(String.format("%s | HP: %d/%d | ATK: %d | DEF: %d",
                enemy.getName(), enemy.getHealth(), enemy.getMaxHealth(),
                enemy.getDamage(), enemy.getDefense()));
    }

    private Difficulty calculateDefaultDifficulty() {
        return switch (currentBattleIndex) {
            case 0 -> Difficulty.EASY;
            case 1 -> Difficulty.MEDIUM;
            default -> Difficulty.HARD;
        };
    }


    private Difficulty askFortuneTellerDifficulty() {
        String[] options = {"EASY", "MEDIUM", "HARD"};
        String choice = (String) JOptionPane.showInputDialog(this,
                "[Cartomante] Filtre a dificuldade da rodada:",
                "Habilidade: Escolha de Dificuldade",
                JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
        if (choice != null) return Difficulty.valueOf(choice);
        return calculateDefaultDifficulty();
    }

    private void initEnemies() {
        enemyFactories = Arrays.asList(
                () -> new Enemy("Bloatware",  30,  30,  5,  1,  0, "Pré-instalado!"),
                () -> new Enemy("Adware",     60,  60, 10, 10,  5, "Temos ofertas para você!"),
                () -> new Enemy("Worm",      120, 120, 20, 15,  10, "Espalhando cópias..."),
                () -> new Enemy("Spyware",   200, 200,  15,  1,  10, "Observando..."),
                () -> new Enemy("Ransomware", 50,  50,  5,  1, 40, "Dados criptografados!"),
                () -> new Enemy("R.A.T.",    300, 300, 20, 20, 25, "Controle absoluto.")
        );
    }

    private void spawnFreshEnemies() {
        enemies = enemyFactories.stream()
                .map(Supplier::get)
                .collect(java.util.stream.Collectors.toList());
    }
}