package _06_BinarySearch;

public class _32_Median_In_a_Row_Wise_Sorted_Matrix_GFG {
    public int median(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        int k = (m*n)/2 + 1; //exactly k elements <= median value

        //Find min and max elements of the matrix keeeping in mind row-wise sorted
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(mat[i][0] < min)
                min = mat[i][0];

            if(mat[i][m-1] > max)
                max = mat[i][m-1];
        }

        //Count number of values that are <= mid -> if equal to k then mid is the median
        int low = min, high = max;
        while(low<=high){
            int mid = low + (high - low)/2;
            int count = 0;

            //Cummulative Count for each row
            for(int i=0;i<n;i++){
                int lowIdx = 0, highIdx = m-1;

                while(lowIdx <= highIdx){
                    int midIdx = lowIdx + (highIdx - lowIdx)/2;
                    if(mat[i][midIdx] <= mid)
                        lowIdx = midIdx + 1;
                    else
                        highIdx = midIdx - 1;
                }

                count += lowIdx;
            }

            if(count < k)
                low = mid + 1;
            else
                high = mid - 1;
        }

        return low;
    }
}
