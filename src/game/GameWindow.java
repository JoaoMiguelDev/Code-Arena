package game;

import model.character.Character;
import model.character.*;
import model.question.Question;
import model.question.QuestionBank;
import model.question.Difficulty;

import javax.swing.*;
import java.awt.*;
import java.util.Collections;
import java.util.List;

public class GameWindow extends JFrame {
    private CardLayout cardLayout;
    private JPanel mainPanel;

    // Estado do Jogo
    private Character player;
    private Enemy currentEnemy;
    private int currentBattleIndex = 0;
    private List<Enemy> enemies;
    private List<Question> currentQuestions;
    private int questionIndex = 0;

    // Componentes da Tela de Batalha
    private JTextArea txtLog;
    private JLabel lblPlayerHealth, lblEnemyHealth, lblQuestionText;
    private JButton btnOptA, btnOptB, btnOptC, btnOptD;

    public GameWindow() {
        setTitle("CodeArena RPG");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(700, 500);
        setLocationRelativeTo(null);

        cardLayout = new CardLayout();
        mainPanel = new JPanel(cardLayout);

        // Inicializa as telas
        mainPanel.add(createMenuPanel(), "MENU");
        mainPanel.add(createCharacterSelectPanel(), "CHAR_SELECT");
        mainPanel.add(createBattlePanel(), "BATTLE");
        mainPanel.add(createHowToPlayPanel(), "HOW_TO_PLAY");

        add(mainPanel);
        initEnemies();
    }

    private JPanel createMenuPanel() {
        JPanel panel = new JPanel(new GridBagLayout());
        panel.setBackground(new Color(43, 43, 43));
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0; gbc.gridy = GridBagConstraints.RELATIVE;
        gbc.insets = new Insets(10, 10, 10, 10);

        JLabel title = new JLabel("CODEARENA");
        title.setFont(new Font("Monospaced", Font.BOLD, 36));
        title.setForeground(Color.GREEN);
        panel.add(title, gbc);

        JButton btnNewGame = createStyledButton("Novo Jogo");
        btnNewGame.addActionListener(e -> cardLayout.show(mainPanel, "CHAR_SELECT"));
        panel.add(btnNewGame, gbc);

        JButton btnHowToPlay = createStyledButton("Como Jogar");
        btnHowToPlay.addActionListener(e -> cardLayout.show(mainPanel, "HOW_TO_PLAY"));
        panel.add(btnHowToPlay, gbc);

        JButton btnExit = createStyledButton("Sair");
        btnExit.addActionListener(e -> System.exit(0));
        panel.add(btnExit, gbc);

        return panel;
    }

    private JPanel createCharacterSelectPanel() {
        JPanel panel = new JPanel(new GridLayout(1, 3, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        panel.setBackground(new Color(43, 43, 43));

        panel.add(createCharCard("Vampiro", "Vida: 120 | Atk: 25\nHabilidade:\nRecupera 15 de vida\nao acertar.", () -> player = new Vampire()));
        panel.add(createCharCard("Cartomante", "Vida: 180 | Atk: 15\nHabilidade:\nRemove uma alternativa\nerrada.", () -> player = new FortuneTeller()));
        panel.add(createCharCard("Bobo", "Vida: 80 | Atk: 40\nHabilidade:\nErrar causa dano,\nmas recebe o dobro.", () -> player = new Fool()));

        return panel;
    }

    private JPanel createCharCard(String name, String desc, Runnable selectAction) {
        JPanel card = new JPanel(new BorderLayout());
        card.setBorder(BorderFactory.createLineBorder(Color.GRAY, 2));
        card.setBackground(new Color(60, 63, 65));

        JLabel lblName = new JLabel(name, SwingConstants.CENTER);
        lblName.setFont(new Font("SansSerif", Font.BOLD, 18));
        lblName.setForeground(Color.WHITE);

        JTextArea txtDesc = new JTextArea(desc);
        txtDesc.setEditable(false);
        txtDesc.setBackground(new Color(60, 63, 65));
        txtDesc.setForeground(Color.LIGHT_GRAY);
        txtDesc.setFont(new Font("SansSerif", Font.PLAIN, 12));

        JButton btnSelect = createStyledButton("Escolher");
        btnSelect.addActionListener(e -> {
            selectAction.run();
            startNewGame();
        });

        card.add(lblName, BorderLayout.NORTH);
        card.add(txtDesc, BorderLayout.CENTER);
        card.add(btnSelect, BorderLayout.SOUTH);
        return card;
    }

    private JPanel createHowToPlayPanel() {
        JPanel panel = new JPanel(new BorderLayout(10, 10));
        panel.setBackground(new Color(43, 43, 43));
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        // Título da Tela
        JLabel title = new JLabel("COMO JOGAR", SwingConstants.CENTER);
        title.setFont(new Font("Monospaced", Font.BOLD, 28));
        title.setForeground(Color.GREEN);
        panel.add(title, BorderLayout.NORTH);

        // Conteúdo das Instruções
        JEditorPane txtInstructions = new JEditorPane();
        txtInstructions.setContentType("text/html");
        txtInstructions.setEditable(false);
        txtInstructions.setBackground(new Color(60, 63, 65));

        String htmlContent = "<html><body style='font-family:SansSerif; color:white; font-size:12px; padding:10px;'>"
                + "<h2 style='color: #4682B4; margin-top:0;'>🎯 OBJETIVO</h2>"
                + "<p>Derrote todos os inimigos da arena respondendo perguntas de programação corretamente!</p>"

                + "<h2 style='color: #4682B4;'>⚔️ MECÂNICAS</h2>"
                + "<ul>"
                + "  <li>Cada pergunta possui uma dificuldade (Fácil, Médio, Difícil).</li>"
                + "  <li>Acertar a pergunta faz seu herói atacar o inimigo.</li>"
                + "  <li>Quanto maior a dificuldade da pergunta, maior o dano causado!</li>"
                + "  <li>Mas cuidado: errar a resposta permite que o inimigo te contra-ataque.</li>"
                + "  <li>Cada herói possui <b>habilidades passivas exclusivas</b> que mudam a gameplay!</li>"
                + "</ul>"

                + "<h2 style='color: #4682B4;'>📝 TIPOS DE PERGUNTA</h2>"
                + "<ul>"
                + "  <li><b>Múltipla Escolha:</b> Escolha a alternativa correta entre as 4 opções (A, B, C ou D).</li>"
                + "  <li><b>Verdadeiro ou Falso:</b> Avalie a afirmação clicando em A (Verdadeiro) ou B (Falso).</li>"
                + "  <li><b>Preencher a Lacuna:</b> Uma caixa de texto surgirá na tela para você digitar o termo correto.</li>"
                + "  <li><b>⏱️ Cronometradas:</b> Questões com contagem regressiva! Responda antes que o tempo esgote.</li>"
                + "</ul>"
                + "</body></html>";

        txtInstructions.setText(htmlContent);
        JScrollPane scrollPane = new JScrollPane(txtInstructions);
        scrollPane.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        panel.add(scrollPane, BorderLayout.CENTER);

        // Botão Voltar
        JButton btnBack = createStyledButton("Voltar ao Menu");
        btnBack.addActionListener(e -> cardLayout.show(mainPanel, "MENU"));
        panel.add(btnBack, BorderLayout.SOUTH);

        return panel;
    }


    private JPanel createBattlePanel() {
        JPanel panel = new JPanel(new BorderLayout(10, 10));
        panel.setBackground(new Color(43, 43, 43));
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        // Placar de Vida
        JPanel pnlStatus = new JPanel(new GridLayout(1, 2));
        pnlStatus.setBackground(new Color(43, 43, 43));
        lblPlayerHealth = new JLabel("Jogador: --", SwingConstants.LEFT);
        lblPlayerHealth.setForeground(Color.CYAN);
        lblEnemyHealth = new JLabel("Inimigo: --", SwingConstants.RIGHT);
        lblEnemyHealth.setForeground(Color.ORANGE);
        pnlStatus.add(lblPlayerHealth);
        pnlStatus.add(lblEnemyHealth);
        panel.add(pnlStatus, BorderLayout.NORTH);

        // Texto da Pergunta e Histórico Central
        JPanel pnlCenter = new JPanel(new GridLayout(2, 1, 5, 5));
        pnlCenter.setBackground(new Color(43, 43, 43));

        lblQuestionText = new JLabel("Pergunta aqui...", SwingConstants.CENTER);
        lblQuestionText.setFont(new Font("SansSerif", Font.BOLD, 14));
        lblQuestionText.setForeground(Color.WHITE);

        txtLog = new JTextArea();
        txtLog.setEditable(false);
        txtLog.setBackground(Color.BLACK);
        txtLog.setForeground(Color.GREEN);
        JScrollPane scrollLog = new JScrollPane(txtLog);

        pnlCenter.add(lblQuestionText);
        pnlCenter.add(scrollLog);
        panel.add(pnlCenter, BorderLayout.CENTER);

        // Botões de Alternativas
        JPanel pnlOptions = new JPanel(new GridLayout(2, 2, 5, 5));
        pnlOptions.setBackground(new Color(43, 43, 43));
        btnOptA = createStyledButton("A"); btnOptA.addActionListener(e -> handleAnswer("A"));
        btnOptB = createStyledButton("B"); btnOptB.addActionListener(e -> handleAnswer("B"));
        btnOptC = createStyledButton("C"); btnOptC.addActionListener(e -> handleAnswer("C"));
        btnOptD = createStyledButton("D"); btnOptD.addActionListener(e -> handleAnswer("D"));

        pnlOptions.add(btnOptA); pnlOptions.add(btnOptB);
        pnlOptions.add(btnOptC); pnlOptions.add(btnOptD);
        panel.add(pnlOptions, BorderLayout.SOUTH);

        return panel;
    }

    private void startNewGame() {
        currentBattleIndex = 0;
        txtLog.setText("Jogo Iniciado! Prepare-se para a batalha.\n");
        cardLayout.show(mainPanel, "BATTLE");
        nextBattle();
    }

    private void nextBattle() {
        if (currentBattleIndex >= enemies.size()) {
            JOptionPane.showMessageDialog(this, "🏆 PARABÉNS! Você zerou o CodeArena!");
            cardLayout.show(mainPanel, "MENU");
            return;
        }

        currentEnemy = enemies.get(currentBattleIndex);
        txtLog.append("\n⚔️ Batalha " + (currentBattleIndex + 1) + ": " + currentEnemy.getName() + " apareceu!\n");

        // Carrega perguntas baseadas no índice
        QuestionBank bank = new QuestionBank();
        Difficulty diff = (currentBattleIndex < 2) ? Difficulty.EASY : (currentBattleIndex < 4 ? Difficulty.MEDIUM : Difficulty.HARD);
        currentQuestions = bank.FilterByDifficulty(diff);
        Collections.shuffle(currentQuestions);
        questionIndex = 0;

        showNextQuestion();
    }

    private void showNextQuestion() {
        updateStatus();

        // Verifica se ainda há perguntas
        if (questionIndex >= currentQuestions.size()) {
            questionIndex = 0;
            Collections.shuffle(currentQuestions);
        }

        Question q = currentQuestions.get(questionIndex);

        // Define o enunciado da pergunta
        lblQuestionText.setText("<html><body style='width: 400px; text-align: center;'>" +
                q.getText() + "</body></html>");

        // Lógica para configurar os botões baseada no tipo de pergunta
        if (q instanceof model.question.MultipleChoiceQuestion) {
            model.question.MultipleChoiceQuestion mcq = (model.question.MultipleChoiceQuestion) q;
            List<String> options = mcq.getOptions();

            // Mostra todos os botões e define o texto de cada opção
            btnOptA.setText("A) " + options.get(0));
            btnOptB.setText("B) " + options.get(1));
            btnOptC.setText("C) " + options.get(2));
            btnOptD.setText("D) " + options.get(3));

            btnOptC.setVisible(true);
            btnOptD.setVisible(true);

        } else if (q instanceof model.question.TrueFalseQuestion) {
            // Para Verdadeiro ou Falso
            btnOptA.setText("A) Verdadeiro");
            btnOptB.setText("B) Falso");

            // Esconde os botões C e D
            btnOptC.setVisible(false);
            btnOptD.setVisible(false);

        } else if (q instanceof model.question.FillBlankQuestion) {
            String resposta = JOptionPane.showInputDialog(this, q.getText(), "Preencha a lacuna", JOptionPane.QUESTION_MESSAGE);
            if (resposta != null) {
                handleAnswer(resposta);
            } else {
                questionIndex++;
                showNextQuestion();
            }
        }
    }

    private void handleAnswer(String ans) {
        Question q = currentQuestions.get(questionIndex);

        // Se o clique veio de um botão (A, B, C, D), extrai apenas a primeira letra
        String respostaProcessada = ans;
        if (ans.contains(")")) {
            respostaProcessada = ans.substring(0, ans.indexOf(")")).trim();
        }

        // Valida a resposta usando a lógica que você já tinha criado
        boolean correct = q.CheckAnswer(respostaProcessada);

        if (correct) {
            int dmg = player.getDamage() * q.getDifficulty().getBaseDamage();
            currentEnemy.TakeDamage(dmg);
            txtLog.append("💥 Você ACERTOU e causou " + dmg + " de dano!\n");
        } else {
            int dmgInimigo = currentEnemy.getDamage();
            player.TakeDamage(dmgInimigo);
            txtLog.append("❌ Você ERROU! O inimigo revidou e te deu " + dmgInimigo + " de dano.\n");
        }

        // Rola o log de texto automaticamente para baixo
        txtLog.setCaretPosition(txtLog.getDocument().getLength());

        questionIndex++;
        checkBattleConditions();
    }

    private void checkBattleConditions() {
        updateStatus();
        if (!currentEnemy.IsAlive()) {
            txtLog.append("\n🎉 Você derrotou " + currentEnemy.getName() + "!\n");
            player.HealCharacter();
            currentBattleIndex++;
            nextBattle();
        } else if (!player.IsAlive()) {
            JOptionPane.showMessageDialog(this, "💀 GAME OVER! Seu herói foi derrotado.");
            cardLayout.show(mainPanel, "MENU");
        } else {
            showNextQuestion();
        }
    }

    private void updateStatus() {
        lblPlayerHealth.setText("Seu HP: " + player.getHealth() + "/" + player.getMaxHealth());
        lblEnemyHealth.setText(currentEnemy.getName() + " HP: " + currentEnemy.getHealth() + "/" + currentEnemy.getMaxHealth());
    }

    private void initEnemies() {
        enemies = java.util.Arrays.asList(
                new Enemy("Bloatware", 30, 30, 5, 1, 0, "pré-instalado!"),
                new Enemy("Adware", 60, 60, 10, 10, 0, "Temos algo para você!"),
                new Enemy("Worm", 100, 100, 15, 15, 2, "Espalhando cópias...")
        );
    }

    // Estilo padrão de botões UI
    private JButton createStyledButton(String text) {
        JButton btn = new JButton(text);
        btn.setFont(new Font("SansSerif", Font.BOLD, 14));
        btn.setBackground(new Color(70, 130, 180));
        btn.setForeground(Color.WHITE);
        btn.setFocusPainted(false);
        return btn;
    }
}