package _04_Sorting;

public class _06_RecursiveInsertionSort {
    public static void display(int arr[],int n){
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    //n-> length, i-> current element's index, j->iterates over sorted portion to find correct loc of current element,
    //current-> Current element (value)
    public static void recursiveInsertionSort(int[] arr,int n,int i,int j,int current){

        if(j>=0 && arr[j]>current) {//Shifting once and decrementing j
            arr[j + 1] = arr[j];
            recursiveInsertionSort(arr,n,i,j-1,current);
            return; //To stop further recursion
        }

        arr[j+1] = current; //Place current at correct location

        //Next pass (incrementing i)
        if(i+1 != n) // Handles Base Case as well
            recursiveInsertionSort(arr,n,i+1,i,arr[i+1]);
    }

    public static void recursiveInsertionSort(int[] arr) {
        recursiveInsertionSort(arr,arr.length,1,0,arr[1]);
    }

    public static void main(String[] args){
        int[] arr = {5,4,3,2,1};
        int n = arr.length;
        display(arr,n);
        recursiveInsertionSort(arr);
        display(arr,n);

    }
}
