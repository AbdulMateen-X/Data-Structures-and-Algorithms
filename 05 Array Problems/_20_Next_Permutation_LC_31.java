package _05_ArrayProblems;

public class _20_Next_Permutation_LC_31 {

    public static void swap(int[] arr,int i1,int i2){
        int temp = arr[i1];
        arr[i1] = arr[i2];
        arr[i2] = temp;
    }

    public static void nextPermutation(int[] nums) {
        int pivot = -1,i=nums.length-1;
        //Find BreakPoint
        for(;i>0;i--){
            if(nums[i] > nums[i-1]){
                pivot = i-1;
                break;
            }
        }
        if(i != 0){
            //Find Element just greater than the pivot in the right subarray
            int max = nums[pivot + 1], swap = pivot + 1;
            for (int j = pivot + 2; j < nums.length; j++) {
                if (nums[j] > nums[pivot] && nums[j] <= max) {
                    swap = j;
                }
            }

            //swap the pivot with the element found
            swap(nums, pivot, swap);
        }

        //Reverse the right subarray
        for(int j=pivot+1,k=nums.length-1;j<k;j++,k--){
            swap(nums,j,k);
        }

    }

    public static void main(String[] args){
        int nums[] = {2,3,1,3,3};
        nextPermutation(nums);

        for(int x: nums){
            System.out.print(x + " ");
        }
    }
}
