package _05_ArrayProblems;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

public class _28_Majority_Element_II_LC_229 {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> result = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (int key : map.keySet()) {
            if (map.get(key) > nums.length / 3) {
                result.add(key);
            }
        }

        return result;
    }

    //Constant Space
    //Boyer-Moore Voting Algorithm
    public List<Integer> majorityElement2(int[] nums) {
        List<Integer> result = new ArrayList<>();
        int candidate1 = Integer.MIN_VALUE;
        int candidate2 = Integer.MIN_VALUE;
        int count1 = 0, count2 = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == candidate1)
                count1++;
            else if (nums[i] == candidate2)
                count2++;
            else if (count1 == 0){
                candidate1 = nums[i];
                count1 = 1;
            }
            else if (count2 == 0) {
                candidate2 = nums[i];
                count2 = 1;
            }
            else{
                count1--;
                count2--;
                }
        }
        count1 = 0;
        count2 = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == candidate1)
                count1++;
            else if(nums[i] == candidate2)
                count2++;
        }

        if(count1>nums.length/3)
            result.add(candidate1);
        if(count2 > nums.length/3)
            result.add(candidate2);

        return result;
    }
}
