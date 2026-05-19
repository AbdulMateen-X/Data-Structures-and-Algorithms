package _05_ArrayProblems;

public class _11_Single_Number_LC136 {
    public int singleNumber(int[] nums) {
        int xor = 0;
        for(int num : nums){
            xor ^= num;
        }
        return xor;
    }
}
