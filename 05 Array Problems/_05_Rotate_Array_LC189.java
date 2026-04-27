package _05_ArrayProblems;

public class _05_Rotate_Array_LC189 {
    public static void display(int arr[],int n){
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void reverse(int[] arr,int low,int high){ // low,high --> indices
        for(int i = low, j = high;i<j;i++,j--){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }


    public static void rotate(int[] arr,int k) {
        int n = arr.length;
        k = k%n;

        if(n==0 ||k == 0 ) //After rotations array remains unchanged
            return;

        reverse(arr,0,n-1); // reverse whole array
        reverse(arr,0,k-1); // reverse first k elements
        reverse(arr,k,n-1); // reverse other elements
    }

    public static void main(String[] args){
        int[] arr = {0,1,2};
        rotate(arr,4);
        display(arr,arr.length);
    }
}
