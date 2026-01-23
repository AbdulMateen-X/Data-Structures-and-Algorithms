package _04_Sorting;

public class _03_InsertionSort {
    public void insertionSort(int arr[]) {
        for(int i = 1;i<arr.length;i++){
            int current = arr[i];
            int j=i-1;
            for(;j>=0 && arr[j]>current; j--){
                arr[j+1] = arr[j];
            }
            arr[j+1] = current;
        }
    }
}