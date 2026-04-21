package _04_Sorting;

public class _05_RecursiveBubbleSort {
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
    // n-> length of array , i-> starting index for comparison. hasSwapped-> flag to detect that array is sorted midway
    public static void recursiveBubbleSort(int[] arr,int n,int i,boolean hasSwapped){
        if(n<=1)
            return;

        if(i<n-1) { //Swapping Logic
            if (arr[i] > arr[i + 1]) {
                swap(arr, i, i + 1);
                hasSwapped = true;
            }
            if (i == n - 2) { //Reached Last Comparison jo move to next pass
                if(hasSwapped == false)// Array sorted fully sp return
                    return;
                recursiveBubbleSort(arr, n - 1, 0,false); // Shrink the array by 1
            }
            else // No swapping just increment i
                recursiveBubbleSort(arr, n, i + 1,hasSwapped);
        }
    }

    public static void main(String[] args){
        int[] arr = {5,4,3,2,1};
        int n = arr.length;
        display(arr,n);
        recursiveBubbleSort(arr,n,0,false);
        display(arr,n);

    }
}
