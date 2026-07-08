package _06_BinarySearch;

public class _18_Find_the_Smallest_Divisor_LC_1283 {
    public int smallestDivisor(int[] nums, int threshold) {
        int max = nums[0];
        for(int i=1;i<nums.length;i++){
            if(max < nums[i])
                max = nums[i];
        }

        int low = 1,high = max;
        while(low<=high){
            int mid = low + (high-low)/2;
            int sum = getSum(nums,mid,threshold);
            if(sum<=threshold)
                high = mid - 1;
            else
                low = mid + 1;
        }
        return low;
   }

   public int getSum(int[] nums,int divisor,int threshold){
        int sum = 0;
        for(int i=0;i<nums.length;i++){
            sum += (nums[i] + divisor - 1)/divisor;
            if(sum > threshold)
                return sum;
        }
        return sum;
   }
}
