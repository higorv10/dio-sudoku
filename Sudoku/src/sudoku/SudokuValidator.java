package sudoku;

public class SudokuValidator {
    private SudokuBoard board;

    public SudokuValidator(SudokuBoard board) {
        this.board = board;
    }

    public boolean hasErrors() {
        // Verificar linhas
        for (int i = 0; i < 9; i++) {
            int[] row = board.getRow(i);
            if (!isValidRow(row)) {
                return true;
            }
        }

        // Verificar colunas
        for (int i = 0; i < 9; i++) {
            int[] col = board.getCol(i);
            if (!isValidCol(col)) {
                return true;
            }
        }

        // Verificar quadrados 3x3
        for (int i = 0; i < 9; i += 3) {
            for (int j = 0; j < 9; j += 3) {
                int[] square = board.getSquare(i, j);
                if (!isValidSquare(square)) {
                    return true;
                }
            }
        }

        return false;
    }

    private boolean isValidRow(int[] row) {
        boolean[] seen = new boolean[9];
        for (int num : row) {
            if (num != 0) {
                if (seen[num - 1]) {
                    return false;
                }
                seen[num - 1] = true;
            }
        }
        return true;
    }

    private boolean isValidCol(int[] col) {
        boolean[] seen = new boolean[9];
        for (int num : col) {
            if (num != 0) {
                if (seen[num - 1]) {
                    return false;
                }
                seen[num - 1] = true;
            }
        }
        return true;
    }

    private boolean isValidSquare(int[] square) {
        boolean[] seen = new boolean[9];
        for (int num : square) {
            if (num != 0) {
                if (seen[num - 1]) {
                    return false;
                }
                seen[num - 1] = true;
            }
        }
        return true;
    }
}