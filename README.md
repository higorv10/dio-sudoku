# 🧩 Sudoku em Java
Bem-vindo ao Sudoku em Java! 🎆 Este projeto oferece uma implementação simples de um jogo de Sudoku no terminal. Você pode interagir com o tabuleiro, inserir e remover números, verificar a validade do jogo e muito mais.

## Funcionalidades ✨
  - Iniciar um novo jogo: Comece uma nova partida com um tabuleiro inicial.

  - Colocar um número: Insira um número em uma posição vazia no tabuleiro.

  - Remover um número: Remova um número da posição desejada (exceto os números fixos).

  - Verificar o tabuleiro: Imprima o tabuleiro atual no console.

  - Verificar status do jogo: Veja se o jogo está válido (sem erros) e se o tabuleiro está completo.

  - Limpar: Apague os números inseridos pelo jogador, mas mantenha os números fixos.

  - Finalizar o jogo: Se o jogo estiver completo, ele será finalizado.

## 📂 Estrutura do Projeto 
O projeto é composto pelas seguintes classes:

  - `Main`: Classe principal que inicializa o jogo e interage com o jogador.

  - `SudokuBoard`: Gerencia o tabuleiro, permite inserir, remover e verificar números.

  - `SudokuGame`: Controla as ações do jogo e apresenta o menu de opções.

  - `SudokuValidator`: Valida o tabuleiro, verificando erros nas linhas, colunas e quadrados 3x3.

## Como Rodar ⚙️
Siga os passos abaixo para rodar o jogo em sua máquina local:

1. Clone o repositório:

```bash
git clone https://github.com/higorv10/dio-sudoku.git
```

2. Acesse o diretório do projeto:

```bash
cd dio.sudoku
```
3. Compile o código:

```bash
javac sudoku/*.java
```

4. Execute o jogo:

```bash
java sudoku.Main
```

## 🎮 Exemplo de Jogo 
O jogo oferece um menu interativo onde o usuário pode escolher opções. Veja abaixo um exemplo de interação:
###Exemplo de Interação:

```markdown
1. Iniciar um novo jogo
2. Colocar um novo número
3. Remover um número
4. Verificar jogo
5. Verificar status do jogo
6. Limpar
7. Finalizar o jogo
Escolha uma opção: 2
Digite o número a ser colocado: 5
Digite o número da linha (1-9): 3
Digite o número da coluna (1-9): 3
```
Após essa ação, o número 5 será colocado na posição (3, 3) do tabuleiro, e o usuário pode continuar interagindo conforme o menu.

## 🤔 Como Funciona? 
  - O jogo começa com um tabuleiro inicial (com alguns números fixos).

  - O jogador escolhe uma opção do menu e interage com o tabuleiro.

  - Quando o jogador insere ou remove um número, o jogo verifica a validade da jogada.

  - O jogo também valida se o tabuleiro está completo e sem erros ao ser finalizado.

## 💻 Tecnologias e Bibliotecas 
  - Java 8 ou superior: A linguagem utilizada para o desenvolvimento.

  - Scanner: Utilizado para interagir com o usuário via terminal.

## 📄 Licença
Projeto desenvolvido para fins educacionais na DIO. Sem licença comercial.
