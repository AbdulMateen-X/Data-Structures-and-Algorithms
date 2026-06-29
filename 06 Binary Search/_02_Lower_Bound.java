package _06_BinarySearch;

public class _02_Lower_Bound {

    int lowerBound2(int[] arr, int target) {
        int low = 0,high = arr.length;


        while(low<high){
            int mid = low + (high-low)/2;
            if(arr[mid] >= target){
                high = mid;
            }
            else
                low = mid + 1;

        }
        return low;

    }

    int lowerBound(int[] arr, int target) {
        int low = 0,high = arr.length-1;

        if(arr[high] < target)
            return arr.length;

        int result = -1;

        while(low<=high){
            int mid = low + (high-low)/2;
            if(arr[mid] >= target){
                result = mid;
                high = mid - 1;
            }
            else
                low = mid + 1;

        }
        return result;
    }

}
