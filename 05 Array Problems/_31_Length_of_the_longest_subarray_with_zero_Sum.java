package _05_ArrayProblems;
import java.util.HashMap;

public class _31_Length_of_the_longest_subarray_with_zero_Sum {
    int maxLength(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int maxLength = 0;
        int currentSum=0;
        map.put(0,0);
        for(int i=0;i<arr.length;i++){
            currentSum += arr[i];
            if(map.containsKey(currentSum)){
                int length = (i+1)-map.get(currentSum);
                if(length > maxLength)
                    maxLength = length;
            }
            else
                map.put(currentSum,i+1);
        }

        return maxLength;
    }
}
