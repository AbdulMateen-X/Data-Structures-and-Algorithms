package _06_BinarySearch;

public class _14_Square_Root_GFG {
    int floorSqrt(int n) {
        int low = 0,high = n;
        int sqrt = 0;
        while(low<=high){
            int mid = low + (high - low)/2;
            if(mid*mid == n)
                return mid;
            if(mid*mid < n) {
                sqrt = mid;
                low = mid + 1;
            }
            else
                high = mid - 1;
        }
        return sqrt;
    }
}
