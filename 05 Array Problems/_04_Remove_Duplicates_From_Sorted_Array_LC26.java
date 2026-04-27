package _05_ArrayProblems;

public class _04_Remove_Duplicates_From_Sorted_Array_LC26 {
    public static void display(int arr[],int n){
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static int removeDuplicates(int[] nums){
        int k = 0;

        for(int i=0;i<nums.length;i++){
            if(nums[i] != nums[k]){
                k++;
                nums[k] = nums[i];
            }
        }
        return k+1;
    }

    public static void main(String[] args){
        int[] nums = {0,0,1};
        int n = removeDuplicates(nums);
        System.out.println("No.of unique elements: " + n);
        display(nums,n);
    }
}
