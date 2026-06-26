//Given an array of integers arr[] and a number k,
//count the number of subarrays having XOR of their elements as k.

package _05_ArrayProblems;
import java.util.HashMap;

public class _32_Count_Subarrays_with_given_XOR {
    public long subarrayXor(int arr[], int k) {
        long count = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        int currentXOR = 0;

        //currentXOR and frequency
        map.put(0,1);
        for(int i=0;i<arr.length;i++){
            currentXOR ^= arr[i];
            if(map.containsKey(currentXOR^k))
                count += map.get(currentXOR^k);

            map.put(currentXOR,map.getOrDefault(currentXOR,0)+1);
        }

        return count;
    }
}
