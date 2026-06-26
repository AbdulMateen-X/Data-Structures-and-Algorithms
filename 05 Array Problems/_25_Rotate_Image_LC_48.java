package _05_ArrayProblems;

public class _25_Rotate_Image_LC_48 {
    public void swap(int[][] matrix,int r1,int c1,int r2,int c2){
        int temp = matrix[r1][c1];
        matrix[r1][c1] = matrix [r2][c2];
        matrix[r2][c2] = temp;
    }

    public void rotate(int[][] matrix) {
        int n = matrix.length;

        //Transpose
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(i != j)
                    swap(matrix,i,j,j,i);
            }
        }

        //Reverse each row'
        for(int i=0;i<n;i++){
            for(int j=0;j<n/2;j++){
                swap(matrix,i,j,i,n-j-1);
            }
        }
    }
}
