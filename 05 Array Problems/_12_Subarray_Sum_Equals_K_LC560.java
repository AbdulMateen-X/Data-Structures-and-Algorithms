package _05_ArrayProblems;

import java.util.HashMap;
public class _12_Subarray_Sum_Equals_K_LC560 {
    public static int subarraySum(int[] nums, int k) {
        int currentSum = 0;
        int count  = 0;//result
        HashMap<Integer,Integer> map = new HashMap<>();

        map.put(0,1);
        for(int num: nums){
            currentSum += num;
            if(map.containsKey(currentSum - k)){
                count += map.get(currentSum - k);
            }

            map.put(currentSum, map.getOrDefault(currentSum,0) + 1);
        }
        return count;
    }

    public static void main(String[]args){
        int[] nums = {3,1,1,2,1,-1};
        System.out.println(subarraySum(nums,2));
    }
}
