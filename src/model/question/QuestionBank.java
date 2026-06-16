package model.question;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class QuestionBank {
    private List<Question> questions;

    public QuestionBank() {
        this.questions = new ArrayList<>();
        InitializeQuestions();
    }

    private void InitializeQuestions(){

        // =========================================================================
        // EASY (40 Questões: 10 MCQ, 10 TF, 10 TIMED, 10 BLANK)
        // =========================================================================

        // --- MCQ (1 a 10) ---
        questions.add(new MultipleChoiceQuestion("Qual estrutura de dados utiliza o princípio LIFO (Last In, First Out)?", Arrays.asList("Fila", "Pilha", "Árvore binária", "Grafo"), 1, Difficulty.EASY));
        questions.add(new MultipleChoiceQuestion("Qual das alternativas representa corretamente a complexidade do algoritmo de busca binária?", Arrays.asList("O(n)", "O(n²)", "O(log n)", "O(1)"), 2, Difficulty.EASY));
        questions.add(new MultipleChoiceQuestion("Em qual camada do modelo OSI o endereçamento IP é tratado?", Arrays.asList("Camada de Enlace", "Camada de Rede", "Camada de Transporte", "Camada de Aplicação"), 1, Difficulty.EASY));
        questions.add(new MultipleChoiceQuestion("O que é um sistema operacional?", Arrays.asList("Um programa que edita textos", "Um hardware responsável pelo processamento", "Um software que gerencia recursos de hardware e fornece serviços aos programas", "Um protocolo de comunicação em rede"), 2, Difficulty.EASY));
        questions.add(new MultipleChoiceQuestion("Qual porta TCP é usada por padrão pelo protocolo HTTP?", Arrays.asList("21", "443", "80", "22"), 2, Difficulty.EASY));
        questions.add(new MultipleChoiceQuestion("Qual palavra-chave em Java impede que uma classe seja herdada?", Arrays.asList("static", "abstract", "final", "private"), 2, Difficulty.EASY));
        questions.add(new MultipleChoiceQuestion("Qual comando SQL é utilizado para extrair dados de uma tabela?", Arrays.asList("GET", "EXTRACT", "SELECT", "OPEN"), 2, Difficulty.EASY));
        questions.add(new MultipleChoiceQuestion("Qualタグ HTML é utilizada para criar uma quebra de linha?", Arrays.asList("<lb>", "<break>", "<br>", "<p>"), 2, Difficulty.EASY));
        questions.add(new MultipleChoiceQuestion("No Git, qual comando cria uma cópia local de um repositório remoto?", Arrays.asList("git fetch", "git pull", "git clone", "git copy"), 2, Difficulty.EASY));
        questions.add(new MultipleChoiceQuestion("Qual dos seguintes componentes é o cérebro do computador, responsável pela execução de instruções?", Arrays.asList("RAM", "SSD", "CPU", "GPU"), 2, Difficulty.EASY));

        // --- TF (11 a 20) ---
        questions.add(new TrueFalseQuestion("A memória RAM é um tipo de memória volátil, ou seja, perde seus dados quando o computador é desligado.", true, Difficulty.EASY));
        questions.add(new TrueFalseQuestion("Em lógica booleana, a operação AND retorna verdadeiro quando pelo menos um dos operandos é verdadeiro.", false, Difficulty.EASY));
        questions.add(new TrueFalseQuestion("O protocolo TCP garante a entrega ordenada e confiável dos dados, ao contrário do UDP.", true, Difficulty.EASY));
        questions.add(new TrueFalseQuestion("Em programação orientada a objetos, herança permite que uma classe filha reutilize atributos e métodos de uma classe pai.", true, Difficulty.EASY));
        questions.add(new TrueFalseQuestion("Um compilador traduz o código-fonte de um programa e o executa linha por linha, simultaneamente.", false, Difficulty.EASY));
        questions.add(new TrueFalseQuestion("O protocolo HTTPS utiliza criptografia para garantir uma comunicação mais segura que o HTTP.", true, Difficulty.EASY));
        questions.add(new TrueFalseQuestion("Um arquivo com a extensão .exe é nativamente executável no sistema operacional Linux.", false, Difficulty.EASY));
        questions.add(new TrueFalseQuestion("Em JavaScript, as variáveis declaradas com 'const' podem ter seus valores reatribuídos livremente.", false, Difficulty.EASY));
        questions.add(new TrueFalseQuestion("A arquitetura cliente-servidor envolve um cliente que faz requisições e um servidor que fornece respostas.", true, Difficulty.EASY));
        questions.add(new TrueFalseQuestion("Algoritmos de ordenação servem unicamente para organizar números em ordem decrescente.", false, Difficulty.EASY));

        // --- TIMED (21 a 30) ---
        questions.add(new TimedMultipleChoiceQuestion("[CRONOMETRADA] Qual operador lógico representa a negação (NOT) em Java?", Arrays.asList("&", "|", "!", "~"), 2, Difficulty.EASY, 10));
        questions.add(new TimedMultipleChoiceQuestion("[CRONOMETRADA] Qual é a extensão padrão de arquivos de código-fonte Java compilados?", Arrays.asList(".java", ".exe", ".class", ".jar"), 2, Difficulty.EASY, 10));
        questions.add(new TimedMultipleChoiceQuestion("[CRONOMETRADA] Quantos bits existem em um único Byte?", Arrays.asList("4", "8", "16", "32"), 1, Difficulty.EASY, 10));
        questions.add(new TimedMultipleChoiceQuestion("[CRONOMETRADA] Qual bloco é usado para capturar exceções em Java?", Arrays.asList("catch", "throw", "try", "finally"), 0, Difficulty.EASY, 10));
        questions.add(new TimedMultipleChoiceQuestion("[CRONOMETRADA] Qual é o valor padrão para um atributo booleano não inicializado em uma classe Java?", Arrays.asList("true", "null", "false", "0"), 2, Difficulty.EASY, 10));
        questions.add(new TimedMultipleChoiceQuestion("[CRONOMETRADA] Qual comando SQL é usado para apagar uma tabela inteira e sua estrutura?", Arrays.asList("DELETE", "TRUNCATE", "DROP", "REMOVE"), 2, Difficulty.EASY, 10));
        questions.add(new TimedMultipleChoiceQuestion("[CRONOMETRADA] No CSS, qual símbolo é utilizado para selecionar um elemento por seu ID?", Arrays.asList(".", "#", "*", "@"), 1, Difficulty.EASY, 10));
        questions.add(new TimedMultipleChoiceQuestion("[CRONOMETRADA] Qual das estruturas abaixo armazena chaves exclusivas associadas a valores?", Arrays.asList("List", "Set", "Map", "Queue"), 2, Difficulty.EASY, 10));
        questions.add(new TimedMultipleChoiceQuestion("[CRONOMETRADA] Qual método é o ponto de entrada principal de execução em uma aplicação Java standalone?", Arrays.asList("start()", "init()", "main()", "run()"), 2, Difficulty.EASY, 10));
        questions.add(new TimedMultipleChoiceQuestion("[CRONOMETRADA] Qual protocolo é responsável por atribuir endereços IP dinamicamente a dispositivos em uma rede?", Arrays.asList("DNS", "DHCP", "FTP", "SMTP"), 1, Difficulty.EASY, 10));

        // --- BLANK (31 a 40) ---
        questions.add(new FillBlankQuestion("A estrutura de dados linear que segue o princípio FIFO (First In, First Out) chama-se _______.", "fila", Difficulty.EASY));
        questions.add(new FillBlankQuestion("O protocolo padrão utilizado para o envio de e-mails na internet é o _______.", "smtp", Difficulty.EASY));
        questions.add(new FillBlankQuestion("Em Java, o método utilizado para imprimir uma linha no console é System.out._______.", "println", Difficulty.EASY));
        questions.add(new FillBlankQuestion("O formato de dados textual baseado em pares chave-valor muito usado em APIs chama-se _______.", "json", Difficulty.EASY));
        questions.add(new FillBlankQuestion("A linguagem de marcação padrão utilizada para estruturar páginas web é o _______.", "html", Difficulty.EASY));
        questions.add(new FillBlankQuestion("O comando Git utilizado para enviar as alterações do repositório local para o remoto é o git _______.", "push", Difficulty.EASY));
        questions.add(new FillBlankQuestion("Em bancos de dados relacionais, SQL significa Structured _______ Language.", "query", Difficulty.EASY));
        questions.add(new FillBlankQuestion("O tipo de dado primitivo em Java usado para armazenar um único caractere é o _______.", "char", Difficulty.EASY));
        questions.add(new FillBlankQuestion("A sigla do protocolo que converte nomes de domínio (como google.com) em endereços IP é _______.", "dns", Difficulty.EASY));
        questions.add(new FillBlankQuestion("A menor unidade de informação armazenada em um computador, contendo o valor 0 ou 1, é o _______.", "bit", Difficulty.EASY));


        // =========================================================================
        // MEDIUM (40 Questões: 10 MCQ, 10 TF, 10 TIMED, 10 BLANK)
        // =========================================================================

        // --- MCQ (41 a 50) ---
        questions.add(new MultipleChoiceQuestion("Qual algoritmo de ordenação possui complexidade O(n log n) no pior caso?", Arrays.asList("Quick Sort", "Bubble Sort", "Merge Sort", "Insertion Sort"), 2, Difficulty.MEDIUM));
        questions.add(new MultipleChoiceQuestion("Em um banco de dados relacional, o que garante que uma coluna em uma tabela referencie corretamente um registro existente em outra tabela?", Arrays.asList("Chave primária", "Índice", "Chave estrangeira", "Constraint NOT NULL"), 2, Difficulty.MEDIUM));
        questions.add(new MultipleChoiceQuestion("Qual é o resultado da operação binária 1010 XOR 1100?", Arrays.asList("1110", "0110", "1000", "0010"), 1, Difficulty.MEDIUM));
        questions.add(new MultipleChoiceQuestion("No contexto de gerenciamento de memória, o que é um 'deadlock'?", Arrays.asList("Quando um processo consome toda a memória RAM disponível", "Quando dois ou mais processos ficam bloqueados esperando recursos que o outro detém", "Quando o sistema operacional encerra um processo por falta de memória", "Quando um ponteiro referencia um endereço de memória inválido"), 1, Difficulty.MEDIUM));
        questions.add(new MultipleChoiceQuestion("Qual paradigma de programação trata funções como cidadãs de primeira classe e evita mudança de estado e dados mutáveis?", Arrays.asList("Orientado a objetos", "Imperativo", "Funcional", "Procedural"), 2, Difficulty.MEDIUM));
        questions.add(new MultipleChoiceQuestion("Qual padrão de projeto criacional foca em construir objetos complexos passo a passo?", Arrays.asList("Factory Method", "Builder", "Abstract Factory", "Prototype"), 1, Difficulty.MEDIUM));
        questions.add(new MultipleChoiceQuestion("No modelo MVC, qual componente é responsável por interceptar as requisições e gerenciar o fluxo de dados?", Arrays.asList("Model", "View", "Controller", "Router"), 2, Difficulty.MEDIUM));
        questions.add(new MultipleChoiceQuestion("Em redes, qual protocolo opera na camada de Transporte e fornece controle de fluxo sem garantia de entrega?", Arrays.asList("TCP", "UDP", "ICMP", "IGMP"), 1, Difficulty.MEDIUM));
        questions.add(new MultipleChoiceQuestion("O que o índice em um banco de dados relacional visa primariamente otimizar?", Arrays.asList("O espaço em disco", "A segurança dos dados", "A velocidade das consultas", "O isolamento de transações"), 2, Difficulty.MEDIUM));
        questions.add(new MultipleChoiceQuestion("Qual modificador de acesso em Java expõe o membro apenas para a própria classe, subclasses e classes do mesmo pacote?", Arrays.asList("public", "private", "protected", "default"), 2, Difficulty.MEDIUM));

        // --- TF (51 a 60) ---
        questions.add(new TrueFalseQuestion("Na notação Big-O, O(n²) é mais eficiente que O(n log n) para grandes entradas.", false, Difficulty.MEDIUM));
        questions.add(new TrueFalseQuestion("O padrão de projeto Singleton garante que uma classe tenha apenas uma instância durante toda a execução do programa.", true, Difficulty.MEDIUM));
        questions.add(new TrueFalseQuestion("Em redes de computadores, o protocolo ARP é responsável por mapear endereços IP em endereços MAC.", true, Difficulty.MEDIUM));
        questions.add(new TrueFalseQuestion("Uma árvore binária de busca (BST) balanceada garante complexidade O(log n) para inserção e busca no pior caso, mesmo sem nenhum mecanismo adicional de balanceamento.", false, Difficulty.MEDIUM));
        questions.add(new TrueFalseQuestion("O conceito de polimorfismo em orientação a objetos permite que um mesmo método se comporte de formas diferentes dependendo do objeto que o invoca.", true, Difficulty.MEDIUM));
        questions.add(new TrueFalseQuestion("Em bancos de dados relacionais, o comando ROLLBACK consolida definitivamente as alterações de uma transação.", false, Difficulty.MEDIUM));
        questions.add(new TrueFalseQuestion("No Git, o comando git stash remove permanentemente todas as suas modificações locais não commitadas.", false, Difficulty.MEDIUM));
        questions.add(new TrueFalseQuestion("As Strings em Java são objetos imutáveis, significando que seu valor não pode ser alterado após a criação.", true, Difficulty.MEDIUM));
        questions.add(new TrueFalseQuestion("Uma API RESTful obrigatoriamente utiliza o protocolo HTTP para sua comunicação.", true, Difficulty.MEDIUM));
        questions.add(new TrueFalseQuestion("A criptografia simétrica utiliza duas chaves matematicamente correlacionadas: uma pública e uma privada.", false, Difficulty.MEDIUM));

        // --- TIMED (61 a 70) ---
        questions.add(new TimedMultipleChoiceQuestion("[CRONOMETRADA] Qual comando Git é utilizado para mesclar ramificações mantendo o histórico linear?", Arrays.asList("git merge", "git rebase", "git clone", "git push"), 1, Difficulty.MEDIUM, 15));
        questions.add(new TimedMultipleChoiceQuestion("[CRONOMETRADA] Qual é o código de status HTTP padrão retornado para indicar que um recurso foi criado com sucesso?", Arrays.asList("200 OK", "201 Created", "202 Accepted", "204 No Content"), 1, Difficulty.MEDIUM, 15));
        questions.add(new TimedMultipleChoiceQuestion("[CRONOMETRADA] Qual método da classe Thread em Java faz com que a thread atual pause temporariamente sua execução?", Arrays.asList("yield()", "wait()", "sleep()", "stop()"), 2, Difficulty.MEDIUM, 15));
        questions.add(new TimedMultipleChoiceQuestion("[CRONOMETRADA] Em bancos de dados, qual propriedade do acrônimo ACID garante que uma transação ocorra totalmente ou não ocorra de forma alguma?", Arrays.asList("Atomicidade", "Consistência", "Isolamento", "Durabilidade"), 0, Difficulty.MEDIUM, 15));
        questions.add(new TimedMultipleChoiceQuestion("[CRONOMETRADA] No protocolo IPv4, qual é o número máximo de bits que compõem uma máscara de sub-rede completa?", Arrays.asList("16", "32", "64", "128"), 1, Difficulty.MEDIUM, 15));
        questions.add(new TimedMultipleChoiceQuestion("[CRONOMETRADA] No Linux, qual comando altera as permissões de acesso de um arquivo?", Arrays.asList("chown", "chmod", "chperm", "pwd"), 1, Difficulty.MEDIUM, 15));
        questions.add(new TimedMultipleChoiceQuestion("[CRONOMETRADA] Em Java, qual dessas coleções NÃO permite elementos duplicados?", Arrays.asList("ArrayList", "LinkedList", "HashSet", "Vector"), 2, Difficulty.MEDIUM, 15));
        questions.add(new TimedMultipleChoiceQuestion("[CRONOMETRADA] Qual padrão de arquitetura de software expõe as funcionalidades como pequenos serviços independentes e auto-contidos?", Arrays.asList("Monolítico", "SOA", "Microserviços", "Peer-to-Peer"), 2, Difficulty.MEDIUM, 15));
        questions.add(new TimedMultipleChoiceQuestion("[CRONOMETRADA] Qual das opções abaixo representa o pior caso de complexidade de tempo para o algoritmo Bubble Sort?", Arrays.asList("O(1)", "O(log n)", "O(n)", "O(n²)"), 3, Difficulty.MEDIUM, 15));
        questions.add(new TimedMultipleChoiceQuestion("[CRONOMETRADA] No ecossistema Docker, qual arquivo define os passos para se construir uma imagem personalizada?", Arrays.asList("docker-compose.yml", "Dockerfile", "image.config", "DockerApp"), 1, Difficulty.MEDIUM, 15));

        // --- BLANK (71 a 80) ---
        questions.add(new FillBlankQuestion("Em Java, a palavra-chave utilizada para herdar uma classe é _______.", "extends", Difficulty.MEDIUM));
        questions.add(new FillBlankQuestion("A palavra-chave usada para garantir que uma interface seja implementada por uma classe Java é _______.", "implements", Difficulty.MEDIUM));
        questions.add(new FillBlankQuestion("O comando SQL usado para juntar dados de duas ou mais tabelas relacionais com base em uma coluna comum é o _______.", "join", Difficulty.MEDIUM));
        questions.add(new FillBlankQuestion("A técnica de mapeamento objeto-relacional que conecta objetos Java a tabelas de banco de dados é abreviada como _______.", "orm", Difficulty.MEDIUM));
        questions.add(new FillBlankQuestion("O padrão de design comportamental que permite a objetos se inscreverem e receberem notificações de eventos de outro objeto é o _______.", "observer", Difficulty.MEDIUM));
        questions.add(new FillBlankQuestion("Em arquitetura de computadores, a memória volátil de alta velocidade interna do processador usada como intermediária da RAM é a memória _______.", "cache", Difficulty.MEDIUM));
        questions.add(new FillBlankQuestion("O utilitário de terminal do Git usado para ver a árvore com o histórico de commits efetuados é o git _______.", "log", Difficulty.MEDIUM));
        questions.add(new FillBlankQuestion("A cláusula SQL utilizada para filtrar registros agrupados pela instrução GROUP BY é a cláusula _______.", "having", Difficulty.MEDIUM));
        questions.add(new FillBlankQuestion("Em Java, um método que possui o mesmo nome da classe e serve para instanciar o objeto chama-se _______.", "construtor", Difficulty.MEDIUM));
        questions.add(new FillBlankQuestion("O processo de isolar o comportamento interno de um objeto ocultando seus dados críticos por meio de métodos públicos chama-se _______.", "encapsulamento", Difficulty.MEDIUM));


        // =========================================================================
        // HARD (40 Questões: 10 MCQ, 10 TF, 10 TIMED, 10 BLANK)
        // =========================================================================

        // --- MCQ (81 a 90) ---
        questions.add(new MultipleChoiceQuestion("Em um sistema com paginação de memória, qual problema ocorre quando um processo acessa uma página que não está carregada na memória física?", Arrays.asList("Buffer overflow", "Page fault", "Segmentation fault", "Cache miss"), 1, Difficulty.HARD));
        questions.add(new MultipleChoiceQuestion("Qual das seguintes afirmações descreve corretamente o Teorema CAP em sistemas distribuídos?", Arrays.asList("Um sistema distribuído pode garantir simultaneamente Consistência, Disponibilidade e Tolerância a Partições", "Um sistema distribuído pode garantir no máximo duas das três propriedades: Consistência, Disponibilidade e Tolerância a Partições", "Consistência e Disponibilidade são sempre sacrificadas em favor da Tolerância a Partições", "O Teorema CAP se aplica apenas a bancos de dados relacionais"), 1, Difficulty.HARD));
        questions.add(new MultipleChoiceQuestion("Na arquitetura RISC-V, o que diferencia instruções do tipo R das do tipo I?", Arrays.asList("Instruções tipo R operam apenas com memória; tipo I operam com registradores", "Instruções tipo R utilizam três registradores como operandos; tipo I utilizam dois registradores e um imediato", "Instruções tipo R são de 16 bits; tipo I são de 32 bits", "Instruções tipo R são exclusivas para operações de ponto flutuante"), 1, Difficulty.HARD));
        questions.add(new MultipleChoiceQuestion("Qual técnica de sincronização garante exclusão mútua sem utilizar espera ocupada (busy waiting)?", Arrays.asList("Spinlock", "Variável de condição com mutex", "Test-and-Set", "Polling"), 1, Difficulty.HARD));
        questions.add(new MultipleChoiceQuestion("Considerando a complexidade de tempo, qual é o limite inferior teórico (lower bound) para algoritmos de ordenação baseados em comparação?", Arrays.asList("O(n)", "O(n log n)", "O(log n)", "O(n²)"), 1, Difficulty.HARD));
        questions.add(new MultipleChoiceQuestion("Qual nível de isolamento de transações em bancos de dados relacionais impede completamente leituras sujas, leituras não-repetíveis e leituras fantasmas?", Arrays.asList("Read Committed", "Read Uncommitted", "Repeatable Read", "Serializable"), 3, Difficulty.HARD));
        questions.add(new MultipleChoiceQuestion("Em redes, qual protocolo de roteamento dinâmico utiliza o algoritmo de vetor de distâncias de Bellman-Ford?", Arrays.asList("OSPF", "BGP", "RIP", "IS-IS"), 2, Difficulty.HARD));
        questions.add(new MultipleChoiceQuestion("Qual das seguintes propriedades caracteriza problemas que pertencem à classe NP-Completo?", Arrays.asList("Eles podem ser resolvidos em tempo polinomial por uma máquina de Turing determinística", "Eles podem ser verificados em tempo polinomial e qualquer outro problema em NP pode ser reduzido a eles em tempo polinomial", "Eles possuem soluções exatas conhecidas com complexidade linear no pior caso", "Eles não possuem algoritmos de aproximação viáveis"), 1, Difficulty.HARD));
        questions.add(new MultipleChoiceQuestion("No garbage collector do Java (G1), como a memória Heap é gerenciada e particionada?", Arrays.asList("Em duas regiões contíguas de tamanho imutável chamadas Stack e Queue", "Em regiões de tamanho idêntico mapeadas dinamicamente como Eden, Survivor e Old Generation", "Em uma única lista encadeada global inspecionada linearmente", "Dividida rigidamente entre ponteiros de herança estática e memória C-Native"), 1, Difficulty.HARD));
        questions.add(new MultipleChoiceQuestion("No padrão OAuth 2.0, qual fluxo de concessão (Grant Type) é recomendado para aplicações do tipo Single Page Application (SPA) que utilizam servidores backend seguros?", Arrays.asList("Implicit Grant", "Authorization Code com PKCE", "Client Credentials", "Resource Owner Password Credentials"), 1, Difficulty.HARD));

        // --- TF (91 a 100) ---
        questions.add(new TrueFalseQuestion("Em compiladores, a análise semântica é responsável por verificar se a estrutura sintática do código-fonte está correta, como o balanceamento de chaves e parênteses.", false, Difficulty.HARD));
        questions.add(new TrueFalseQuestion("O algoritmo de Dijkstra falha ao encontrar o caminho mínimo em grafos que possuem arestas com peso negativo.", true, Difficulty.HARD));
        questions.add(new TrueFalseQuestion("Em criptografia assimétrica, uma mensagem cifrada com a chave pública de um destinatário só pode ser decifrada com a chave privada correspondente desse mesmo destinatário.", true, Difficulty.HARD));
        questions.add(new TrueFalseQuestion("O escalonamento Round-Robin com quantum infinito se comporta de forma equivalente ao escalonamento FCFS (First Come, First Served).", true, Difficulty.HARD));
        questions.add(new TrueFalseQuestion("Em redes neurais profundas, o problema de vanishing gradient ocorre predominantemente nas camadas iniciais da rede e é agravado pelo uso da função de ativação ReLU.", false, Difficulty.HARD));
        questions.add(new TrueFalseQuestion("A herança múltipla de classes (uma classe estender diretamente duas ou mais classes concretas distintas) é suportada nativamente pela linguagem Java.", false, Difficulty.HARD));
        questions.add(new TrueFalseQuestion("No modelo de consistência eventual usado por muitos bancos de dados NoSQL, leituras subsequentes a uma escrita garantem o retorno do valor atualizado imediatamente para todos os clientes locais.", false, Difficulty.HARD));
        questions.add(new TrueFalseQuestion("O algoritmo de ordenação Heapsort possui complexidade de espaço O(n) devido à árvore de prioridades criada em memória dinâmica.", false, Difficulty.HARD));
        questions.add(new TrueFalseQuestion("Ataques do tipo SQL Injection ocorrem principalmente quando dados inseridos por usuários são concatenados de forma direta em strings de consulta SQL executadas sem sanitização.", true, Difficulty.HARD));
        questions.add(new TrueFalseQuestion("Em Java, threads virtuais (Project Loom) são mapeadas na proporção de 1:1 com threads nativas do Kernel do sistema operacional subjacente.", false, Difficulty.HARD));

        // --- TIMED (101 a 110) ---
        questions.add(new TimedMultipleChoiceQuestion("[CRONOMETRADA] No escalonamento de processos, qual algoritmo pode sofrer do problema de Starvation crônico?", Arrays.asList("Round-Robin", "SJF (Shortest Job First) não-preemptivo", "Prioridade Estática", "FCFS"), 2, Difficulty.HARD, 12));
        questions.add(new TimedMultipleChoiceQuestion("[CRONOMETRADA] Qual padrão de projeto estrutural converte a interface de uma classe em outra interface esperada pelos clientes locais?", Arrays.asList("Proxy", "Adapter", "Decorator", "Facade"), 1, Difficulty.HARD, 12));
        questions.add(new TimedMultipleChoiceQuestion("[CRONOMETRADA] Qual das seguintes opções representa uma árvore AVL válida após uma inserção desbalanceada à esquerda?", Arrays.asList("Rotação Simples à Direita", "Rotação Dupla à Direita", "Inversão de Cores", "Split de Nodo"), 0, Difficulty.HARD, 12));
        questions.add(new TimedMultipleChoiceQuestion("[CRONOMETRADA] Em Redes, qual é o tamanho total em bits do cabeçalho mínimo do protocolo IPv6?", Arrays.asList("160 bits", "320 bits", "640 bits", "1280 bits"), 1, Difficulty.HARD, 12));
        questions.add(new TimedMultipleChoiceQuestion("[CRONOMETRADA] No contexto de transações distribuídas, qual protocolo é comumente empregado para garantir a atomicidade global entre nós distintos?", Arrays.asList("Raft", "Paxos", "Two-Phase Commit (2PC)", "Gossip Protocol"), 2, Difficulty.HARD, 12));
        questions.add(new TimedMultipleChoiceQuestion("[CRONOMETRADA] Em Java, qual palavra-chave indica que o valor de uma variável lida por múltiplas threads será sempre extraído diretamente da memória principal?", Arrays.asList("synchronized", "transient", "volatile", "strictfp"), 2, Difficulty.HARD, 12));
        questions.add(new TimedMultipleChoiceQuestion("[CRONOMETRADA] Qual das expressões abaixo em notação Big-O representa a complexidade de tempo do algoritmo de multiplicação de matrizes clássico de Strassen?", Arrays.asList("O(n³)", "O(n^2.81)", "O(n log n)", "O(n²)"), 1, Difficulty.HARD, 12));
        questions.add(new TimedMultipleChoiceQuestion("[CRONOMETRADA] No modelo de memória do Java, onde os objetos instanciados dinamicamente via operador 'new' são explicitamente armazenados?", Arrays.asList("Stack Memory", "Metaspace", "Heap Memory", "Register Array"), 2, Difficulty.HARD, 12));
        questions.add(new TimedMultipleChoiceQuestion("[CRONOMETRADA] Em Engenharia de Software, qual métrica avalia o número de caminhos linearmente independentes através do código do programa?", Arrays.asList("Coesão", "Acoplamento", "Complexidade Ciclomática", "Dívida Técnica"), 2, Difficulty.HARD, 12));
        questions.add(new TimedMultipleChoiceQuestion("[CRONOMETRADA] No Git, qual funcionalidade aplica as alterações introduzidas por commits específicos de outra branch diretamente na branch atual?", Arrays.asList("git merge", "git cherry-pick", "git revert", "git fetch"), 1, Difficulty.HARD, 12));

        // --- BLANK (111 a 120) ---
        questions.add(new FillBlankQuestion("O algoritmo criptográfico assimétrico amplamente adotado baseado na dificuldade de fatoração de grandes números primos chama-se _______.", "rsa", Difficulty.HARD));
        questions.add(new FillBlankQuestion("A estrutura de controle de concorrência em SOs que gerencia o acesso por meio de variáveis inteiras e chamadas de wait/signal é o _______.", "semaforo", Difficulty.HARD));
        questions.add(new FillBlankQuestion("O tipo de ataque cibernético focado em esgotar recursos de rede inundando o servidor alvo com tráfego massivo distribuído é abreviado como _______.", "ddos", Difficulty.HARD));
        questions.add(new FillBlankQuestion("A árvore de busca auto-balanceada cujos nodos contêm uma propriedade de cor binária para controle de altura chama-se árvore _______.", "rubro-negra", Difficulty.HARD));
        questions.add(new FillBlankQuestion("A estratégia de projeto de algoritmos que resolve subproblemas menores e armazena seus resultados em tabelas para evitar recomputações chama-se programação _______.", "dinamica", Difficulty.HARD));
        questions.add(new FillBlankQuestion("No ecossistema Java, a ferramenta padrão usada para profiling e monitoramento em tempo real da JVM em produção via linha de comando é o j_______.", "cmd", Difficulty.HARD));
        questions.add(new FillBlankQuestion("Em barramentos e arquiteturas de SO, a sigla da técnica que permite a periféricos de hardware acessar diretamente a memória RAM sem passar pela CPU é _______.", "dma", Difficulty.HARD));
        questions.add(new FillBlankQuestion("Em bancos de dados, o mecanismo que impede modificações simultâneas de dados conflitantes travando o registro até o fim da transação chama-se _______.", "lock", Difficulty.HARD));
        questions.add(new FillBlankQuestion("Em teoria da computação, a máquina teórica abstrata idealizada para simular qualquer lógica computacional algorítmica chama-se Máquina de _______.", "turing", Difficulty.HARD));
        questions.add(new FillBlankQuestion("O padrão arquitetural que separa as operações de leitura e escrita de dados em bancos distintos é abreviado como _______.", "cqrs", Difficulty.HARD));
    }

    public List<Question> FilterByDifficulty(Difficulty difficulty){
        return questions.stream()
                .filter(q -> q.getDifficulty() == difficulty)
                .collect(Collectors.toList());
    }
}