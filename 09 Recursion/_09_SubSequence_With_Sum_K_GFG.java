package _09_Recursion;

public class _09_SubSequence_With_Sum_K_GFG {
    public boolean solve(int[] arr, int idx, int sum, int k, int[][] memo) {

        if (sum == k)
            return true;

        if (idx == arr.length || sum > k)
            return false;

        if (memo[idx][sum] != 0)
            return memo[idx][sum] == 1;

        boolean take = solve(arr, idx + 1, sum + arr[idx], k, memo);
        boolean skip = solve(arr, idx + 1, sum, k, memo);

        boolean ans = take || skip;

        memo[idx][sum] = ans ? 1 : -1;

        return ans;
    }

    public boolean solve1(int[] arr,int idx,int sum,int k,int[][] memo){
        if(sum == k){
            memo[idx][sum] = 1;
            return true;
        }

        if(idx == arr.length){
            return false;
        }

        if(sum > k)
            return false;


        if(memo[idx][sum] != 0)
            return memo[idx][sum] == 1;

        else{
            if(solve(arr,idx + 1,sum + arr[idx],k,memo)){
                memo[idx][sum] = 1;
                return true;
            }

            if(solve(arr,idx + 1,sum,k,memo)){
                memo[idx][sum] = 1;
                return true;
            }

            memo[idx][sum] = -1;
            return false;
        }

    }

    public boolean checkSubsequenceSum(int[] arr, int k) {

        int[][] memo = new int[arr.length][k + 1];

        return solve(arr, 0, 0, k, memo);
    }


}
