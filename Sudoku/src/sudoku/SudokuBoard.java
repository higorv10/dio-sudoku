package sudoku;

public class SudokuBoard {
    private int[][] board;
    private int[][] initialNumbers;

    public SudokuBoard(int[][] initialNumbers) {
        this.initialNumbers = initialNumbers;
        this.board = new int[9][9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                board[i][j] = initialNumbers[i][j];
            }
        }
    }

    public void resetBoard() {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                board[i][j] = initialNumbers[i][j];
            }
        }
    }

    public void placeNumber(int row, int col, int number) {
        board[row][col] = number;
    }

    public void removeNumber(int row, int col) {
        board[row][col] = 0;
    }

    public boolean isValidPosition(int row, int col) {
        return board[row][col] == 0;
    }

    public boolean isFixedNumber(int row, int col) {
        return initialNumbers[row][col] != 0;
    }

    public void clearUserNumbers() {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (initialNumbers[i][j] == 0) {
                    board[i][j] = 0;
                }
            }
        }
    }

    public void printBoard() {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(board[i][j] + " ");
                if ((j + 1) % 3 == 0 && j < 8) {
                    System.out.print("| ");
                }
            }
            System.out.println();
            if ((i + 1) % 3 == 0 && i < 8) {
                System.out.println("--------|---------|--------");
            }
        }
    }

    public boolean isGameCompleted() {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public int[] getRow(int row) {
        return board[row];
    }

    public int[] getCol(int col) {
        int[] column = new int[9];
        for (int i = 0; i < 9; i++) {
            column[i] = board[i][col];
        }
        return column;
    }

    public int[] getSquare(int row, int col) {
        int[] square = new int[9];
        int index = 0;
        for (int i = row; i < row + 3; i++) {
            for (int j = col; j < col + 3; j++) {
                square[index++] = board[i][j];
            }
        }
        return square;
    }
}