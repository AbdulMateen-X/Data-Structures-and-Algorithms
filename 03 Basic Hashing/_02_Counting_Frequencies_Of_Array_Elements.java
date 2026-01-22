//    Given an array nums of size n which may contain duplicate elements.
//    Return a list of pairs where each pair contains a unique element from the array and its frequency in the array.
//    You may return the result in any order, but each element must appear exactly once in the output.
import java.util.*;
public class _02_Counting_Frequencies_Of_Array_Elements {
    public static List<List<Integer>> countFrequencies(int[] nums){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
//            int freq = 0;
//            if(map.containsKey(nums[i]))
//                freq = map.get(nums[i]);
//            freq++;
//            map.put(nums[i],freq);
            map.put(nums[i], map.getOrDefault(nums[i],0) + 1);
        }

        List<List<Integer>> result = new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
//            List<Integer> innerList = new ArrayList<Integer>();
//            innerList.add(entry.getKey());
//            innerList.add(entry.getValue());
//            result.add(innerList);
            result.add(Arrays.asList(entry.getKey(), entry.getValue()));
        }

        return result;
    }

    public static void main(String[] args){
        int[] nums = {100,1,2,1,3,3,100,100};
        System.out.println(countFrequencies(nums));
    }
}
