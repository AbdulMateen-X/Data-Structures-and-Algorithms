package _06_BinarySearch;

public class _20_Kth_Missing_Positive_Number_LC_1539 {
    public int findKthPositive(int[] arr, int k) {
        int low = 0, high = arr.length-1;
        while(low<=high){
            int mid = low + (high-low)/2;

           if((arr[mid]-mid-1) >= k)
               high = mid - 1;

           else
               low = mid + 1;
        }
        return low+k; //return arr[high] + (k - missing_at_high) = return low + k
    }
}
