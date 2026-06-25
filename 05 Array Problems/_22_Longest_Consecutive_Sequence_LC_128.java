package _05_ArrayProblems;
import java.util.HashSet;
import java.util.Iterator;
public class _22_Longest_Consecutive_Sequence_LC_128 {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        int maxLength = 0;

        for(int current: set){
            // Only start counting if 'current' is the absolute beginning of a sequence
            if(!set.contains(current-1)) {
                int currentMaxLength = 1;
                int currentNum = current;
                // Look forward to find the rest of the sequence chain
                while (set.contains(currentNum + 1)) {
                    currentMaxLength++;
                    currentNum += 1;
                }
                if(currentMaxLength > maxLength)
                    maxLength = currentMaxLength;
            }
        }

        return maxLength;
    }
}
