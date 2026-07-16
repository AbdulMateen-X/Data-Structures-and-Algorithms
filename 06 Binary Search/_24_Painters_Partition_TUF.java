package _06_BinarySearch;

public class _24_Painters_Partition_TUF {
    public int paint(int A, int B, int[] C) {
        int max = Integer.MIN_VALUE;
        long sum = 0;
        for(int num: C){
            max = Math.max(max,num);
            sum += num;
        }

        int low = max*B;
        long high = sum*B;

        while(low<=high){
            long mid = low + (high-low)/2;
            int count = getCount(C,A,B,mid);
            if(count > A)
                low = (int)mid + 1;
            else
                high = mid-1;
        }
        return low % 10000003;
    }

    public int getCount(int[] C,int A,int B,long time){
        int count = 0;
        long sum = 0;
        for(int num: C){
            sum += num;
            if(sum*B > time){
                count++;
                sum = num;
            }
            if(count > A)
                return count;
        }
        count++;
        return count;
    }
}
