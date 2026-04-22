package model.question;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuestionBank {
    private List<Question> questions;

    public QuestionBank() {
        this.questions = new ArrayList<>();
        InitializeQuestions();  // Carrega perguntas hardcoded
    }

    private void InitializeQuestions(){

        // ========================
        // EASY
        // ========================

        questions.add(new MultipleChoiceQuestion(
                "Qual estrutura de dados utiliza o princípio LIFO (Last In, First Out)?",
                Arrays.asList(
                        "Fila",
                        "Pilha",
                        "Árvore binária",
                        "Grafo"),
                1, Difficulty.EASY));

        questions.add(new MultipleChoiceQuestion(
                "Qual das alternativas representa corretamente a complexidade do algoritmo de busca binária?",
                Arrays.asList(
                        "O(n)",
                        "O(n²)",
                        "O(log n)",
                        "O(1)"),
                2, Difficulty.EASY));

        questions.add(new MultipleChoiceQuestion(
                "Em qual camada do modelo OSI o endereçamento IP é tratado?",
                Arrays.asList(
                        "Camada de Enlace",
                        "Camada de Rede",
                        "Camada de Transporte",
                        "Camada de Aplicação"),
                1, Difficulty.EASY));

        questions.add(new MultipleChoiceQuestion(
                "O que é um sistema operacional?",
                Arrays.asList(
                        "Um programa que edita textos",
                        "Um hardware responsável pelo processamento",
                        "Um software que gerencia recursos de hardware e fornece serviços aos programas",
                        "Um protocolo de comunicação em rede"),
                2, Difficulty.EASY));

        questions.add(new MultipleChoiceQuestion(
                "Qual porta TCP é usada por padrão pelo protocolo HTTP?",
                Arrays.asList(
                        "21",
                        "443",
                        "80",
                        "22"),
                2, Difficulty.EASY));

        questions.add(new TrueFalseQuestion(
                "A memória RAM é um tipo de memória volátil, ou seja, perde seus dados quando o computador é desligado.",
                true, Difficulty.EASY));

        questions.add(new TrueFalseQuestion(
                "Em lógica booleana, a operação AND retorna verdadeiro quando pelo menos um dos operandos é verdadeiro.",
                false, Difficulty.EASY));

        questions.add(new TrueFalseQuestion(
                "O protocolo TCP garante a entrega ordenada e confiável dos dados, ao contrário do UDP.",
                true, Difficulty.EASY));

        questions.add(new TrueFalseQuestion(
                "Em programação orientada a objetos, herança permite que uma classe filha reutilize atributos e métodos de uma classe pai.",
                true, Difficulty.EASY));

        questions.add(new TrueFalseQuestion(
                "Um compilador traduz o código-fonte de um programa e o executa linha por linha, simultaneamente.",
                false, Difficulty.EASY));

        // ========================
        // MEDIUM
        // ========================

        questions.add(new MultipleChoiceQuestion(
                "Qual algoritmo de ordenação possui complexidade O(n log n) no pior caso?",
                Arrays.asList(
                        "Quick Sort",
                        "Bubble Sort",
                        "Merge Sort",
                        "Insertion Sort"),
                2, Difficulty.MEDIUM));

        questions.add(new MultipleChoiceQuestion(
                "Em um banco de dados relacional, o que garante que uma coluna em uma tabela referencie corretamente um registro existente em outra tabela?",
                Arrays.asList(
                        "Chave primária",
                        "Índice",
                        "Chave estrangeira",
                        "Constraint NOT NULL"),
                2, Difficulty.MEDIUM));

        questions.add(new MultipleChoiceQuestion(
                "Qual é o resultado da operação binária 1010 XOR 1100?",
                Arrays.asList(
                        "1110",
                        "0110",
                        "1000",
                        "0010"),
                1, Difficulty.MEDIUM));

        questions.add(new MultipleChoiceQuestion(
                "No contexto de gerenciamento de memória, o que é um 'deadlock'?",
                Arrays.asList(
                        "Quando um processo consome toda a memória RAM disponível",
                        "Quando dois ou mais processos ficam bloqueados esperando recursos que o outro detém",
                        "Quando o sistema operacional encerra um processo por falta de memória",
                        "Quando um ponteiro referencia um endereço de memória inválido"),
                1, Difficulty.MEDIUM));

        questions.add(new MultipleChoiceQuestion(
                "Qual paradigma de programação trata funções como cidadãs de primeira classe e evita mudança de estado e dados mutáveis?",
                Arrays.asList(
                        "Orientado a objetos",
                        "Imperativo",
                        "Funcional",
                        "Procedural"),
                2, Difficulty.MEDIUM));

        questions.add(new TrueFalseQuestion(
                "Na notação Big-O, O(n²) é mais eficiente que O(n log n) para grandes entradas.",
                false, Difficulty.MEDIUM));

        questions.add(new TrueFalseQuestion(
                "O padrão de projeto Singleton garante que uma classe tenha apenas uma instância durante toda a execução do programa.",
                true, Difficulty.MEDIUM));

        questions.add(new TrueFalseQuestion(
                "Em redes de computadores, o protocolo ARP é responsável por mapear endereços IP em endereços MAC.",
                true, Difficulty.MEDIUM));

        questions.add(new TrueFalseQuestion(
                "Uma árvore binária de busca (BST) balanceada garante complexidade O(log n) para inserção e busca no pior caso, mesmo sem nenhum mecanismo adicional de balanceamento.",
                false, Difficulty.MEDIUM));

        questions.add(new TrueFalseQuestion(
                "O conceito de polimorfismo em orientação a objetos permite que um mesmo método se comporte de formas diferentes dependendo do objeto que o invoca.",
                true, Difficulty.MEDIUM));

        // ========================
        // HARD
        // ========================

        questions.add(new MultipleChoiceQuestion(
                "Em um sistema com paginação de memória, qual problema ocorre quando um processo acessa uma página que não está carregada na memória física?",
                Arrays.asList(
                        "Buffer overflow",
                        "Page fault",
                        "Segmentation fault",
                        "Cache miss"),
                1, Difficulty.HARD));

        questions.add(new MultipleChoiceQuestion(
                "Qual das seguintes afirmações descreve corretamente o Teorema CAP em sistemas distribuídos?",
                Arrays.asList(
                        "Um sistema distribuído pode garantir simultaneamente Consistência, Disponibilidade e Tolerância a Partições",
                        "Um sistema distribuído pode garantir no máximo duas das três propriedades: Consistência, Disponibilidade e Tolerância a Partições",
                        "Consistência e Disponibilidade são sempre sacrificadas em favor da Tolerância a Partições",
                        "O Teorema CAP se aplica apenas a bancos de dados relacionais"),
                1, Difficulty.HARD));

        questions.add(new MultipleChoiceQuestion(
                "Na arquitetura RISC-V, o que diferencia instruções do tipo R das do tipo I?",
                Arrays.asList(
                        "Instruções tipo R operam apenas com memória; tipo I operam com registradores",
                        "Instruções tipo R utilizam três registradores como operandos; tipo I utilizam dois registradores e um imediato",
                        "Instruções tipo R são de 16 bits; tipo I são de 32 bits",
                        "Instruções tipo R são exclusivas para operações de ponto flutuante"),
                1, Difficulty.HARD));

        questions.add(new MultipleChoiceQuestion(
                "Qual técnica de sincronização garante exclusão mútua sem utilizar espera ocupada (busy waiting)?",
                Arrays.asList(
                        "Spinlock",
                        "Variável de condição com mutex",
                        "Test-and-Set",
                        "Polling"),
                1, Difficulty.HARD));

        questions.add(new MultipleChoiceQuestion(
                "Considerando a complexidade de tempo, qual é o limite inferior teórico (lower bound) para algoritmos de ordenação baseados em comparação?",
                Arrays.asList(
                        "O(n)",
                        "O(n log n)",
                        "O(log n)",
                        "O(n²)"),
                1, Difficulty.HARD));

        questions.add(new TrueFalseQuestion(
                "Em compiladores, a análise semântica é responsável por verificar se a estrutura sintática do código-fonte está correta, como o balanceamento de chaves e parênteses.",
                false, Difficulty.HARD));

        questions.add(new TrueFalseQuestion(
                "O algoritmo de Dijkstra falha ao encontrar o caminho mínimo em grafos que possuem arestas com peso negativo.",
                true, Difficulty.HARD));

        questions.add(new TrueFalseQuestion(
                "Em criptografia assimétrica, uma mensagem cifrada com a chave pública de um destinatário só pode ser decifrada com a chave privada correspondente desse mesmo destinatário.",
                true, Difficulty.HARD));

        questions.add(new TrueFalseQuestion(
                "O escalonamento Round-Robin com quantum infinito se comporta de forma equivalente ao escalonamento FCFS (First Come, First Served).",
                true, Difficulty.HARD));

        questions.add(new TrueFalseQuestion(
                "Em redes neurais profundas, o problema de vanishing gradient ocorre predominantemente nas camadas iniciais da rede e é agravado pelo uso da função de ativação ReLU.",
                false, Difficulty.HARD));
    }
}
