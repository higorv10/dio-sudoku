package sudoku;

import java.util.Scanner;

public class SudokuGame {
    private SudokuBoard board;
    private Scanner scanner;

    public SudokuGame(int[][] initialNumbers) {
        this.board = new SudokuBoard(initialNumbers);
        this.scanner = new Scanner(System.in);
    }

    public void startGame() {
        while (true) {
            System.out.println("1. Iniciar um novo jogo");
            System.out.println("2. Colocar um novo número");
            System.out.println("3. Remover um número");
            System.out.println("4. Verificar jogo");
            System.out.println("5. Verificar status do jogo");
            System.out.println("6. Limpar");
            System.out.println("7. Finalizar o jogo");
            System.out.print("Escolha uma opção: ");
            int option = scanner.nextInt();
            switch (option) {
                case 1:
                    board.resetBoard();
                    break;
                case 2:
                    placeNumber();
                    break;
                case 3:
                    removeNumber();
                    break;
                case 4:
                    board.printBoard();
                    break;
                case 5:
                    checkStatus();
                    break;
                case 6:
                    board.clearUserNumbers();
                    break;
                case 7:
                    if (board.isGameCompleted()) {
                        System.out.println("Jogo finalizado!");
                        return;
                    } else {
                        System.out.println("Jogo não está completo. Por favor, preencha todos os espaços.");
                    }
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
            }
        }
    }

    private void placeNumber() {
        System.out.print("Digite o número a ser colocado: ");
        int number = scanner.nextInt();
        while (number < 1 || number > 9) {
            System.out.print("Número inválido. Por favor, digite um valor entre 1 e 9: ");
            number = scanner.nextInt();
        }
        System.out.print("Digite o número da linha (1-9): ");
        int row = scanner.nextInt() - 1; // Subtrai 1 para obter o índice correto
        System.out.print("Digite o número da coluna (1-9): ");
        int col = scanner.nextInt() - 1; // Subtrai 1 para obter o índice correto
        if (row < 0 || row > 8 || col < 0 || col > 8) {
            System.out.println("Linha ou coluna inválida. Por favor, digite um valor entre 1 e 9.");
        } else if (board.isValidPosition(row, col)) {
            board.placeNumber(row, col, number);
        } else {
            System.out.println("Posição inválida. Por favor, escolha uma posição vazia.");
        }
    }

    private void removeNumber() {
        System.out.print("Digite o número da linha do número a ser removido (1-9): ");
        int row = scanner.nextInt() - 1; // Subtrai 1 para obter o índice correto
        System.out.print("Digite o número da coluna do número a ser removido (1-9): ");
        int col = scanner.nextInt() - 1; // Subtrai 1 para obter o índice correto
        if (row < 0 || row > 8 || col < 0 || col > 8) {
            System.out.println("Linha ou coluna inválida. Por favor, digite um valor entre 1 e 9.");
        } else if (board.isFixedNumber(row, col)) {
            System.out.println("Número fixo. Não é possível remover.");
        } else {
            board.removeNumber(row, col);
        }
    }

    private void checkStatus() {
        SudokuValidator validator = new SudokuValidator(board);
        if (validator.hasErrors()) {
            System.out.println("Jogo contém erros.");
        } else {
            System.out.println("Jogo está válido.");
        }
        if (board.isGameCompleted()) {
            System.out.println("Jogo está completo.");
        } else {
            System.out.println("Jogo está incompleto.");
        }
    }
}