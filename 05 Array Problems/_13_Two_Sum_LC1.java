package _05_ArrayProblems;
//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target
//Only one valid answer exists

import java.util.HashMap;
public class _13_Two_Sum_LC1 {
    public static int[] twoSum(int[] nums, int target) {
        int[] result = {-1,-1};
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            if(map.containsKey(target-nums[i])){
                 result[0] = map.get(target - nums[i]);
                 result[1] = i;
                 break;
            }
            map.put(nums[i],i);

        }
        return result;
    }

    public static int[] twoSum2(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            if(map.containsKey(target-nums[i])){
                return new int[] {map.get(target-nums[i]) , i};
            }
            map.put(nums[i],i);

        }
        return new int[0];
    }

    public static void main(String[] args){
        int[] nums = {2,7,11,15};
        int[] result = twoSum2(nums,22);
        System.out.println(result[0] + " " + result[1]);
    }
}
