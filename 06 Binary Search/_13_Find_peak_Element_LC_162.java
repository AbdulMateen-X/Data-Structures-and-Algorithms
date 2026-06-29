package _06_BinarySearch;

public class _13_Find_peak_Element_LC_162 {
    public int findPeakElement(int[] nums) {
        int low = 0, high = nums.length -1;
        int result = 0;
        while(low<high) {
            int mid = low + (high - low) / 2;

            if(nums[mid] < nums[mid+1]) {
                // Climbing upward to the right, peak must be ahead
                low = mid + 1;
            }
            else {
                // Descending slope, mid itself or something to the left is the peak
                high = mid;
            }
        }
        // low and high will converge perfectly on a peak element index
        return low;
    }
}
