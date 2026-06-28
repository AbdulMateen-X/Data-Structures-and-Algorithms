package _06_BinarySearch;

public class _01_Binary_Search_LC_704 {
    public int search(int[] nums, int target) {
        int low = 0,high = nums.length-1;
        while(low<=high){
            int mid = low + (high - low) / 2;
            if(nums[mid] == target){
                return mid;
            }
            if(nums[mid] < target)
                low = mid + 1;
            else
                high = mid -1;
        }

        return -1;
    }
}
