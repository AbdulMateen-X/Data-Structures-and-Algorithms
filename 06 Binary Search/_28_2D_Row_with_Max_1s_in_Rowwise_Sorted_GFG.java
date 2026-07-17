package _06_BinarySearch;

public class _28_2D_Row_with_Max_1s_in_Rowwise_Sorted_GFG {
    public int rowWithMax1s(int[][] arr) {

        int result = -1;
        int i=0,j = arr[0].length-1;

        while(i<arr.length && j >= 0){
            if(arr[i][j] == 1){
                j--;
                result = i;
            }
            else
                i++;
        }
        return result;
    }
}
