package _05_ArrayProblems;

public class _16_Maximum_Subarray_LC53 {
    public static int maxSubArray(int[] nums) {
        int sum=0,max=nums[0];
        for(int i=0;i<nums.length;i++){
            sum += nums[i];
            if(max < sum)
                max = sum;
            if(sum<0)
                sum=0;
        }
        return max;
    }

    public static void main(String[] args){
        int[] nums = {1,2,-3,4,6};
        System.out.println(maxSubArray(nums));
    }
}
