package _05_ArrayProblems;

public class _23_Set_Matrix_Zero_LC_73 {
    public static void setZeroes(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;


        boolean[] zeroRows = new boolean[rows];
        boolean[] zeroColumns = new boolean[columns];

        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                if(matrix[i][j] == 0){
                    zeroRows[i] = true;
                    zeroColumns[j] = true;
                }
            }
        }

        for(int i=0;i<rows;i++){
            if(zeroRows[i]){
                for(int j=0;j<columns;j++){
                    matrix[i][j] = 0;
                }
            }

        }

        for(int j=0;j<columns;j++){
            if(zeroColumns[j]){
                for(int i=0;i<rows;i++){
                    matrix[i][j] = 0;
                }
            }

        }
    }


    public static void main(String[] args){
        int[][] arr = {{0,1}};
        setZeroes(arr);
        System.out.println(arr[0][0]);
        System.out.println(arr[0][1]);
    }
}


