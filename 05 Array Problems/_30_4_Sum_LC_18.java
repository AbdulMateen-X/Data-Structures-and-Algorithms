package _05_ArrayProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _30_4_Sum_LC_18 {
    public List<List<Integer>> fourSum(int[] nums, int target){
        List<List<Integer>> result = new ArrayList<>();
        int n = nums.length;

        //Sort
        for(int  i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(nums[j]>nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }

        //Fix One element
        for(int j=0;j<n-3;j++) {
            if(j>0 && nums[j]==nums[j-1])
                continue;

            //Fix 2nd element
            for (int i = j+1; i < n - 2; i++) {
                if(i > j+1 && nums[i] == nums[i-1])
                    continue;

                //2 pointers for 3rd and 4th element
                int left = i + 1;
                int right = n - 1;
                while (left < right) {
                    long currentSum = (long) nums[i] + nums[j] + nums[left] + nums[right];
                    if (currentSum == target) {
                        result.add(Arrays.asList(nums[j],nums[i], nums[left], nums[right]));

                        while (left + 1 < right && nums[left] == nums[left + 1])
                            left++;
                        left++;

                        while (right - 1 > left && nums[right] == nums[right - 1])
                            right--;
                        right--;
                    } else if (currentSum < target) {
                        while (left + 1 < right && nums[left] == nums[left + 1])
                            left++;
                        left++;
                    } else if (currentSum > target) {
                        while (right - 1 > left && nums[right] == nums[right - 1])
                            right--;
                        right--;
                    }
                }
            }
        }

        return result;
    }
}
