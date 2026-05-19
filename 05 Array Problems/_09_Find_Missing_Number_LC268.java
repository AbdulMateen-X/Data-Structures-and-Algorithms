package _05_ArrayProblems;

public class _09_Find_Missing_Number_LC268 {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = n*(n+1)/2;
        for(int i =0;i<n;i++){
            sum-=nums[i];
        }
        return sum;
    }
}
