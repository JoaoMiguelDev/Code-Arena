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

        // EASY (120 Questões: 30 MCQ, 30 TF, 30 TIMED, 30 BLANK)

        // --- MCQ ---
        questions.add(new MultipleChoiceQuestion("Qual estrutura de dados utiliza o princípio LIFO (Last In, First Out)?", Arrays.asList("Fila", "Pilha", "Árvore binária", "Grafo"), 1, Difficulty.EASY));
        questions.add(new MultipleChoiceQuestion("Qual das alternativas representa corretamente a complexidade do algoritmo de busca binária?", Arrays.asList("O(n)", "O(n²)", "O(log n)", "O(1)"), 2, Difficulty.EASY));
        questions.add(new MultipleChoiceQuestion("Em qual camada do modelo OSI o endereçamento IP é tratado?", Arrays.asList("Camada de Enlace", "Camada de Rede", "Camada de Transporte", "Camada de Aplicação"), 1, Difficulty.EASY));
        questions.add(new MultipleChoiceQuestion("O que é um sistema operacional?", Arrays.asList("Um editor de textos", "Hardware de processamento", "Software gerente do hardware", "Um protocolo de rede"), 2, Difficulty.EASY));
        questions.add(new MultipleChoiceQuestion("Qual porta TCP é usada por padrão pelo protocolo HTTP?", Arrays.asList("21", "443", "80", "22"), 2, Difficulty.EASY));
        questions.add(new MultipleChoiceQuestion("Qual palavra-chave em Java impede que uma classe seja herdada?", Arrays.asList("static", "abstract", "final", "private"), 2, Difficulty.EASY));
        questions.add(new MultipleChoiceQuestion("Qual comando SQL é utilizado para extrair dados de uma tabela?", Arrays.asList("GET", "EXTRACT", "SELECT", "OPEN"), 2, Difficulty.EASY));
        questions.add(new MultipleChoiceQuestion("Qual tag HTML é utilizada para criar uma quebra de linha?", Arrays.asList("<lb>", "<break>", "<br>", "<p>"), 2, Difficulty.EASY));
        questions.add(new MultipleChoiceQuestion("No Git, qual comando cria uma cópia local de um repositório remoto?", Arrays.asList("git fetch", "git pull", "git clone", "git copy"), 2, Difficulty.EASY));
        questions.add(new MultipleChoiceQuestion("Qual dos seguintes componentes é o cérebro do computador, responsável pela execução de instruções?", Arrays.asList("RAM", "SSD", "CPU", "GPU"), 2, Difficulty.EASY));
        questions.add(new MultipleChoiceQuestion("Qual é a função básica de um firewall em uma rede?", Arrays.asList("Acelerar a internet", "Filtrar tráfego de rede", "Armazenar senhas", "Compactar arquivos"), 1, Difficulty.EASY));
        questions.add(new MultipleChoiceQuestion("O que significa a sigla 'VPN'?", Arrays.asList("Virtual Private Network", "Visual Process Node", "Verified Public Net", "Variable Port Number"), 0, Difficulty.EASY));
        questions.add(new MultipleChoiceQuestion("Qual prática ajuda a proteger uma conta contra acesso indevido?", Arrays.asList("Senha fraca repetida", "Autenticação em duas etapas", "Compartilhar a senha", "Usar a mesma senha sempre"), 1, Difficulty.EASY));
        questions.add(new MultipleChoiceQuestion("O que é 'phishing'?", Arrays.asList("Um antivírus", "Tentativa de fraude por engano", "Um tipo de firewall", "Um protocolo de rede"), 1, Difficulty.EASY));
        questions.add(new MultipleChoiceQuestion("Qual extensão de arquivo é comumente associada a imagens?", Arrays.asList(".docx", ".png", ".exe", ".sql"), 1, Difficulty.EASY));
        questions.add(new MultipleChoiceQuestion("O que faz um antivírus básico?", Arrays.asList("Aumenta a velocidade do PC", "Detecta e remove malware", "Gerencia senhas", "Configura redes"), 1, Difficulty.EASY));
        questions.add(new MultipleChoiceQuestion("Qual destes é um exemplo de senha forte?", Arrays.asList("123456", "senha", "Tr8!qLm92#", "abcdef"), 2, Difficulty.EASY));
        questions.add(new MultipleChoiceQuestion("O que é um 'backup' de dados?", Arrays.asList("Um vírus", "Uma cópia de segurança", "Um tipo de rede", "Um navegador"), 1, Difficulty.EASY));
        questions.add(new MultipleChoiceQuestion("Qual comando Linux lista os arquivos de um diretório?", Arrays.asList("cd", "ls", "rm", "mkdir"), 1, Difficulty.EASY));
        questions.add(new MultipleChoiceQuestion("Em Java, qual estrutura permite repetir um bloco de código várias vezes?", Arrays.asList("if", "switch", "for", "class"), 2, Difficulty.EASY));
        questions.add(new MultipleChoiceQuestion("O que é um 'malware'?", Arrays.asList("Um hardware defeituoso", "Software malicioso", "Um tipo de cabo", "Um protocolo seguro"), 1, Difficulty.EASY));
        questions.add(new MultipleChoiceQuestion("Qual unidade mede a velocidade de uma rede de internet?", Arrays.asList("Watts", "Mbps", "Graus Celsius", "Lumens"), 1, Difficulty.EASY));
        questions.add(new MultipleChoiceQuestion("Qual linguagem é usada para estilizar páginas web?", Arrays.asList("HTML", "CSS", "SQL", "Java"), 1, Difficulty.EASY));
        questions.add(new MultipleChoiceQuestion("O que é o 'phishing por e-mail' tenta fazer com a vítima?", Arrays.asList("Vender produtos", "Roubar dados sensíveis", "Atualizar o sistema", "Otimizar a rede"), 1, Difficulty.EASY));
        questions.add(new MultipleChoiceQuestion("Qual destes é um navegador de internet?", Arrays.asList("Excel", "Chrome", "Word", "Photoshop"), 1, Difficulty.EASY));
        questions.add(new MultipleChoiceQuestion("O que significa a sigla 'URL'?", Arrays.asList("Localizador de Recursos", "Unidade de Rede Local", "Usuário Root Linux", "Unidade de Registro Lógico"), 0, Difficulty.EASY));
        questions.add(new MultipleChoiceQuestion("Qual tecla geralmente cancela uma operação no Windows?", Arrays.asList("Enter", "Esc", "Tab", "Shift"), 1, Difficulty.EASY));
        questions.add(new MultipleChoiceQuestion("O que é necessário para acessar um Wi-Fi protegido?", Arrays.asList("Um cabo de rede", "A senha da rede", "Um antivírus", "Um e-mail"), 1, Difficulty.EASY));
        questions.add(new MultipleChoiceQuestion("Qual destes é um tipo de armazenamento físico?", Arrays.asList("RAM", "HDD", "CPU", "GPU"), 1, Difficulty.EASY));
        questions.add(new MultipleChoiceQuestion("O que é 'criptografia' de forma simples?", Arrays.asList("Compactar arquivos", "Transformar dados em código", "Apagar arquivos", "Acelerar o processador"), 1, Difficulty.EASY));

        // --- TRUE/FALSE ---
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
        questions.add(new TrueFalseQuestion("Usar a mesma senha em vários sites é uma prática segura recomendada.", false, Difficulty.EASY));
        questions.add(new TrueFalseQuestion("Um antivírus pode ajudar a detectar e remover softwares maliciosos do computador.", true, Difficulty.EASY));
        questions.add(new TrueFalseQuestion("Phishing é uma técnica legítima usada por bancos para verificar identidade.", false, Difficulty.EASY));
        questions.add(new TrueFalseQuestion("Fazer backup regular dos dados ajuda a evitar perda total em caso de ataque.", true, Difficulty.EASY));
        questions.add(new TrueFalseQuestion("Redes Wi-Fi públicas sem senha são sempre totalmente seguras para uso bancário.", false, Difficulty.EASY));
        questions.add(new TrueFalseQuestion("A autenticação em duas etapas aumenta a segurança de uma conta online.", true, Difficulty.EASY));
        questions.add(new TrueFalseQuestion("Clicar em links de e-mails desconhecidos é uma prática recomendada de segurança.", false, Difficulty.EASY));
        questions.add(new TrueFalseQuestion("Um firewall ajuda a controlar o tráfego de entrada e saída de uma rede.", true, Difficulty.EASY));
        questions.add(new TrueFalseQuestion("Senhas curtas e simples são mais difíceis de serem descobertas por invasores.", false, Difficulty.EASY));
        questions.add(new TrueFalseQuestion("Manter o sistema operacional atualizado ajuda a corrigir falhas de segurança.", true, Difficulty.EASY));
        questions.add(new TrueFalseQuestion("HTML é uma linguagem de programação usada para criar lógica de servidores.", false, Difficulty.EASY));
        questions.add(new TrueFalseQuestion("O Git é uma ferramenta de controle de versão amplamente usada por programadores.", true, Difficulty.EASY));
        questions.add(new TrueFalseQuestion("Um endereço IP identifica um dispositivo dentro de uma rede de computadores.", true, Difficulty.EASY));
        questions.add(new TrueFalseQuestion("O disco rígido (HDD) é um tipo de memória volátil como a RAM.", false, Difficulty.EASY));
        questions.add(new TrueFalseQuestion("Em Java, todo programa precisa de um método main para iniciar a execução.", true, Difficulty.EASY));
        questions.add(new TrueFalseQuestion("Um byte é composto por exatamente 8 bits.", true, Difficulty.EASY));
        questions.add(new TrueFalseQuestion("O Bluetooth é um protocolo utilizado exclusivamente para conexões com fio.", false, Difficulty.EASY));
        questions.add(new TrueFalseQuestion("Um navegador web é necessário para acessar páginas da internet.", true, Difficulty.EASY));
        questions.add(new TrueFalseQuestion("O comando 'print' em Python é usado para exibir informações na tela.", true, Difficulty.EASY));
        questions.add(new TrueFalseQuestion("Um vírus de computador sempre danifica fisicamente o hardware da máquina.", false, Difficulty.EASY));

        // --- TIMED ---
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
        questions.add(new TimedMultipleChoiceQuestion("[CRONOMETRADA] Qual destes é um exemplo de autenticação de dois fatores?", Arrays.asList("Só a senha", "Senha + código no celular", "Só o login", "Nome de usuário"), 1, Difficulty.EASY, 10));
        questions.add(new TimedMultipleChoiceQuestion("[CRONOMETRADA] Qual sigla representa um ataque de negação de serviço?", Arrays.asList("VPN", "DoS", "SSH", "DNS"), 1, Difficulty.EASY, 10));
        questions.add(new TimedMultipleChoiceQuestion("[CRONOMETRADA] Qual extensão de arquivo é tipicamente associada a vírus disfarçados?", Arrays.asList(".txt", ".exe", ".csv", ".png"), 1, Difficulty.EASY, 10));
        questions.add(new TimedMultipleChoiceQuestion("[CRONOMETRADA] Qual destes protocolos é considerado mais seguro para navegação web?", Arrays.asList("HTTP", "FTP", "HTTPS", "Telnet"), 2, Difficulty.EASY, 10));
        questions.add(new TimedMultipleChoiceQuestion("[CRONOMETRADA] Qual ação ajuda a proteger um computador contra malware?", Arrays.asList("Desativar antivírus", "Atualizar o sistema", "Abrir e-mails suspeitos", "Usar senha fraca"), 1, Difficulty.EASY, 10));
        questions.add(new TimedMultipleChoiceQuestion("[CRONOMETRADA] Qual destes é um software de proteção contra ameaças digitais?", Arrays.asList("Antivírus", "Compilador", "Editor de texto", "Navegador"), 0, Difficulty.EASY, 10));
        questions.add(new TimedMultipleChoiceQuestion("[CRONOMETRADA] Qual comando Git envia commits locais para o repositório remoto?", Arrays.asList("git pull", "git push", "git clone", "git log"), 1, Difficulty.EASY, 10));
        questions.add(new TimedMultipleChoiceQuestion("[CRONOMETRADA] Em Java, qual palavra-chave cria uma nova instância de uma classe?", Arrays.asList("new", "this", "static", "void"), 0, Difficulty.EASY, 10));
        questions.add(new TimedMultipleChoiceQuestion("[CRONOMETRADA] Qual destes é um exemplo de rede sem fio?", Arrays.asList("Ethernet", "Wi-Fi", "Fibra óptica", "Cabo coaxial"), 1, Difficulty.EASY, 10));
        questions.add(new TimedMultipleChoiceQuestion("[CRONOMETRADA] Qual tecla de atalho geralmente copia um item selecionado?", Arrays.asList("Ctrl+V", "Ctrl+C", "Ctrl+Z", "Ctrl+X"), 1, Difficulty.EASY, 10));
        questions.add(new TimedMultipleChoiceQuestion("[CRONOMETRADA] Qual destes é considerado um sistema operacional?", Arrays.asList("Windows", "Word", "Chrome", "Excel"), 0, Difficulty.EASY, 10));
        questions.add(new TimedMultipleChoiceQuestion("[CRONOMETRADA] Qual linguagem é usada para consultar bancos de dados relacionais?", Arrays.asList("HTML", "SQL", "CSS", "XML"), 1, Difficulty.EASY, 10));
        questions.add(new TimedMultipleChoiceQuestion("[CRONOMETRADA] Qual destes é um exemplo de e-mail suspeito de phishing?", Arrays.asList("Promoção de loja conhecida", "Cobrança falsa e urgente", "Boletim da empresa", "Convite de reunião"), 1, Difficulty.EASY, 10));
        questions.add(new TimedMultipleChoiceQuestion("[CRONOMETRADA] Qual unidade de medida representa a capacidade de armazenamento?", Arrays.asList("Hertz", "Gigabyte", "Watt", "Volt"), 1, Difficulty.EASY, 10));
        questions.add(new TimedMultipleChoiceQuestion("[CRONOMETRADA] Qual destes é um exemplo de senha insegura?", Arrays.asList("Tr8!qLm92#", "123456", "Kp9@zXq3", "Vn7#wRt5"), 1, Difficulty.EASY, 10));
        questions.add(new TimedMultipleChoiceQuestion("[CRONOMETRADA] Qual comando Linux remove um arquivo?", Arrays.asList("ls", "rm", "cd", "mkdir"), 1, Difficulty.EASY, 10));
        questions.add(new TimedMultipleChoiceQuestion("[CRONOMETRADA] Qual destes é o nome de um navegador de internet?", Arrays.asList("Firefox", "WinRAR", "Photoshop", "Notepad"), 0, Difficulty.EASY, 10));
        questions.add(new TimedMultipleChoiceQuestion("[CRONOMETRADA] Qual destes formatos é comumente usado para compactar arquivos?", Arrays.asList(".zip", ".exe", ".doc", ".mp3"), 0, Difficulty.EASY, 10));
        questions.add(new TimedMultipleChoiceQuestion("[CRONOMETRADA] Qual tipo de memória é apagada quando o computador é desligado?", Arrays.asList("HDD", "RAM", "SSD", "Pendrive"), 1, Difficulty.EASY, 10));
        questions.add(new TimedMultipleChoiceQuestion("[CRONOMETRADA] Qual sigla representa o protocolo usado para transferência segura de arquivos?", Arrays.asList("FTP", "SFTP", "SMTP", "ARP"), 1, Difficulty.EASY, 10));

        // --- BLANK ---
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
        questions.add(new FillBlankQuestion("O software que detecta e remove programas maliciosos do computador é chamado de _______.", "antivirus", Difficulty.EASY));
        questions.add(new FillBlankQuestion("A técnica de fraude que tenta roubar dados se passando por uma fonte confiável é chamada de _______.", "phishing", Difficulty.EASY));
        questions.add(new FillBlankQuestion("O dispositivo de segurança de rede que filtra o tráfego de entrada e saída é chamado de _______.", "firewall", Difficulty.EASY));
        questions.add(new FillBlankQuestion("Um programa criado para causar dano ou roubar dados de um sistema é chamado de _______.", "malware", Difficulty.EASY));
        questions.add(new FillBlankQuestion("A cópia de segurança de dados feita para evitar perda permanente é chamada de _______.", "backup", Difficulty.EASY));
        questions.add(new FillBlankQuestion("O processo de transformar dados legíveis em um formato secreto é chamado de _______.", "criptografia", Difficulty.EASY));
        questions.add(new FillBlankQuestion("A rede privada que permite navegação segura por meio de um túnel criptografado é a _______.", "vpn", Difficulty.EASY));
        questions.add(new FillBlankQuestion("O conjunto de caracteres secreto usado para autenticar o acesso a um sistema é chamado de _______.", "senha", Difficulty.EASY));
        questions.add(new FillBlankQuestion("O programa usado para acessar páginas da internet é chamado de _______ web.", "navegador", Difficulty.EASY));
        questions.add(new FillBlankQuestion("A sigla em inglês para tecnologia da informação é _______.", "ti", Difficulty.EASY));
        questions.add(new FillBlankQuestion("Em Java, a estrutura de repetição mais usada para contar um número fixo de vezes é o _______.", "for", Difficulty.EASY));
        questions.add(new FillBlankQuestion("O sistema de controle de versão distribuído mais usado por programadores é o _______.", "git", Difficulty.EASY));
        questions.add(new FillBlankQuestion("O dispositivo de armazenamento óptico ou eletrônico que guarda dados permanentemente é o disco _______.", "rigido", Difficulty.EASY));
        questions.add(new FillBlankQuestion("Em redes, o conjunto de regras que define como dispositivos se comunicam é chamado de _______.", "protocolo", Difficulty.EASY));
        questions.add(new FillBlankQuestion("A linguagem usada para estilizar e formatar o visual de páginas web é o _______.", "css", Difficulty.EASY));
        questions.add(new FillBlankQuestion("O sistema operacional de código aberto muito usado em servidores é o _______.", "linux", Difficulty.EASY));
        questions.add(new FillBlankQuestion("A unidade central de processamento de um computador é abreviada como _______.", "cpu", Difficulty.EASY));
        questions.add(new FillBlankQuestion("O comando usado para listar arquivos em um terminal Linux é o _______.", "ls", Difficulty.EASY));
        questions.add(new FillBlankQuestion("Em programação, o conjunto de instruções escritas pelo programador é chamado de código-_______.", "fonte", Difficulty.EASY));
        questions.add(new FillBlankQuestion("A sigla que representa a rede mundial de computadores é _______.", "www", Difficulty.EASY));

        // MEDIUM (120 Questões: 30 MCQ, 30 TF, 30 TIMED, 30 BLANK)

        // --- MCQ ---
        questions.add(new MultipleChoiceQuestion("Qual algoritmo de ordenação possui complexidade O(n log n) no pior caso?", Arrays.asList("Quick Sort", "Bubble Sort", "Merge Sort", "Insertion Sort"), 2, Difficulty.MEDIUM));
        questions.add(new MultipleChoiceQuestion("Em um banco de dados relacional, o que garante que uma coluna em uma tabela referencie corretamente um registro existente em outra tabela?", Arrays.asList("Chave primária", "Índice", "Chave estrangeira", "Constraint NOT NULL"), 2, Difficulty.MEDIUM));
        questions.add(new MultipleChoiceQuestion("Qual é o resultado da operação binária 1010 XOR 1100?", Arrays.asList("1110", "0110", "1000", "0010"), 1, Difficulty.MEDIUM));
        questions.add(new MultipleChoiceQuestion("No contexto de gerenciamento de memória, o que é um 'deadlock'?", Arrays.asList("Consumo total da RAM", "Processos bloqueados entre si", "SO encerra processo sem RAM", "Ponteiro com endereço inválido"), 1, Difficulty.MEDIUM));
        questions.add(new MultipleChoiceQuestion("Qual paradigma de programação trata funções como cidadãs de primeira classe e evita mudança de estado e dados mutáveis?", Arrays.asList("Orientado a objetos", "Imperativo", "Funcional", "Procedural"), 2, Difficulty.MEDIUM));
        questions.add(new MultipleChoiceQuestion("Qual padrão de projeto criacional foca em construir objetos complexos passo a passo?", Arrays.asList("Factory Method", "Builder", "Abstract Factory", "Prototype"), 1, Difficulty.MEDIUM));
        questions.add(new MultipleChoiceQuestion("No modelo MVC, qual componente é responsável por interceptar as requisições e gerenciar o fluxo de dados?", Arrays.asList("Model", "View", "Controller", "Router"), 2, Difficulty.MEDIUM));
        questions.add(new MultipleChoiceQuestion("Em redes, qual protocolo opera na camada de Transporte e fornece controle de fluxo sem garantia de entrega?", Arrays.asList("TCP", "UDP", "ICMP", "IGMP"), 1, Difficulty.MEDIUM));
        questions.add(new MultipleChoiceQuestion("O que o índice em um banco de dados relacional visa primariamente otimizar?", Arrays.asList("O espaço em disco", "A segurança dos dados", "A velocidade das consultas", "O isolamento de transações"), 2, Difficulty.MEDIUM));
        questions.add(new MultipleChoiceQuestion("Qual modificador de acesso em Java expõe o membro apenas para a própria classe, subclasses e classes do mesmo pacote?", Arrays.asList("public", "private", "protected", "default"), 2, Difficulty.MEDIUM));
        questions.add(new MultipleChoiceQuestion("Qual técnica usa engenharia social para induzir vítimas a revelar dados sensíveis?", Arrays.asList("Firewall", "Phishing", "Backup", "Roteamento"), 1, Difficulty.MEDIUM));
        questions.add(new MultipleChoiceQuestion("Qual destes ataques sobrecarrega um servidor com tráfego falso para tirá-lo do ar?", Arrays.asList("SQL Injection", "DDoS", "Cross-Site Scripting", "Buffer Overflow"), 1, Difficulty.MEDIUM));
        questions.add(new MultipleChoiceQuestion("Qual algoritmo de hash é considerado obsoleto para uso criptográfico seguro?", Arrays.asList("SHA-256", "MD5", "SHA-3", "Bcrypt"), 1, Difficulty.MEDIUM));
        questions.add(new MultipleChoiceQuestion("O que caracteriza um ataque de 'força bruta'?", Arrays.asList("Exploração de bug lógico", "Tentativa exaustiva de senhas", "Interceptação de pacotes", "Engenharia social por voz"), 1, Difficulty.MEDIUM));
        questions.add(new MultipleChoiceQuestion("Qual mecanismo HTTP é usado para indicar que um recurso requer autenticação?", Arrays.asList("Código 404", "Código 401", "Código 301", "Código 500"), 1, Difficulty.MEDIUM));
        questions.add(new MultipleChoiceQuestion("O que é um 'certificado digital' usado em conexões HTTPS?", Arrays.asList("Um tipo de vírus", "Prova de identidade do site", "Um protocolo de e-mail", "Um tipo de cookie"), 1, Difficulty.MEDIUM));
        questions.add(new MultipleChoiceQuestion("Qual prática reduz o risco de um ataque de 'SQL Injection'?", Arrays.asList("Concatenar strings na query", "Usar consultas parametrizadas", "Desativar o firewall", "Aumentar o timeout"), 1, Difficulty.MEDIUM));
        questions.add(new MultipleChoiceQuestion("O que é 'ransomware'?", Arrays.asList("Antivírus pago", "Malware que sequestra dados", "Firewall corporativo", "Protocolo de backup"), 1, Difficulty.MEDIUM));
        questions.add(new MultipleChoiceQuestion("Qual destes é um exemplo de autenticação multifator?", Arrays.asList("Só senha", "Senha e biometria", "Login automático", "Senha salva no navegador"), 1, Difficulty.MEDIUM));
        questions.add(new MultipleChoiceQuestion("Em redes, o que faz um 'proxy' tipicamente?", Arrays.asList("Armazena dados em disco", "Intermedia requisições de rede", "Compila código-fonte", "Renderiza páginas web"), 1, Difficulty.MEDIUM));
        questions.add(new MultipleChoiceQuestion("Qual estrutura de dados é mais eficiente para buscas balanceadas em O(log n)?", Arrays.asList("Lista encadeada", "Árvore binária balanceada", "Pilha", "Fila simples"), 1, Difficulty.MEDIUM));
        questions.add(new MultipleChoiceQuestion("O que caracteriza uma 'API RESTful'?", Arrays.asList("Usa apenas SOAP", "Usa HTTP e recursos via URLs", "Não usa rede", "Executa só localmente"), 1, Difficulty.MEDIUM));
        questions.add(new MultipleChoiceQuestion("Qual comando Docker inicia um container a partir de uma imagem?", Arrays.asList("docker build", "docker run", "docker pull", "docker stop"), 1, Difficulty.MEDIUM));
        questions.add(new MultipleChoiceQuestion("O que é 'injeção de dependência' em POO?", Arrays.asList("Apagar dependências antigas", "Fornecer dependência externa", "Compilar com erros", "Criar loops infinitos"), 1, Difficulty.MEDIUM));
        questions.add(new MultipleChoiceQuestion("Qual algoritmo de roteamento é usado pelo protocolo OSPF?", Arrays.asList("Vetor de distância", "Estado de enlace", "Roteamento estático", "Broadcast simples"), 1, Difficulty.MEDIUM));
        questions.add(new MultipleChoiceQuestion("O que caracteriza o 'Cross-Site Scripting' (XSS)?", Arrays.asList("Ataque a hardware", "Script malicioso no navegador", "Falha de energia", "Erro de compilação"), 1, Difficulty.MEDIUM));
        questions.add(new MultipleChoiceQuestion("Qual estrutura Java é usada para tratar múltiplas exceções de tipos diferentes?", Arrays.asList("if-else", "multi-catch", "switch", "for-each"), 1, Difficulty.MEDIUM));
        questions.add(new MultipleChoiceQuestion("O que é 'Same-Origin Policy' em navegadores?", Arrays.asList("Permite qualquer origem", "Restringe origens diferentes", "Desativa o JavaScript", "Bloqueia todo o tráfego HTTP"), 1, Difficulty.MEDIUM));
        questions.add(new MultipleChoiceQuestion("Qual prática de segurança limita os privilégios de um usuário ao mínimo necessário?", Arrays.asList("Acesso total padrão", "Princípio do menor privilégio", "Login compartilhado", "Senha única para todos"), 1, Difficulty.MEDIUM));
        questions.add(new MultipleChoiceQuestion("O que é um 'honeypot' em segurança da informação?", Arrays.asList("Um tipo de vírus", "Uma isca para atrair atacantes", "Um firewall físico", "Um protocolo de e-mail"), 1, Difficulty.MEDIUM));

        // --- TRUE/FALSE ---
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
        questions.add(new TrueFalseQuestion("Um ataque de força bruta tenta adivinhar senhas testando múltiplas combinações.", true, Difficulty.MEDIUM));
        questions.add(new TrueFalseQuestion("HTTPS utiliza certificados digitais para autenticar a identidade de um servidor.", true, Difficulty.MEDIUM));
        questions.add(new TrueFalseQuestion("Um ataque DDoS tem como objetivo principal roubar dados sigilosos de um banco de dados.", false, Difficulty.MEDIUM));
        questions.add(new TrueFalseQuestion("O princípio do menor privilégio recomenda dar a cada usuário o acesso mínimo necessário.", true, Difficulty.MEDIUM));
        questions.add(new TrueFalseQuestion("Senhas armazenadas em texto puro no banco de dados são consideradas uma boa prática de segurança.", false, Difficulty.MEDIUM));
        questions.add(new TrueFalseQuestion("Um honeypot é um sistema-isca criado para atrair e estudar atacantes.", true, Difficulty.MEDIUM));
        questions.add(new TrueFalseQuestion("SQL Injection ocorre quando entradas do usuário são inseridas sem sanitização em consultas SQL.", true, Difficulty.MEDIUM));
        questions.add(new TrueFalseQuestion("Firewalls eliminam completamente qualquer possibilidade de invasão em uma rede corporativa.", false, Difficulty.MEDIUM));
        questions.add(new TrueFalseQuestion("Engenharia social explora o comportamento humano, e não falhas técnicas de software.", true, Difficulty.MEDIUM));
        questions.add(new TrueFalseQuestion("Em segurança da informação, autenticação multifator usa apenas um único método de verificação.", false, Difficulty.MEDIUM));
        questions.add(new TrueFalseQuestion("O padrão de projeto Observer permite que objetos sejam notificados sobre mudanças em outro objeto.", true, Difficulty.MEDIUM));
        questions.add(new TrueFalseQuestion("Em Java, interfaces podem conter métodos com implementação padrão desde o Java 8.", true, Difficulty.MEDIUM));
        questions.add(new TrueFalseQuestion("O protocolo FTP transmite dados de forma criptografada por padrão.", false, Difficulty.MEDIUM));
        questions.add(new TrueFalseQuestion("Em bancos NoSQL, os dados são sempre armazenados estritamente em tabelas relacionais.", false, Difficulty.MEDIUM));
        questions.add(new TrueFalseQuestion("A complexidade O(1) representa tempo constante, independente do tamanho da entrada.", true, Difficulty.MEDIUM));
        questions.add(new TrueFalseQuestion("Um certificado SSL/TLS expirado pode comprometer a confiança em um site HTTPS.", true, Difficulty.MEDIUM));
        questions.add(new TrueFalseQuestion("O comando git commit envia automaticamente as alterações para o repositório remoto.", false, Difficulty.MEDIUM));
        questions.add(new TrueFalseQuestion("Threads em Java podem compartilhar memória e causar condições de corrida sem sincronização.", true, Difficulty.MEDIUM));
        questions.add(new TrueFalseQuestion("O algoritmo Quick Sort sempre possui desempenho pior que o Bubble Sort em qualquer cenário.", false, Difficulty.MEDIUM));
        questions.add(new TrueFalseQuestion("Um VPN pode ajudar a proteger dados transmitidos em redes Wi-Fi públicas.", true, Difficulty.MEDIUM));

        // --- TIMED ---
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
        questions.add(new TimedMultipleChoiceQuestion("[CRONOMETRADA] Qual destes códigos de status HTTP indica acesso não autorizado?", Arrays.asList("200", "401", "301", "500"), 1, Difficulty.MEDIUM, 15));
        questions.add(new TimedMultipleChoiceQuestion("[CRONOMETRADA] Qual algoritmo de hash é amplamente recomendado para armazenar senhas com segurança?", Arrays.asList("MD5", "Bcrypt", "Base64", "CRC32"), 1, Difficulty.MEDIUM, 15));
        questions.add(new TimedMultipleChoiceQuestion("[CRONOMETRADA] Qual destes ataques explora vulnerabilidades em consultas de banco de dados?", Arrays.asList("XSS", "SQL Injection", "DDoS", "Phishing"), 1, Difficulty.MEDIUM, 15));
        questions.add(new TimedMultipleChoiceQuestion("[CRONOMETRADA] Qual protocolo garante transferência criptografada de arquivos pela rede?", Arrays.asList("FTP", "SFTP", "HTTP", "SMTP"), 1, Difficulty.MEDIUM, 15));
        questions.add(new TimedMultipleChoiceQuestion("[CRONOMETRADA] Qual destes é um exemplo de vulnerabilidade de segurança web?", Arrays.asList("Cache do navegador", "Cross-Site Scripting", "Resolução de tela", "Cookies de sessão válidos"), 1, Difficulty.MEDIUM, 15));
        questions.add(new TimedMultipleChoiceQuestion("[CRONOMETRADA] Em Java, qual coleção mantém os elementos ordenados por chave automaticamente?", Arrays.asList("HashMap", "TreeMap", "ArrayList", "HashSet"), 1, Difficulty.MEDIUM, 15));
        questions.add(new TimedMultipleChoiceQuestion("[CRONOMETRADA] Qual destes representa uma boa prática contra ataques de força bruta?", Arrays.asList("Sem limite de tentativas", "Bloqueio após falhas", "Senha numérica curta", "Login sem senha"), 1, Difficulty.MEDIUM, 15));
        questions.add(new TimedMultipleChoiceQuestion("[CRONOMETRADA] Qual comando SQL remove permanentemente registros de uma tabela?", Arrays.asList("SELECT", "DELETE", "UPDATE", "ALTER"), 1, Difficulty.MEDIUM, 15));
        questions.add(new TimedMultipleChoiceQuestion("[CRONOMETRADA] Qual destes protocolos é usado para autenticação federada e single sign-on?", Arrays.asList("FTP", "OAuth", "ICMP", "ARP"), 1, Difficulty.MEDIUM, 15));
        questions.add(new TimedMultipleChoiceQuestion("[CRONOMETRADA] Em redes, o que é um 'man-in-the-middle'?", Arrays.asList("Um roteador físico", "Interceptação de comunicação", "Um tipo de cabo", "Um servidor DNS"), 1, Difficulty.MEDIUM, 15));
        questions.add(new TimedMultipleChoiceQuestion("[CRONOMETRADA] Qual estrutura de dados Java é indicada para implementar uma fila (FIFO)?", Arrays.asList("Stack", "Queue", "TreeSet", "HashMap"), 1, Difficulty.MEDIUM, 15));
        questions.add(new TimedMultipleChoiceQuestion("[CRONOMETRADA] Qual destes é um exemplo de controle de acesso baseado em papéis?", Arrays.asList("RBAC", "DDoS", "VPN", "DNS"), 0, Difficulty.MEDIUM, 15));
        questions.add(new TimedMultipleChoiceQuestion("[CRONOMETRADA] Qual comando Git desfaz o último commit mantendo as alterações no diretório?", Arrays.asList("git reset --soft HEAD~1", "git push", "git clone", "git status"), 0, Difficulty.MEDIUM, 15));
        questions.add(new TimedMultipleChoiceQuestion("[CRONOMETRADA] Qual destes é um exemplo de ataque de 'engenharia social'?", Arrays.asList("Buffer overflow", "Ligação fingindo ser suporte", "Falha de hardware", "Erro de compilação"), 1, Difficulty.MEDIUM, 15));
        questions.add(new TimedMultipleChoiceQuestion("[CRONOMETRADA] Em Java, qual modificador torna um método inacessível fora da classe?", Arrays.asList("public", "protected", "private", "default"), 2, Difficulty.MEDIUM, 15));
        questions.add(new TimedMultipleChoiceQuestion("[CRONOMETRADA] Qual destes é o objetivo principal de um teste de penetração (pentest)?", Arrays.asList("Aumentar vendas", "Achar falhas antes do ataque", "Otimizar imagens", "Criar backups"), 1, Difficulty.MEDIUM, 15));
        questions.add(new TimedMultipleChoiceQuestion("[CRONOMETRADA] Qual cabeçalho HTTP ajuda a prevenir ataques de Cross-Site Scripting?", Arrays.asList("Content-Length", "Content-Security-Policy", "User-Agent", "Cache-Control"), 1, Difficulty.MEDIUM, 15));
        questions.add(new TimedMultipleChoiceQuestion("[CRONOMETRADA] Qual destes é um exemplo de dado sensível que deve ser criptografado em repouso?", Arrays.asList("Logo da empresa", "Senha de usuário", "Texto de rodapé", "Nome do site"), 1, Difficulty.MEDIUM, 15));
        questions.add(new TimedMultipleChoiceQuestion("[CRONOMETRADA] Qual comando Linux verifica conectividade de rede com outro host?", Arrays.asList("ping", "grep", "chmod", "ls"), 0, Difficulty.MEDIUM, 15));
        questions.add(new TimedMultipleChoiceQuestion("[CRONOMETRADA] Qual destes é o nome de um framework popular para testes automatizados em Java?", Arrays.asList("JUnit", "Bootstrap", "React", "Django"), 0, Difficulty.MEDIUM, 15));

        // --- BLANK ---
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
        questions.add(new FillBlankQuestion("A técnica de ataque que sobrecarrega um sistema com tráfego excessivo de múltiplas origens é chamada de _______.", "ddos", Difficulty.MEDIUM));
        questions.add(new FillBlankQuestion("O processo de verificar a identidade de um usuário antes de conceder acesso é chamado de _______.", "autenticacao", Difficulty.MEDIUM));
        questions.add(new FillBlankQuestion("A vulnerabilidade que permite a execução de scripts maliciosos em páginas web é abreviada como _______.", "xss", Difficulty.MEDIUM));
        questions.add(new FillBlankQuestion("O ataque que explora consultas de banco de dados mal sanitizadas é conhecido como SQL _______.", "injection", Difficulty.MEDIUM));
        questions.add(new FillBlankQuestion("O algoritmo de hash recomendado para armazenar senhas com segurança, projetado para ser lento, é o _______.", "bcrypt", Difficulty.MEDIUM));
        questions.add(new FillBlankQuestion("O sistema isca criado para atrair e estudar atacantes é chamado de _______.", "honeypot", Difficulty.MEDIUM));
        questions.add(new FillBlankQuestion("A sigla que representa o controle de acesso baseado em papéis ou funções é _______.", "rbac", Difficulty.MEDIUM));
        questions.add(new FillBlankQuestion("O ataque que intercepta a comunicação entre duas partes sem que elas saibam é chamado de man-in-the-_______.", "middle", Difficulty.MEDIUM));
        questions.add(new FillBlankQuestion("O teste de segurança que simula ataques reais para encontrar vulnerabilidades é chamado de _______.", "pentest", Difficulty.MEDIUM));
        questions.add(new FillBlankQuestion("A prática de conceder a cada usuário apenas o acesso mínimo necessário é o princípio do menor _______.", "privilegio", Difficulty.MEDIUM));
        questions.add(new FillBlankQuestion("Em Java, a coleção que mantém chaves ordenadas automaticamente é a Tree_______.", "map", Difficulty.MEDIUM));
        questions.add(new FillBlankQuestion("O protocolo que permite login único em múltiplos sistemas é abreviado como SSO, que significa Single Sign-_______.", "on", Difficulty.MEDIUM));
        questions.add(new FillBlankQuestion("Em segurança, o termo que descreve a manipulação psicológica de pessoas para obter dados é engenharia _______.", "social", Difficulty.MEDIUM));
        questions.add(new FillBlankQuestion("A camada de segurança que filtra pacotes de entrada e saída de uma rede é o _______.", "firewall", Difficulty.MEDIUM));
        questions.add(new FillBlankQuestion("O processo de converter dados criptografados de volta ao formato original é chamado de _______.", "decriptografia", Difficulty.MEDIUM));
        questions.add(new FillBlankQuestion("Em Java, a anotação usada para indicar que um método sobrescreve outro da superclasse é @_______.", "override", Difficulty.MEDIUM));
        questions.add(new FillBlankQuestion("O padrão arquitetural que separa Model, View e Controller é abreviado como _______.", "mvc", Difficulty.MEDIUM));
        questions.add(new FillBlankQuestion("A ferramenta de containerização mais popular para empacotar aplicações é o _______.", "docker", Difficulty.MEDIUM));
        questions.add(new FillBlankQuestion("Em redes, o protocolo que traduz endereços IP públicos para privados é abreviado como _______.", "nat", Difficulty.MEDIUM));
        questions.add(new FillBlankQuestion("O tipo de teste automatizado que verifica unidades isoladas de código chama-se teste de _______.", "unidade", Difficulty.MEDIUM));

        // HARD (120 Questões: 30 MCQ, 30 TF, 30 TIMED, 30 BLANK)

        // --- MCQ ---
        questions.add(new MultipleChoiceQuestion("Em um sistema com paginação de memória, qual problema ocorre quando um processo acessa uma página que não está carregada na memória física?", Arrays.asList("Buffer overflow", "Page fault", "Segmentation fault", "Cache miss"), 1, Difficulty.HARD));
        questions.add(new MultipleChoiceQuestion("Qual das seguintes afirmações descreve corretamente o Teorema CAP em sistemas distribuídos?", Arrays.asList("Garante as três propriedades", "Garante só duas das três", "C e A sempre sacrificadas", "Só vale p/ bancos relacionais"), 1, Difficulty.HARD));
        questions.add(new MultipleChoiceQuestion("Na arquitetura RISC-V, o que diferencia instruções do tipo R das do tipo I?", Arrays.asList("Tipo R só usa memória", "R usa regs; I usa imediato", "R tem 16 bits; I tem 32 bits", "R é só para ponto flutuante"), 1, Difficulty.HARD));
        questions.add(new MultipleChoiceQuestion("Qual técnica de sincronização garante exclusão mútua sem utilizar espera ocupada (busy waiting)?", Arrays.asList("Spinlock", "Variável de condição com mutex", "Test-and-Set", "Polling"), 1, Difficulty.HARD));
        questions.add(new MultipleChoiceQuestion("Considerando a complexidade de tempo, qual é o limite inferior teórico (lower bound) para algoritmos de ordenação baseados em comparação?", Arrays.asList("O(n)", "O(n log n)", "O(log n)", "O(n²)"), 1, Difficulty.HARD));
        questions.add(new MultipleChoiceQuestion("Qual nível de isolamento de transações em bancos de dados relacionais impede completamente leituras sujas, leituras não-repetíveis e leituras fantasmas?", Arrays.asList("Read Committed", "Read Uncommitted", "Repeatable Read", "Serializable"), 3, Difficulty.HARD));
        questions.add(new MultipleChoiceQuestion("Em redes, qual protocolo de roteamento dinâmico utiliza o algoritmo de vetor de distâncias de Bellman-Ford?", Arrays.asList("OSPF", "BGP", "RIP", "IS-IS"), 2, Difficulty.HARD));
        questions.add(new MultipleChoiceQuestion("Qual das seguintes propriedades caracteriza problemas que pertencem à classe NP-Completo?", Arrays.asList("Resolvidos em tempo polinomial", "Verificáveis e redutíveis a NP", "Solução exata e tempo linear", "Sem aproximação viável"), 1, Difficulty.HARD));
        questions.add(new MultipleChoiceQuestion("No garbage collector do Java (G1), como a memória Heap é gerenciada e particionada?", Arrays.asList("Stack e Queue fixas", "Eden, Survivor e Old Gen", "Lista encadeada global", "Ponteiros e memória C-Native"), 1, Difficulty.HARD));
        questions.add(new MultipleChoiceQuestion("No padrão OAuth 2.0, qual fluxo de concessão (Grant Type) é recomendado para aplicações do tipo Single Page Application (SPA) que utilizam servidores backend seguros?", Arrays.asList("Implicit Grant", "Authorization Code com PKCE", "Client Credentials", "Resource Owner Password"), 1, Difficulty.HARD));
        questions.add(new MultipleChoiceQuestion("Qual técnica criptográfica permite verificar a integridade de uma mensagem sem revelar seu conteúdo original?", Arrays.asList("Compressão", "Função hash criptográfica", "Tokenização reversível", "Codificação Base64"), 1, Difficulty.HARD));
        questions.add(new MultipleChoiceQuestion("No protocolo TLS, qual mecanismo é usado para troca segura de chaves sem transmiti-las diretamente?", Arrays.asList("RSA simples", "Diffie-Hellman", "Base64", "CRC32"), 1, Difficulty.HARD));
        questions.add(new MultipleChoiceQuestion("O que caracteriza um ataque de 'buffer overflow' em sistemas de baixo nível?", Arrays.asList("Excesso de tráfego de rede", "Escrita além do buffer", "Falha em consulta SQL", "Erro de DNS"), 1, Difficulty.HARD));
        questions.add(new MultipleChoiceQuestion("Qual técnica de exploração de software tira proveito de uma corrida entre verificação e uso de um recurso?", Arrays.asList("Race condition / TOCTOU", "Buffer underflow", "Stack canary", "ASLR"), 0, Difficulty.HARD));
        questions.add(new MultipleChoiceQuestion("O que é 'Zero-Day' em segurança da informação?", Arrays.asList("Backup diário", "Falha sem correção conhecida", "Teste de carga", "Protocolo de rede"), 1, Difficulty.HARD));
        questions.add(new MultipleChoiceQuestion("Qual mecanismo de proteção de memória dificulta a exploração de buffer overflows aleatorizando endereços?", Arrays.asList("DEP", "ASLR", "Firewall", "NAT"), 1, Difficulty.HARD));
        questions.add(new MultipleChoiceQuestion("No contexto de criptografia assimétrica, qual algoritmo é amplamente usado para troca de chaves e assinaturas digitais baseado em curvas elípticas?", Arrays.asList("RSA", "ECC", "DES", "MD5"), 1, Difficulty.HARD));
        questions.add(new MultipleChoiceQuestion("Qual ataque explora a confiança implícita entre serviços internos de uma rede já comprometida?", Arrays.asList("Phishing", "Movimento lateral", "DNS spoofing", "Brute force"), 1, Difficulty.HARD));
        questions.add(new MultipleChoiceQuestion("O que caracteriza um 'rootkit'?", Arrays.asList("Antivírus avançado", "Malware oculto no sistema", "Protocolo de backup", "Firewall de aplicação"), 1, Difficulty.HARD));
        questions.add(new MultipleChoiceQuestion("Qual técnica de defesa em profundidade combina múltiplas camadas de segurança independentes?", Arrays.asList("Single point of failure", "Defense in depth", "Monolito de segurança", "Acesso irrestrito"), 1, Difficulty.HARD));
        questions.add(new MultipleChoiceQuestion("Em criptoanálise, o que é um ataque de 'texto cifrado escolhido'?", Arrays.asList("Atacante escolhe o cifrado", "Atacante só observa tráfego", "Atacante quebra hardware", "Atacante engana por e-mail"), 0, Difficulty.HARD));
        questions.add(new MultipleChoiceQuestion("Qual modelo de controle de acesso usa rótulos de sensibilidade fixos definidos pelo sistema, não pelo usuário?", Arrays.asList("DAC", "MAC", "RBAC simples", "ACL livre"), 1, Difficulty.HARD));
        questions.add(new MultipleChoiceQuestion("O que é 'pass-the-hash' em ataques a sistemas Windows?", Arrays.asList("Quebra de senha bruta", "Reuso de hash capturado", "Ataque físico ao HD", "Falha em chave simétrica"), 1, Difficulty.HARD));
        questions.add(new MultipleChoiceQuestion("Qual vulnerabilidade ocorre quando dados não confiáveis são desserializados sem validação?", Arrays.asList("Deserialização insegura", "Cross-Site Scripting", "Clickjacking", "DNS cache poisoning"), 0, Difficulty.HARD));
        questions.add(new MultipleChoiceQuestion("Em sistemas distribuídos seguros, o que é 'least common mechanism'?", Arrays.asList("Compartilhar tudo livremente", "Minimizar mecanismos comuns", "Maximizar privilégios padrão", "Desativar logs de auditoria"), 1, Difficulty.HARD));
        questions.add(new MultipleChoiceQuestion("Qual técnica de ofuscação de tráfego dificulta a análise de pacotes por um atacante na rede?", Arrays.asList("Texto plano", "Criptografia de ponta a ponta", "Logs verbosos", "Portas padrão abertas"), 1, Difficulty.HARD));
        questions.add(new MultipleChoiceQuestion("O que caracteriza o ataque de 'DNS cache poisoning'?", Arrays.asList("Sobrecarga de banda", "Corrupção de cache DNS", "Falha em certificado SSL", "Erro de sintaxe SQL"), 1, Difficulty.HARD));
        questions.add(new MultipleChoiceQuestion("Qual prática de desenvolvimento seguro recomenda validar e sanitizar toda entrada externa do usuário?", Arrays.asList("Confiar na entrada do cliente", "Validação no lado do servidor", "Desativar logs de erro", "Usar apenas validação visual"), 1, Difficulty.HARD));
        questions.add(new MultipleChoiceQuestion("Em criptografia, o que é 'forward secrecy'?", Arrays.asList("Reuso da mesma chave sempre", "Sessão isola o passado", "Criptografia sem chave", "Backup de chaves em texto puro"), 1, Difficulty.HARD));
        questions.add(new MultipleChoiceQuestion("Qual das opções representa uma técnica de 'privilege escalation'?", Arrays.asList("Reduzir permissões do processo", "Explorar falha e ganhar acesso", "Criar backup de dados", "Desligar serviços não usados"), 1, Difficulty.HARD));

        // --- TRUE/FALSE ---
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
        questions.add(new TrueFalseQuestion("Um ataque de 'Zero-Day' explora uma vulnerabilidade que já possui correção publicada pelo fornecedor.", false, Difficulty.HARD));
        questions.add(new TrueFalseQuestion("ASLR (Address Space Layout Randomization) dificulta exploits ao randomizar endereços de memória em cada execução.", true, Difficulty.HARD));
        questions.add(new TrueFalseQuestion("Em modelos MAC (Mandatory Access Control), o usuário comum pode alterar livremente as permissões de seus próprios arquivos.", false, Difficulty.HARD));
        questions.add(new TrueFalseQuestion("Forward secrecy garante que a quebra de uma chave de sessão não compromete sessões anteriores.", true, Difficulty.HARD));
        questions.add(new TrueFalseQuestion("Pass-the-hash é uma técnica que reutiliza credenciais previamente capturadas sem conhecer a senha original.", true, Difficulty.HARD));
        questions.add(new TrueFalseQuestion("Rootkits são projetados para serem facilmente detectados por antivírus convencionais.", false, Difficulty.HARD));
        questions.add(new TrueFalseQuestion("Um ataque de movimento lateral ocorre quando um atacante já comprometeu um host e tenta acessar outros na mesma rede.", true, Difficulty.HARD));
        questions.add(new TrueFalseQuestion("DNS cache poisoning corrompe registros DNS armazenados para redirecionar usuários a sites maliciosos.", true, Difficulty.HARD));
        questions.add(new TrueFalseQuestion("Em criptoanálise, um ataque de 'texto cifrado escolhido' não exige nenhuma interação com o sistema de decifração.", false, Difficulty.HARD));
        questions.add(new TrueFalseQuestion("A desserialização insegura de dados não confiáveis pode levar à execução remota de código.", true, Difficulty.HARD));
        questions.add(new TrueFalseQuestion("O princípio do 'least common mechanism' recomenda compartilhar o máximo de recursos entre todos os usuários possíveis.", false, Difficulty.HARD));
        questions.add(new TrueFalseQuestion("Em sistemas distribuídos, o Two-Phase Commit garante atomicidade entre múltiplos nós participantes de uma transação.", true, Difficulty.HARD));
        questions.add(new TrueFalseQuestion("O algoritmo RSA depende da dificuldade computacional de fatorar grandes números primos.", true, Difficulty.HARD));
        questions.add(new TrueFalseQuestion("Buffer overflow é um problema exclusivo de linguagens de alto nível com coletor de lixo automático.", false, Difficulty.HARD));
        questions.add(new TrueFalseQuestion("Diffie-Hellman permite que duas partes estabeleçam uma chave secreta compartilhada sobre um canal não seguro.", true, Difficulty.HARD));
        questions.add(new TrueFalseQuestion("Um honeypot tem como objetivo principal aumentar o desempenho de uma rede corporativa.", false, Difficulty.HARD));
        questions.add(new TrueFalseQuestion("Privilege escalation refere-se à obtenção de níveis de acesso maiores do que os originalmente concedidos.", true, Difficulty.HARD));
        questions.add(new TrueFalseQuestion("Em segurança, 'defense in depth' significa confiar em uma única camada robusta de proteção.", false, Difficulty.HARD));
        questions.add(new TrueFalseQuestion("O TLS moderno (1.2/1.3) é projetado para fornecer confidencialidade e integridade na comunicação em rede.", true, Difficulty.HARD));
        questions.add(new TrueFalseQuestion("Cross-Site Scripting (XSS) e SQL Injection exploram exatamente a mesma camada e o mesmo vetor de ataque.", false, Difficulty.HARD));

        // --- TIMED ---
        questions.add(new TimedMultipleChoiceQuestion("[CRONOMETRADA] No escalonamento de processos, qual algoritmo pode sofrer do problema de Starvation crônico?", Arrays.asList("Round-Robin", "SJF não-preemptivo", "Prioridade Estática", "FCFS"), 2, Difficulty.HARD, 12));
        questions.add(new TimedMultipleChoiceQuestion("[CRONOMETRADA] Qual padrão de projeto estrutural converte a interface de uma classe em outra interface esperada pelos clientes locais?", Arrays.asList("Proxy", "Adapter", "Decorator", "Facade"), 1, Difficulty.HARD, 12));
        questions.add(new TimedMultipleChoiceQuestion("[CRONOMETRADA] Qual das seguintes opções representa uma árvore AVL válida após uma inserção desbalanceada à esquerda?", Arrays.asList("Rotação Simples à Direita", "Rotação Dupla à Direita", "Inversão de Cores", "Split de Nodo"), 0, Difficulty.HARD, 12));
        questions.add(new TimedMultipleChoiceQuestion("[CRONOMETRADA] Em Redes, qual é o tamanho total em bits do cabeçalho mínimo do protocolo IPv6?", Arrays.asList("160 bits", "320 bits", "640 bits", "1280 bits"), 1, Difficulty.HARD, 12));
        questions.add(new TimedMultipleChoiceQuestion("[CRONOMETRADA] No contexto de transações distribuídas, qual protocolo é comumente empregado para garantir a atomicidade global entre nós distintos?", Arrays.asList("Raft", "Paxos", "Two-Phase Commit (2PC)", "Gossip Protocol"), 2, Difficulty.HARD, 12));
        questions.add(new TimedMultipleChoiceQuestion("[CRONOMETRADA] Em Java, qual palavra-chave indica que o valor de uma variável lida por múltiplas threads será sempre extraído diretamente da memória principal?", Arrays.asList("synchronized", "transient", "volatile", "strictfp"), 2, Difficulty.HARD, 12));
        questions.add(new TimedMultipleChoiceQuestion("[CRONOMETRADA] Qual das expressões abaixo em notação Big-O representa a complexidade de tempo do algoritmo de multiplicação de matrizes clássico de Strassen?", Arrays.asList("O(n³)", "O(n^2.81)", "O(n log n)", "O(n²)"), 1, Difficulty.HARD, 12));
        questions.add(new TimedMultipleChoiceQuestion("[CRONOMETRADA] No modelo de memória do Java, onde os objetos instanciados dinamicamente via operador 'new' são explicitamente armazenados?", Arrays.asList("Stack Memory", "Metaspace", "Heap Memory", "Register Array"), 2, Difficulty.HARD, 12));
        questions.add(new TimedMultipleChoiceQuestion("[CRONOMETRADA] Em Engenharia de Software, qual métrica avalia o número de caminhos linearmente independentes através do código do programa?", Arrays.asList("Coesão", "Acoplamento", "Complexidade Ciclomática", "Dívida Técnica"), 2, Difficulty.HARD, 12));
        questions.add(new TimedMultipleChoiceQuestion("[CRONOMETRADA] No Git, qual funcionalidade aplica as alterações introduzidas por commits específicos de outra branch diretamente na branch atual?", Arrays.asList("git merge", "git cherry-pick", "git revert", "git fetch"), 1, Difficulty.HARD, 12));
        questions.add(new TimedMultipleChoiceQuestion("[CRONOMETRADA] Qual mecanismo criptográfico assina digitalmente um certificado para garantir sua autenticidade?", Arrays.asList("Chave simétrica", "Autoridade Certificadora (CA)", "Hash MD5 isolado", "Compressão gzip"), 1, Difficulty.HARD, 12));
        questions.add(new TimedMultipleChoiceQuestion("[CRONOMETRADA] Qual técnica de ataque explora o tempo de resposta de um sistema para inferir dados sensíveis?", Arrays.asList("Timing attack", "Brute force simples", "Phishing", "DNS spoofing"), 0, Difficulty.HARD, 12));
        questions.add(new TimedMultipleChoiceQuestion("[CRONOMETRADA] Qual algoritmo de criptografia simétrica moderno é considerado padrão (AES) pelo NIST?", Arrays.asList("DES", "RC4", "AES", "MD5"), 2, Difficulty.HARD, 12));
        questions.add(new TimedMultipleChoiceQuestion("[CRONOMETRADA] Qual destes representa um ataque de 'side-channel'?", Arrays.asList("Análise de consumo de energia", "Phishing por SMS", "Engenharia social verbal", "Spam de e-mail"), 0, Difficulty.HARD, 12));
        questions.add(new TimedMultipleChoiceQuestion("[CRONOMETRADA] No modelo STRIDE de ameaças, o que a letra 'T' representa?", Arrays.asList("Spoofing", "Tampering", "Repudiation", "Denial of Service"), 1, Difficulty.HARD, 12));
        questions.add(new TimedMultipleChoiceQuestion("[CRONOMETRADA] Qual técnica de hardening reduz a superfície de ataque desabilitando serviços não essenciais?", Arrays.asList("Hardening de sistema", "Phishing reverso", "DNS round-robin", "Load balancing"), 0, Difficulty.HARD, 12));
        questions.add(new TimedMultipleChoiceQuestion("[CRONOMETRADA] Qual destes é um framework usado para modelar ameaças de segurança em sistemas?", Arrays.asList("STRIDE", "MVC", "REST", "ACID"), 0, Difficulty.HARD, 12));
        questions.add(new TimedMultipleChoiceQuestion("[CRONOMETRADA] Em criptografia, o que é um 'salt' aplicado antes do hash de uma senha?", Arrays.asList("Compressão de dados", "Valor aleatório por senha", "Chave pública do servidor", "Protocolo de rede"), 1, Difficulty.HARD, 12));
        questions.add(new TimedMultipleChoiceQuestion("[CRONOMETRADA] Qual destes ataques explora falhas em controle de sessão para assumir a identidade de um usuário?", Arrays.asList("Session hijacking", "Buffer overflow", "Race condition", "Path traversal"), 0, Difficulty.HARD, 12));
        questions.add(new TimedMultipleChoiceQuestion("[CRONOMETRADA] Qual vulnerabilidade permite acessar arquivos fora do diretório permitido via manipulação de caminho?", Arrays.asList("SQL Injection", "Path Traversal", "XSS", "CSRF"), 1, Difficulty.HARD, 12));
        questions.add(new TimedMultipleChoiceQuestion("[CRONOMETRADA] Qual sigla representa um ataque que força o navegador a executar ações não autorizadas em nome do usuário?", Arrays.asList("XSS", "CSRF", "DDoS", "ARP"), 1, Difficulty.HARD, 12));
        questions.add(new TimedMultipleChoiceQuestion("[CRONOMETRADA] Qual modelo de maturidade de segurança avalia processos de desenvolvimento seguro de software?", Arrays.asList("BMM", "SAMM", "CMM clássico", "ITIL"), 1, Difficulty.HARD, 12));
        questions.add(new TimedMultipleChoiceQuestion("[CRONOMETRADA] Qual técnica usa múltiplos servidores DNS falsos para redirecionar tráfego em massa?", Arrays.asList("DNS spoofing distribuído", "Phishing", "SQL Injection", "Buffer overflow"), 0, Difficulty.HARD, 12));
        questions.add(new TimedMultipleChoiceQuestion("[CRONOMETRADA] Em segurança de aplicações, o que é 'input sanitization'?", Arrays.asList("Aumentar a velocidade do banco", "Validar dados de entrada", "Criptografar o disco rígido", "Compactar logs do servidor"), 1, Difficulty.HARD, 12));
        questions.add(new TimedMultipleChoiceQuestion("[CRONOMETRADA] Qual destes é um exemplo de controle de segurança 'detectivo', e não preventivo?", Arrays.asList("Firewall", "Sistema de detecção (IDS)", "Criptografia de disco", "Autenticação multifator"), 1, Difficulty.HARD, 12));
        questions.add(new TimedMultipleChoiceQuestion("[CRONOMETRADA] Qual algoritmo assimétrico baseado em curvas elípticas é mais eficiente que o RSA para o mesmo nível de segurança?", Arrays.asList("DES", "ECC", "MD5", "SHA-1"), 1, Difficulty.HARD, 12));
        questions.add(new TimedMultipleChoiceQuestion("[CRONOMETRADA] Qual destes representa o conceito de 'fail securely' em design de sistemas?", Arrays.asList("Falhar abrindo todo acesso", "Negar acesso por padrão", "Ignorar falhas silenciosamente", "Reiniciar sem log"), 1, Difficulty.HARD, 12));
        questions.add(new TimedMultipleChoiceQuestion("[CRONOMETRADA] Qual técnica de defesa limita quantas vezes um usuário pode tentar logar antes de bloquear a conta?", Arrays.asList("Rate limiting / lockout", "Load balancing", "Caching", "Replicação de dados"), 0, Difficulty.HARD, 12));
        questions.add(new TimedMultipleChoiceQuestion("[CRONOMETRADA] Qual destes protocolos é vulnerável a ataques de 'downgrade' caso não configurado corretamente?", Arrays.asList("TLS", "RSA isolado", "AES isolado", "Hash SHA-256"), 0, Difficulty.HARD, 12));
        questions.add(new TimedMultipleChoiceQuestion("[CRONOMETRADA] Qual destes é um exemplo de 'Indicator of Compromise' (IoC) usado em resposta a incidentes?", Arrays.asList("Cor da interface", "Hash de arquivo malicioso", "Versão do navegador", "Idioma do sistema"), 1, Difficulty.HARD, 12));

        // --- BLANK ---
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
        questions.add(new FillBlankQuestion("A vulnerabilidade que explora a desserialização de dados não confiáveis para executar código remoto é chamada de desserialização _______.", "insegura", Difficulty.HARD));
        questions.add(new FillBlankQuestion("O valor aleatório único adicionado a uma senha antes de aplicar a função hash é chamado de _______.", "salt", Difficulty.HARD));
        questions.add(new FillBlankQuestion("A técnica de reutilizar um hash de credencial capturado, sem conhecer a senha original, é chamada de pass-the-_______.", "hash", Difficulty.HARD));
        questions.add(new FillBlankQuestion("O mecanismo de proteção de memória que randomiza endereços para dificultar exploits é abreviado como _______.", "aslr", Difficulty.HARD));
        questions.add(new FillBlankQuestion("A propriedade criptográfica que garante que a quebra de uma chave atual não compromete sessões passadas é chamada de forward _______.", "secrecy", Difficulty.HARD));
        questions.add(new FillBlankQuestion("O protocolo de troca de chaves que permite duas partes estabelecerem um segredo compartilhado em canal inseguro é o _______.", "diffie-hellman", Difficulty.HARD));
        questions.add(new FillBlankQuestion("O ataque que corrompe registros DNS em cache para redirecionar usuários a sites maliciosos é chamado de DNS cache _______.", "poisoning", Difficulty.HARD));
        questions.add(new FillBlankQuestion("A vulnerabilidade que permite acessar arquivos fora do diretório autorizado via manipulação de caminho é chamada de path _______.", "traversal", Difficulty.HARD));
        questions.add(new FillBlankQuestion("O ataque que força o navegador de um usuário autenticado a executar ações não desejadas é abreviado como _______.", "csrf", Difficulty.HARD));
        questions.add(new FillBlankQuestion("O modelo de ameaças que organiza ataques em seis categorias, incluindo Spoofing e Tampering, é conhecido pela sigla _______.", "stride", Difficulty.HARD));
        questions.add(new FillBlankQuestion("O sistema que detecta atividades suspeitas em uma rede e gera alertas é abreviado como _______.", "ids", Difficulty.HARD));
        questions.add(new FillBlankQuestion("A prática de reduzir a superfície de ataque desabilitando serviços e portas não essenciais é chamada de _______.", "hardening", Difficulty.HARD));
        questions.add(new FillBlankQuestion("Em criptografia simétrica, o algoritmo padrão atual recomendado pelo NIST é abreviado como _______.", "aes", Difficulty.HARD));
        questions.add(new FillBlankQuestion("O ataque que explora o tempo de resposta de um sistema para inferir informações sensíveis é chamado de timing _______.", "attack", Difficulty.HARD));
        questions.add(new FillBlankQuestion("A técnica em que um atacante já dentro da rede tenta comprometer outros hosts é chamada de movimento _______.", "lateral", Difficulty.HARD));
        questions.add(new FillBlankQuestion("O malware projetado para ocultar sua presença e manter acesso persistente ao sistema é chamado de _______.", "rootkit", Difficulty.HARD));
        questions.add(new FillBlankQuestion("A obtenção indevida de privilégios maiores do que os originalmente concedidos é chamada de escalonamento de _______.", "privilegio", Difficulty.HARD));
        questions.add(new FillBlankQuestion("O protocolo moderno que substitui o SSL para garantir comunicação segura na web é o _______.", "tls", Difficulty.HARD));
        questions.add(new FillBlankQuestion("Em segurança, o princípio de negar acesso por padrão quando um sistema falha é chamado de fail-_______.", "securely", Difficulty.HARD));
        questions.add(new FillBlankQuestion("A entidade responsável por emitir e assinar certificados digitais confiáveis é chamada de Autoridade _______.", "certificadora", Difficulty.HARD));

    }

    public List<Question> FilterByDifficulty(Difficulty difficulty){
        return questions.stream()
                .filter(q -> q.getDifficulty() == difficulty)
                .collect(Collectors.toList());
    }
}