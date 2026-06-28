package _05_ArrayProblems;

public class _36_Count_Inversions {

    public static int merge(int[] arr,int left,int mid,int right){
        int i = left,j = mid+1,k = 0;
        int[] temp = new int[right-left+1];
        int count = 0;

        while(i<=mid && j<=right){
            if(arr[i] > arr[j]){
                temp[k++] = arr[j++];
                count += (mid-i+1);
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
        return count;
    }

    public static int mergeSort(int[] arr,int left,int right){
        if(left<right){
            int count = 0;
            int mid = (left+right)/2;
            count += mergeSort(arr,left,mid);
            count += mergeSort(arr,mid+1,right);
            count += merge(arr,left,mid,right);
            return count;
        }
        else
            return 0;
    }

    public static int inversionCount(int[] arr) {
        return mergeSort(arr,0,arr.length-1);

    }
}