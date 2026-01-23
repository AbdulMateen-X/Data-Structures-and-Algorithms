package _04_Sorting;

public class _02_BubbleSort {
    public void swap(int[] arr,int i1,int i2){
        int temp = arr[i1];
        arr[i1] = arr[i2];
        arr[i2] = temp;
    }
    public void bubbleSort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            boolean didSwap = false;
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j] > arr[j+1]){
                    swap(arr,j,j+1);
                    didSwap = true;
                }
            }
            if(!didSwap){
                break;
            }
        }
    }
}
