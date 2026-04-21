package _04_Sorting;

public class _04_MergeSort {

    public static void display(int arr[],int n){
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void merge(int[] arr,int l,int mid,int r){
        int[] temp = new int[r-l+1];
        int i =l,j= mid+1, k=0;

        while(i<=mid && j<=r){
            if(arr[i]<arr[j])
                temp[k++] = arr[i++];
            else
                temp[k++] = arr[j++];
        }

        while(i<=mid)
            temp[k++] = arr[i++];
        while(j<=r)
            temp[k++] = arr[j++];

        k=0;
        for(i=l;i<=r;i++){
                arr[i] = temp[k++];
        }

    }

    public static void mergeSort(int[] arr, int l ,int r){
        if(l<r){
            int mid = (l+r)/2;
            mergeSort(arr,l,mid);
            mergeSort(arr,mid+1,r);
            merge(arr,l,mid,r);
        }
    }
    public static  void main(String[] args){
        int[] arr = {5,4,3,2,1};
        int n = arr.length;
        display(arr,n);
        mergeSort(arr,0,n-1);
        display(arr,n);
    }
}
