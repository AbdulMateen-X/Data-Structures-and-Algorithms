package _06_BinarySearch;

public class _03_Upper_Bound {
    int upperBound(int[] arr, int target) {
        int low = 0,high = arr.length;
        while(low<high){
            int mid = low + (high - low)/2;
            if(arr[mid] > target)
                high = mid;
            else
                low = mid + 1;
        }
        return low;
    }
}
