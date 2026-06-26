package _05_ArrayProblems;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class _29_3_Sum_LC_15 {
    public List<List<Integer>> threeSum(int[] nums) {
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

        //Fix One element then 2 pointers for other 2 elements
        for(int i=0;i<n-2;i++){
            if(i>0 && nums[i]==nums[i-1])
                continue;

            int left = i+1;
            int right = n-1;
            while(left<right) {
                int currentSum = nums[i] + nums[left] + nums[right];
                if (currentSum == 0) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    while(left+1 < right && nums[left] == nums[left+1])
                        left++;
                    left++;

                    while(right-1>left && nums[right] == nums[right-1])
                        right--;
                    right--;
                }
                else if(currentSum < 0){
                    while(left+1 < right && nums[left] == nums[left+1])
                        left++;
                    left++;
                }
                else if(currentSum > 0){
                    while(right-1>left && nums[right] == nums[right-1])
                        right--;
                    right--;
                }
            }
        }

        return result;
    }
}
