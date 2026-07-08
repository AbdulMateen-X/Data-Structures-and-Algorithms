package _06_BinarySearch;

public class _16_Koko_Eating_Bananas_LC_875 {
    public int minEatingSpeed(int[] piles, int h) {
        int max = piles[0];
        for(int i=1;i<piles.length;i++){
            if(piles[i] > max)
                max = piles[i];
        }

        int low = 1,high = max;
        while(low<=high){
            int mid = low + (high-low)/2;
            long hours = calculateHours(piles,mid);

            //eating speed is slow --> so increase speed
            if(hours > h)
                low = mid + 1;

            //eating fast --> can go slower
            else
                high = mid - 1;
        }
        return low;
    }

    public long calculateHours(int[] piles,int speed){
        long hours = 0;
        for(int i=0;i<piles.length;i++){
            //hours += (int) Math.ceil((double)piles[i]/speed);
            hours += (piles[i]+speed-1)/speed;
        }
        return hours;
    }

}
