package _05_ArrayProblems;

public class _03_Check_If_Array_is_Sorted_or_Rotated_LC1752 {
    public boolean check(int[] nums) {
        int count = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            // Use modulo (i + 1) % n to compare the last element with the first
            if (nums[i] > nums[(i + 1) % n]) {
                count++;
            }

            // Optimization: If we find more than one break, it's impossible
            if (count > 1) {
                return false;
            }
        }
        return true;
    }
}
