//Print the Max subarray also

package _05_ArrayProblems;

public class _17_Maximum_Subarray_Extended {
    public static int maxSubArray(int[] nums) {
        int sum = 0, max = nums[0],start=0,end=0,prev = 0;
        for(int i=0;i<nums.length;i++){
            sum += nums[i];
            if(sum > max) {
                max = sum;
                end = i;
                start = prev;
            }

            if(sum<=0){
                sum = 0;
                prev = i+1;
            }

        }

        for(int i=start;i<=end;i++){
            System.out.print(nums[i] + " ");
        }
        System.out.println();
        return max;
    }

    public static void main(String[] args){
        int[] nums = {-2,-1};
        System.out.println("Sum: " + maxSubArray(nums));
    }

}
