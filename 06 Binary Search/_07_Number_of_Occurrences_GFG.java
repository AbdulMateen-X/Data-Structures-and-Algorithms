package _06_BinarySearch;

public class _07_Number_of_Occurrences_GFG {
    int countFreq(int[] arr, int target) {
        // code here
        int low = 0,high = arr.length - 1;
        int lowIdx = -1,highIdx = -1;
        //Lower Bound
        while(low<=high){
            int mid = low + (high-low)/2;
            if(arr[mid] == target){
                lowIdx = mid;
                high = mid -1;
            }
            else if(arr[mid]<target)
                low = mid + 1;
            else
                high = mid -1;
        }

        if(lowIdx == -1)
            return 0;

        low = 0;
        high = arr.length-1;
        //UpperBound
        while(low<=high){
            int mid = low + (high-low)/2;
            if(arr[mid] == target){
                highIdx = mid;
                low = mid + 1;
            }
            else if(arr[mid]<target)
                low = mid + 1;
            else
                high = mid -1;
        }

        return highIdx - lowIdx + 1;
    }
}
