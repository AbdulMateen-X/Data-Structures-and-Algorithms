package _06_BinarySearch;

public class _04_Search_Index_Position_LC_35 {
    public int searchInsert(int[] nums, int target) {
        int low = 0,high = nums.length;
        while(low<high){
            int mid = low + (high-low)/2;
            if(nums[mid] >= target){
                high = mid;
            }
            else
                low = mid + 1;

        }
        return low;
    }
}
