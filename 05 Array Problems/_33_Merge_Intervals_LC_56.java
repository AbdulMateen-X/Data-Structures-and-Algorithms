package _05_ArrayProblems;
import java.util.Arrays;

public class _33_Merge_Intervals_LC_56 {

    public int[][] merge(int[][] intervals) {

       Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));

        int current=0,length=1;
        for(int i=1;i<intervals.length;i++){
            if(intervals[current][1]>=intervals[i][0]){
                if(intervals[current][1] < intervals[i][1])
                    intervals[current][1] = intervals[i][1];
                intervals[i][0] = -1; //flag to skip this interval in the result
            }
            else{
                current = i;
                length++;
            }
        }
        int[][] result = new int[length][2];
        int k=0;
        for(int i=0;i<intervals.length;i++){
            if(intervals[i][0] != -1){
                result[k][0] = intervals[i][0];
                result[k][1] = intervals[i][1];
                k++;
            }
        }
        return result;
    }
}
