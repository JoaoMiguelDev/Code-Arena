# CodeArena: Batalha do Conhecimento

**CodeArena** é um jogo educacional onde você enfrenta oponentes em batalhas de perguntas e respostas.  
Cada rodada testa seus conhecimentos, e suas respostas definem os rumos da luta: acertar causa dano no adversário.

## Como funciona

- Você escolhe um personagem com características únicas.
- Em cada rodada, uma pergunta aparece (múltipla escolha ou verdadeiro/falso).
- Ao acertar, você ataca o inimigo.
- O combate continua até que alguém fique sem vida.
- Conforme avança, os desafios ficam mais difíceis e novos oponentes surgem.

## Habilidades especiais

Durante a batalha, é possível usar habilidades que ajudam a virar o jogo, como:
- Remover alternativas erradas
- Escolher dificuldade da pergunta
- Dar dano mesmo errando a pergunta
- Recuperar vida ao atacar

## Temas e perguntas

O jogo conta com perguntas de diversas área da compuação, como:  
redes, algoritmos e estrutura de dados, LPOO, Sistemas operacionais, entre outros.  
As perguntas são organizadas por dificuldade.

## Progressão

Você enfrenta uma sequência de batalhas contra oponentes cada vez mais fortes até o chefe final.

## Objetivo

Demonstrar, na prática, os conceitos de **Programação Orientada a Objetos** (herança, polimorfismo, interfaces e encapsulamento), ao mesmo tempo que oferece uma experiência divertida e educativa.

## Como Compilar e Executar o Projeto (Via Terminal)

Para garantir que o Java reconheça a estrutura de pacotes do projeto, execute os comandos abaixo a partir do diretório raiz do projeto (onde a pasta `src` está localizada):

### 1. Comando para Compilar
Este comando compila todas as classes dos pacotes e salva os arquivos prontos na pasta `bin`:
```bash
javac -d bin src/game/*.java src/model/battle/*.java src/model/character/*.java src/model/question/*.java
```
### 1. Comando para Executar
```bash
java -cp bin game.Main
```
