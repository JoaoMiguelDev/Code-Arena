package game;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.battle.BattleManager;
import model.character.*;
import model.character.Character;
import model.question.*;

public class Game {
    private Scanner Scanner;
    private Character Player;
    private int CurrentBattleIndex;
    private List<Character> Enemies;
    private GameState State;
    private BattleManager CurrentBattle;

    public enum GameState{
        MENU, CHARACTER_SELECT, BATTLE, BATTLE_RESULT, GAME_OVER, VICTORY
    }

    public Game(){
        this.Scanner = new Scanner(System.in);
        this.CurrentBattleIndex = 0;
        this.State = GameState.MENU;
        this.Enemies = new ArrayList<>();
    }

    public void Start(){
        ShowMainMenu();
    }

    public void ShowMainMenu(){
        while(State == GameState.MENU){
            System.out.println("\n" + "=".repeat(50));
            System.out.println("MENU PRINCIPAL");
            System.out.println("=".repeat(50));
            System.out.println("1️ --- Novo Jogo");
            System.out.println("2 --- Como Jogar");
            System.out.println("3 --- Sair");
            System.out.println("=".repeat(50));
            System.out.print("Escolha uma opção: ");

            String option = Scanner.nextLine().trim();

            switch (option){
                case "1":
                    StartNewGame();
                    break;
                case "2":
                    TeachPlayer();
                    break;
                case "3":
                    System.out.println("Bye bye!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente!");
                    break;
            }
        }
    }

    public void StartNewGame(){
        System.out.println("\nComeçando jogo...");
        Player = SelectCharacter();
        SetEnemyWave();
        State = GameState.BATTLE;
        StartBattle();
    }

    public void TeachPlayer(){
        System.out.println("\nCOMO JOGAR");
        System.out.println("=".repeat(50));
        System.out.println("OBJETIVO:");
        System.out.println("   Derrote todos os inimigos respondendo perguntas corretamente!");
        System.out.println();
        System.out.println(" MECÂNICAS:");
        System.out.println("   - Cada pergunta tem uma dificuldade!");
        System.out.println("   - Acertar causa dano no inimigo");
        System.out.println("   - Quanto maior dificuldade da pergunta, maior o dano");
        System.out.println("   - Cada personagem possui habilidades próprias");
        System.out.println();
        System.out.println(" TIPOS DE PERGUNTA:");
        System.out.println("   - Múltipla Escolha: Responda A, B, C ou D");
        System.out.println("   - Verdadeiro/Falso: Responda A (Verdadeiro) ou B (Falso)");
        System.out.println("=".repeat(50));

        System.out.print("\nPressione ENTER para voltar ao menu...");
        Scanner.nextLine();
        State = GameState.MENU;
        ShowMainMenu();
    }

    public Character SelectCharacter(){
        System.out.println("\nESCOLHA SEU PERSONAGEM");
        System.out.println("=".repeat(50));
        System.out.println("1 - VAMPIRO - Equilibrado");
        System.out.println("   Vida: 120 | Ataque: 10 | Velocidade: 5");
        System.out.println("   Habilidade: Recupera 15 de vida ao acertar");
        System.out.println();
        System.out.println("2 - CARTOMANTE - Tanque");
        System.out.println("   Vida: 180 | Ataque: 5 | Velocidade: 2");
        System.out.println("   Habilidade: Por rodada, pode escolher a dificuldade das questões e eliminar uma alternativa errada ");
        System.out.println();
        System.out.println("3 - BOBO - Dano alto");
        System.out.println("   Vida: 80 | Ataque: 40 | Velocidade: 10");
        System.out.println("   Habilidade: Errar é o mesmo que acertar uma questão fácil, porém recebe o dobro do dano");
        System.out.println("=".repeat(50));

        while (true) {
            System.out.print("Escolha (1-3): ");
            String choice = Scanner.nextLine().trim();

            switch (choice) {
                case "1":
                    System.out.println("Você escolheu VAMPIRO!");
                    return new Vampire();
                case "2":
                    System.out.println("Você escolheu CARTOMANTE!");
                    return new FortuneTeller();
                case "3":
                    System.out.println("Você escolheu BOBO!");
                    return new Fool();
            }
        }
    }

    private void SetEnemyWave(){
        this.Enemies.clear();

        Enemies.add(new Enemy("Bloatware", 60, 60, 8, 1, 0));

        Enemies.add(new Enemy("Worm", 100, 100, 12, 4, 2));

        Enemies.add(new Enemy("Rat", 150, 150, 15, 6, 4));
    }

    private void StartBattle(){
        if(CurrentBattleIndex >= Enemies.size()){
            State = GameState.VICTORY;
            ShowVictory();
            return;
        }
        Character currentEnemy = Enemies.get(CurrentBattleIndex);
        System.out.println("\n" + "-".repeat(30));
        System.out.println("BATALHA " + (CurrentBattleIndex + 1) + "/" + Enemies.size());
        System.out.println("-".repeat(30));

        CurrentBattle = new BattleManager(Player, currentEnemy, CurrentBattleIndex + 1);
        CurrentBattle.PrepareQuestions(CalculateQuestionDifficulty());
        CurrentBattle.ExecuteBattle(Scanner);

        ProcessBattleResult();

    }

    private void ShowVictory(){
        System.out.println("\n" + "+".repeat(25));
        System.out.println("+ PARABÉNS! VOCÊ ZEROU O CODEARENA! +");
        System.out.println("+".repeat(25));

        System.out.println("\nVOCÊ DERROTOU TODOS OS INIMIGOS!");
        System.out.println("   Batalhas vencidas: " + CurrentBattleIndex + "/" + Enemies.size());

        System.out.println("\nDeseja jogar novamente?");
        System.out.print("(S/N): ");
        String choice = Scanner.nextLine().trim().toUpperCase();

        if (choice.equals("S")) {
            ResetGame();
            StartNewGame();
        } else {
            System.out.println("\nObrigado por jogar! Você é um verdadeiro CodeMaster!");
            System.exit(0);
        }

    }

    private void ShowGameOver() {
        System.out.println("\n" + "-".repeat(25));
        System.out.println("- GAME OVER! -");
        System.out.println("-".repeat(25));

        System.out.println("\nDeseja jogar novamente?");
        System.out.print("(S/N): ");
        String choice = Scanner.nextLine().trim().toUpperCase();

        if (choice.equals("S")) {
            ResetGame();
            StartNewGame();
        } else {
            System.out.println("\nObrigado por jogar! Até a próxima!");
            System.exit(0);
        }
    }

    private Difficulty CalculateQuestionDifficulty(){
        switch(CurrentBattleIndex){
            case 0:
                return Difficulty.EASY;
            case 1:
                return Difficulty.MEDIUM;
            case 2:
                return Difficulty.HARD;
            default:
                return Difficulty.HARD;
        }
    }

    private void ProcessBattleResult(){
        System.out.println("\n" + "=".repeat(50));
        if (CurrentBattle.getBattleStatus() == BattleManager.BattleStatus.PLAYER_WON){
            System.out.println("VITÓRIA!");
            Player.HealCharacter();
            System.out.println("Seu personagem foi curado!");

            if (CurrentBattleIndex + 1 < Enemies.size()) {
                System.out.print("\nPressione ENTER para continuar para a próxima batalha...");
                Scanner.nextLine();
            }

            CurrentBattleIndex++;
            State = GameState.BATTLE;
            StartBattle();
        }
        else {
            State = GameState.GAME_OVER;
            ShowGameOver();
        }
    }

    private void ResetGame() {
        CurrentBattleIndex = 0;
        State = GameState.MENU;
    }

}
