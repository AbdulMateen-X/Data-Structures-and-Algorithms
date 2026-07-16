package _06_BinarySearch;

public class _22_Allocate_Minimum_Pages_GFG {
    public int findPages(int[] arr, int k) {

        if(arr.length < k)
            return -1;

        int max = Integer.MIN_VALUE;
        long sum=0;
        for(int num: arr) {
            max = Math.max(max,num);
            sum += num;
        }

        int low = max;
        long high = sum;
        while(low<=high){
            long mid = low + (high-low)/2;
            int count = getCount(arr,k,mid);
            if(count > k)
                low = (int)mid + 1;
            else
                high = mid - 1;
        }

        return low;
    }

    public int getCount(int[] arr,int k,long pages){
        int count = 0;
        long sum =0;
        for(int num: arr){
            sum += num;
            if(sum > pages){
                count++;
                sum = num;
            }
            if(count > k)
                return count;
        }

        count++;
        return count;
    }
}
