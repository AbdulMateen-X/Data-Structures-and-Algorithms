package _06_BinarySearch;

public class _17_Minimum_Days_to_make_m_Bouquets_LC_1482 {
    public int minDays(int[] bloomDay,int m,int k){
        if((long)m*k > (long)bloomDay.length)
            return -1;

        int max = bloomDay[0], min = bloomDay[0];
        for(int i=1;i<bloomDay.length;i++){
            if(bloomDay[i] > max)
                max = bloomDay[i];
            else if(bloomDay[i] < min)
                min = bloomDay[i];
        }

        int low = min,high = max;
        while(low<=high){
            int mid = low + (high-low)/2;
            boolean valid = isValid(bloomDay,m,k,mid);

            if(valid)
                high = mid - 1;
            else
                low = mid + 1;

        }
        return low;
    }

    public boolean isValid(int[] bloomDay,int m,int k,int days){
        int adjacentCount = 0,count = 0;
        for(int i=0;i<bloomDay.length;i++){

            if(bloomDay[i] <= days)
                adjacentCount++;
            else
                adjacentCount = 0;

            if(adjacentCount == k) {
                count++;
                adjacentCount = 0;
            }
            if(count == m)
                return true;
        }

        return false;
    }
}
