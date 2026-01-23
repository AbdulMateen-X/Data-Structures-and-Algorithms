//  You are given an array nums consisting of positive integers.
//  Return the total frequencies of elements in nums such that those elements all have the maximum frequency.
//  The frequency of an element is the number of occurrences of that element in the array.

import java.util.HashMap;

public class _03_Count_Elements_With_Maximum_Frequency_LC3005 {
    public static int maxFrequencyElements(int[] nums){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int maxFreq = 0;
        int result = 0;
        for(int freq : map.values()){
            if(freq >= maxFreq) {
                if(freq == maxFreq) {
                    result += freq;
                }
                else {
                    maxFreq = freq;
                    result = freq;
                }
            }
        }
        return result;
    }
}
