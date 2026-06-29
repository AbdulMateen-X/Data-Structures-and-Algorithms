package _06_BinarySearch;

public class _12_Single_Element_In_a_Sorted_Array_LC_540 {
    public int singleNonDuplicate2(int[] nums){
        int low = 0,high = nums.length-1;
        while(low<high){
            int mid = low + (high-low)/2;
            if(mid % 2 == 1)
                mid--;
            if(nums[mid] == nums[mid+1])
                low = mid + 2;
            else
                high = mid;
        }
        return nums[low];
    }
    public int singleNonDuplicate(int[] nums) {
        int result = nums[0];
        int low = 0, high = nums.length-1;
        while(low<=high){
            int mid = low + (high-low)/2;

            if((high - low + 2) % 4 != 0){
                if(mid+1 <= high && nums[mid] == nums[mid+1])
                    low = mid;
                else if(mid-1 >= low && nums[mid-1] == nums[mid])
                    high = mid;
                else {
                    result = nums[mid];
                    break;
                }
            }
            else{
                if(mid+1 <= high &&  nums[mid] == nums[mid+1])
                    high = mid-1;
                else if(mid-1 >= low && nums[mid-1] == nums[mid])
                    low = mid+1;
                else {
                    result = nums[mid];
                    break;
                }
            }
        }
        return result;
    }
}
