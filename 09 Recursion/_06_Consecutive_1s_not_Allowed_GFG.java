package _09_Recursion;

public class _06_Consecutive_1s_not_Allowed_GFG {
    public int fib(int n){
        int[] dp = new int[n+1];
        for(int i = 0;i<n+1;i++){
            dp[i] = -1;
        }
        return solve(n,dp);
    }

    public int solve(int n,int[] dp){
        if(n <= 1)
            return n;

        if(dp[n] != -1)
            return dp[n];

        dp[n] = solve(n-1,dp) + solve(n-2,dp);
        return dp[n];
    }

    int countStrings(int n) {
        return fib(n+2);
    }

    int countStrings1(int n) {
        if(n == 1)
            return 2;
        if(n == 2)
            return 3;
        int[] dp = new int[n+1];
        dp[1] = 2;
        dp[2] = 3;

        for(int i=3;i<=n;i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }
}
