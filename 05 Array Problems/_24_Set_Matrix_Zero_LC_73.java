package _05_ArrayProblems;

public class _24_Set_Matrix_Zero_LC_73 {

    public void setZeroes(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;
        boolean col0 = false; // Separate flag for the first column

        // Step 1: Scan the matrix and mark flags in the first row/col
        for (int i = 0; i < rows; i++) {
            // Check if the 0th column itself needs to be zeroed out
            if (matrix[i][0] == 0) {
                col0 = true;
            }

            // Scan the rest of the row
            for (int j = 1; j < columns; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0; // Mark row flag
                    matrix[0][j] = 0; // Mark column flag
                }
            }
        }

        // Step 2: Use the flags to zero out cells (from bottom-right to top-left)
        // This ensures we don't overwrite our flags prematurely
        for (int i = rows - 1; i >= 0; i--) {
            for (int j = columns - 1; j >= 1; j--) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
            // Finally, update the 0th column using our separate flag
            if (col0) {
                matrix[i][0] = 0;
            }
        }
    }
}
