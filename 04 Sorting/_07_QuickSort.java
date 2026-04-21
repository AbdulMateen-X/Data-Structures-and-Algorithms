package _04_Sorting;

public class _07_QuickSort {
    public static void display(int arr[],int n){
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void swap(int[] arr,int i1,int i2){
        int temp = arr[i1];
        arr[i1] = arr[i2];
        arr[i2] = temp;
    }

    public static int partition(int[] arr,int low,int high){
        int pivot = arr[low];
        int start = low+1,end = high; //Pointers at the start and end of the array

        while(start <= end){
            while(start<=end && arr[start]<=pivot)
                start++;
            while(start<=end && arr[end]>pivot)
                end--;
            if(start<end)
                swap(arr,start,end);
        }
        swap(arr,low,end);
        return end;
    }

    public static void quickSort(int[] arr,int low,int high){
        if(low<high){
            int loc = partition(arr,low,high);
            quickSort(arr,low,loc-1);
            quickSort(arr,loc+1,high);
        }
    }

    public static void main(String[] args){
        int[] arr = {5,4,3,2,1};
        display(arr,arr.length);
        quickSort(arr,0,arr.length-1);
        display(arr, arr.length);
    }
}
