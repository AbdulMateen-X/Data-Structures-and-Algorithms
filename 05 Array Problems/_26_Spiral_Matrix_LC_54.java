//Shrinking cage
package _05_ArrayProblems;
import java.util.List;
import java.util.ArrayList;

public class _26_Spiral_Matrix_LC_54 {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int rows = matrix.length;
        int columns = matrix[0].length;

        int left=0,right=columns-1,top=0,bottom=rows-1;

        while(top<=bottom && left<=right){
            //Right(along top)
            for(int i=left;i<=right;i++){
                result.add(matrix[top][i]);
            }
            top++;

            //Down(along right)
            for(int i=top;i<=bottom;i++){
                result.add(matrix[i][right]);
            }
            right--;

            //Left(along bottom)
            if(top<=bottom) {
                for (int i = right; i >= left; i--) {
                    result.add(matrix[bottom][i]);
                }
                bottom--;
            }

            //Up(along left)
            if(left<= right){
                for (int i = bottom; i >= top; i--) {
                    result.add(matrix[i][left]);
                }
                left++;
            }
        }

        return result;
    }
}
