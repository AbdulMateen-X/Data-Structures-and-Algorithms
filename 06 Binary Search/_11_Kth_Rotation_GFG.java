package _06_BinarySearch;

public class _11_Kth_Rotation_GFG {
    public int findKRotation2(int[] arr){
        int low=0;
        int high=arr.length-1;
        while(low<high){
            int mid=low+(high-low)/2;
            if(arr[mid] > arr[high])
                low = mid + 1;
            else
                high = mid;
        }
        return low;
    }

    public int findKRotation(int[] arr) {
        int low = 0,high = arr.length - 1;
        int min = Integer.MAX_VALUE;
        int result = 0;

        while(low<=high){
            int mid = low + (high - low)/2;
            if(arr[low] <= arr[mid]){
                if(arr[low] < min){
                    min = arr[low];
                    result = low;
                }
                low = mid + 1;
            }

            else{
                if(arr[mid] < min){
                    min = arr[mid];
                    result = mid;
                }
                high = mid - 1;
            }
        }
        return result;
    }
}
