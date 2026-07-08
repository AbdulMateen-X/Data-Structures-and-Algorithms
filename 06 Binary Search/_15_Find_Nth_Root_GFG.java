package _06_BinarySearch;

public class _15_Find_Nth_Root_GFG {
    public int multiply(int mid,int n,int m){
        long ans = 1;
        for(int i=1;i<=n;i++){
            ans *= mid;
            if(ans > m)
                return 2; //mid^n > m
        }

        //mid^n == m
         if(ans == m)
            return 1;

         //mid^n < m
        return 0;
    }

    public int nthRoot(int n, int m) {
        int low = 0,high = m;
        while(low<=high){
            int mid = low + (high - low)/2;
            int status = multiply(mid,n,m);

            if(status == 1)
                return mid;
            if(status == 0)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1;
    }
}
