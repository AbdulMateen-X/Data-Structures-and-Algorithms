package _05_ArrayProblems;

public class _38_Maximum_Product_Subarray_LC_152 {
    public int maxProduct(int[] nums) {
        int max = Integer.MIN_VALUE;
        int prefix = 1,suffix = 1;

        for(int i=0,j=nums.length-1; i<nums.length && j>=0; i++,j--){

            if(prefix == 0)
                prefix = 1;
            if(suffix == 0)
                suffix = 1;

            prefix *= nums[i];
            suffix *= nums[j];

            max = Math.max(max,Math.max(prefix,suffix));
        }
        return max;
    }
}

