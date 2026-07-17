package _06_BinarySearch;

public class _29_2D_Search_a_2D_Matrix_LC_74 {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length, m = matrix[0].length;
        int low = 0, high = m*n-1;
        while(low<=high){
            int mid = low + (high-low)/2;
            int row = mid/m, col = mid%m;
            if(matrix[row][col] == target)
                return true;
            else if(matrix[row][col] > target)
                high = mid - 1;
            else
                low = mid + 1;
        }
        return false;
    }
}
