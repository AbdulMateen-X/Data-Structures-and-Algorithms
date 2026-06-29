package _06_BinarySearch;

public class _06_Find_First_And_Last_Position_of_Element_in_Sorted_Array_LC_34 {
    public int[] searchRange2(int[] nums, int target) {
        int low=0;
        int high=nums.length-1;
        int[] r=new int[2];
        r[0]=-1;
        r[1]=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target){
                r[0]=mid;
                high=mid-1;
            }else if(nums[mid]<target){
                low=mid+1;
            }else if(nums[mid]>target){
                high=mid-1;
            }
        }
        low=0;
        high=nums.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target){
                r[1]=mid;
                low=mid+1;
            }else if(nums[mid]<target){
                low=mid+1;
            }else if(nums[mid]>target){
                high=mid-1;
            }
        }
        return r;
    }

    public int[] searchRange(int[] nums, int target) {
        int[] result = new int[]{-1,-1};
        if(nums.length > 0){
            int low = 0,high = nums.length-1;

            while(low<high){
                int mid = low + (high - low)/2;
                if(nums[mid] >= target)
                    high = mid;
                else
                    low = mid + 1;
            }

            if(nums[low] == target)
                result[0] = low;

            low = 0;
            high = nums.length-1;

            while(low<high){
                //Round up to prevent infinite loop
                int mid = low + (high - low + 1)/2;
                if(nums[mid] <= target)
                    low = mid;
                else
                    high = mid - 1;
            }

            if(nums[low] == target)
                result[1] = low;
        }
        return result;
    }
}
