package _05_ArrayProblems;

public class _06_Move_Zeroes_LC283 {
    public void moveZeroes(int[] arr) {
        int i =0;
        int n = arr.length;
        for(int j=0;j<n;j++){
            if(arr[j] != 0)
                arr[i++] = arr[j];
        }
        while(i<n)
            arr[i++] = 0;
    }
}
