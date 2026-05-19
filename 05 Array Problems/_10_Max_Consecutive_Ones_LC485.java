package _05_ArrayProblems;

public class _10_Max_Consecutive_Ones_LC485 {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max =0,sum=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == 1)
                sum+=1;
            if(nums[i] == 0){
                if(sum > max)
                    max = sum;
                sum = 0;
            }
        }
        if(sum>max)
            max = sum;
        return max;
    }
}
