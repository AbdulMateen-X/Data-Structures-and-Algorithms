package _05_ArrayProblems;

public class _37_Reverse_Pairs_LC_493 {

    public static int countPairs(int[] arr,int left,int mid,int right){
        int count = 0;
        int j = mid+1;
        for(int i=left;i<=mid;i++){
            while(j<=right && (long)arr[i]> (long)2*arr[j])
                j++;

            count += j - (mid + 1);
        }
        return count;
    }

    public static void merge(int[] arr,int left,int mid,int right){
        int i = left,j = mid + 1,k=0;

        int[] temp = new int[right-left+1];
        while(i<=mid && j<=right){
            if(arr[i] > arr[j]){
                temp[k++] = arr[j++];
            }
            else{
                temp[k++] = arr[i++];
            }
        }

        while(i<= mid){
            temp[k++] = arr[i++];
        }

        while(j<= right){
            temp[k++] = arr[j++];
        }

        k=0;
        for(i=left;i<=right;i++){
            arr[i] = temp[k++];
        }

    }

    public static int mergeSort(int[] arr,int left,int right){
        int count = 0;
        if(left<right) {
            int mid = (left + right) / 2;
            count += mergeSort(arr, left, mid);
            count += mergeSort(arr, mid + 1, right);
            count += countPairs(arr, left, mid, right);
            merge(arr, left, mid, right);
        }
        return count;
    }
    public int reversePairs(int[] nums) {
        return mergeSort(nums,0,nums.length-1);

    }

}


