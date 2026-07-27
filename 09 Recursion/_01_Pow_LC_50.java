package _09_Recursion;

public class _01_Pow_LC_50 {
    public double power(double x,long n){
        if(n == 0)
            return 1;

        double half = power(x,n/2);
        if(n % 2 == 0)
            return half * half;
        else
            return x * half * half;
    }

    public double myPow(double x, int n) {
        long N = n;
        if(n > 0)
            return power(x,N);
        else
            return 1.0/power(x,-N);
    }
}
