package _05_ArrayProblems;

public class _35_Find_missing_and_Repeating_Values_LC_2965 {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        long n = (long)grid.length* grid.length;
        long expectedSum = n*(n+1)/2;
        long expectedSumSq = n*(n+1)*(2*n+1)/6;
        long actualSum = 0,actualSumSq = 0;
        for(int i=0;i< grid.length;i++){
            for(int j=0;j<grid.length;j++){
                actualSum += grid[i][j];
                actualSumSq += (long)grid[i][j] * grid[i][j];
            }
        }

        long s1 = expectedSum - actualSum;
        long s2 = expectedSumSq - actualSumSq;

        long b = (s1 + (s2/s1))/2;
        long a = b - s1;

        return new int[] {(int)a,(int)b};
    }
}

