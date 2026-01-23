package _04_Sorting;
public class _01_SelectionSort {
    public void swap(int[] arr,int i1,int i2){
        int temp = arr[i1];
        arr[i1] = arr[i2];
        arr[i2] = temp;
    }

    public void selectionSort(int[] arr){
        for(int i =0;i<arr.length-1;i++){
            int  minIndex = i;
            for(int j=i+1;j< arr.length;j++){
                if(arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            if(minIndex != i)
                swap(arr,i,minIndex);
        }

    }
}
