package _06_BinarySearch;

public class _05_Floor_And_Ceil {
    public int[] getFloorAndCeil(int[] nums, int x) {
        //result[0] -> floor and result[1] -> ceil
        int[] result = new int[]{-1,-1};
        int low = 0,high = nums.length-1;

        while(low<=high){
            int mid = low + (high - low)/2;

            if(nums[mid] == x){
                result[0] = x;
                result[1] = x;
                return result;
            }

            if(nums[mid] < x){
                result[0] = nums[mid];
                low = mid + 1;
            }
            else{
                result[1] = nums[mid];
                high = mid - 1;
            }
        }
        return result;
    }
}
