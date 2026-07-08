package _06_BinarySearch;

public class _19_Capacity_to_Ship_Packages_Within_D_Days_LC_1011 {
    public int shipWithinDays(int[] weights, int days) {
        int max = Integer.MIN_VALUE,sum = 0;
        for(int i=0;i<weights.length;i++){
            if(weights[i] > max)
                max = weights[i];
            sum += weights[i];
        }

        int low = max,high = sum;
        while(low<=high){
            int mid = low + (high - low)/2;
            int d = getDays(weights,days,mid);
            if(d>days)
                low = mid + 1;
            else
                high = mid -1;
        }
        return low;
    }

    public int getDays(int[] weights,int days,int capacity){
        int currentLoad = 0,count =0;
        for(int i=0;i<weights.length;i++){
            if(currentLoad + weights[i] <= capacity)
                currentLoad += weights[i];
            else{
                currentLoad = weights[i];
                count++;
                if(count > days)
                    return count; //we exceeded the number of days
            }
        }
        count++; // Last Day

        return count;
    }

}
