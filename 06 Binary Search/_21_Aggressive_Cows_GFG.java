package _06_BinarySearch;

import java.util.Arrays;

public class _21_Aggressive_Cows_GFG {
    public int aggressiveCows(int[] arr, int k) {
        Arrays.sort(arr);

        int low = 1,high = arr[arr.length-1]-arr[0];//distances
        while(low <= high){
            int mid = low + (high-low)/2;
            int count = getCount(arr,k,mid);
            if(count >= k)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return high;
    }

    public int getCount(int[] arr,int k,int minDist){
        int count = 1,prev = 0;
        for(int i=1;i<arr.length;i++){
            if(arr[i] - arr[prev] >= minDist){
                count++;
                prev = i;
            }
            if(count >= k)
                return count;
        }
        return count;
    }
}
