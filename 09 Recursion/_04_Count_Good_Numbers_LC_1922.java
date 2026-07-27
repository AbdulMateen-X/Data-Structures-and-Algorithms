package _09_Recursion;

public class _04_Count_Good_Numbers_LC_1922 {
    public long power(int x,long n){
        if(n == 0)
            return 1;

        long half = power(x,n/2);
        if(n % 2 == 0)
            return (half * half % 1000000007);
        else
            return (x * half * half % 1000000007);
    }

    public int countGoodNumbers(long n) {
        return (int)(power(5,(n+1)/2) * power(4,n/2) % 1000000007);
    }
}
