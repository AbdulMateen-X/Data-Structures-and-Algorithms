package _06_BinarySearch;

public class _31_Find_a_Peak_Element_II_LC_1901 {
    public int[] findPeakGrid(int[][] mat) {
        int n = mat.length, m = mat[0].length;
        int low = 0, high = n-1;

        while(low<=high){
            int row = low + (high - low)/2; //mid row idx

            int maxVal = Integer.MIN_VALUE;//max value at this row
            int col = -1;//col idx

            //Find max in this mid row --> it will be greater than its left and right neighbours
            for(int j=0;j<mat[0].length;j++){
                if(mat[row][j] > maxVal){
                    maxVal = mat[row][j];
                    col = j;
                }
            }

            int topNeighbour = (row>0) ? mat[row-1][col] : -1;
            int bottomNeighbour = (row<n-1) ? mat[row+1][col] : -1;

            //if greater than both top bottom -> we got a peak
            if(maxVal > topNeighbour && maxVal > bottomNeighbour)
                return new int[] {row,col};

            //if top greater -> shrink towards up
            if(topNeighbour > maxVal)
                high = row - 1;

                //if bottom greater -> shrink towards bottom
            else
                low = row + 1;
        }

        return new int[] {-1,-1};
    }
}
