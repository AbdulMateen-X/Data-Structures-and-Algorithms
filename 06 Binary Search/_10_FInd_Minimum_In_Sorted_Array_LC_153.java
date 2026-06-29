package _06_BinarySearch;

public class _10_FInd_Minimum_In_Sorted_Array_LC_153 {

    public int findMin(int[] nums) {
        int low=0;
        int high=nums.length-1;
        while(low<high){
            int mid=low+(high-low)/2;
            if(nums[mid] > nums[high])
                low = mid + 1;
            else
                high = mid;
        }
        return nums[low];
    }

    public int findMin2(int[] nums) {
        int min = Integer.MAX_VALUE;
        int low = 0,high = nums.length-1;

        while(low<=high){
            int mid = low + (high-low)/2;

            if(nums[low]<=nums[mid]){
                min = Math.min(min,nums[low]);
                low = mid + 1;
            }
            else{
                min = Math.min(min,nums[mid]);
                high = mid - 1;
            }
        }
        return min;
    }
}
