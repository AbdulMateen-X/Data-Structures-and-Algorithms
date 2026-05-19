package _05_ArrayProblems;

public class _08_Union_Of_Two_Sorted_Arrays {

    public static void display(int arr[],int n){
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static int[] unionArray(int[] nums1, int[] nums2) {

        int n1 = nums1.length,n2 = nums2.length;
        int result[] = new int[n1 + n2];
        int i=0,j=0,k=-1;

        while(i<n1 && j<n2){
            if(nums1[i] == nums2[j]){
                if(k == -1 || nums1[i] != result[k]) {
                    k++;
                    result[k] = nums1[i];
                }
                i++;
                j++;
            }
            else if(nums1[i] < nums2[j]){
                if(k == -1 || nums1[i] != result[k]) {
                    k++;
                    result[k] = nums1[i];
                }
                i++;
            }
            else{
                if(k == -1 || nums2[j] != result[k]) {
                    k++;
                    result[k] = nums2[j];
                }
                j++;
            }
        }

        while(i<n1){
            if(k == -1 || nums1[i] != result[k]) {
                k++;
                result[k] = nums1[i];
            }
            i++;
        }

        while(j<n2){
            if(k == -1 || nums2[j] != result[k]) {
                k++;
                result[k] = nums2[j];
            }
            j++;
        }

        int[] arr = new int[k+1];
        for(int x=0;x<arr.length;x++){
            arr[x] = result[x];
        }
        return arr;
    }

    public static  void main(String[]args){
        int nums1[] = {1,1,1};
        int nums2[] = {1,2,2};
        int[] result = unionArray(nums1,nums2);
        display(result,result.length);
    }
}
