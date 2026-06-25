package _05_ArrayProblems;
//Given an array nums of size n, return the majority element.
//The majority element is the element that appears more than ⌊n / 2⌋ times.
//You may assume that the majority element always exists in the array
import java.util.HashMap;

public class _15_Majority_Element_LC169 {


    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i] , map.getOrDefault(nums[i],0) + 1);
        }
        for(int num:nums){
            if(map.get(num) > Math.floor((double) nums.length /2)){
                return num;
            }
        }
        return -1;
    }

    //Boyer-Moore Voting Algorithm
    public int majorityElement2(int[] nums){
        int count = 0;
        int candidate = 0;
        for(int i=0;i<nums.length;i++){
            if(count == 0)
                candidate = nums[i];
            if(nums[i] == candidate) {
                count++;
            }
            else{
                count--;
            }
        }
        return candidate;
    }

}
