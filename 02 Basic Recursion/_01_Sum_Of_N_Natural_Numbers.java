public class _01_Sum_Of_N_Natural_Numbers{
    public int findSum(int n){
        if(n==1)
            return 1;
        return n + findSum(n-1);
    }
}
