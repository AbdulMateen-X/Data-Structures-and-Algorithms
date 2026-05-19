package _05_ArrayProblems;

//Given an array nums with n objects colored red, white, or blue, sort them in-place so that
//objects of the same color are adjacent, with the colors in the order red, white, and blue.


public class _14_Sort_Colors_LC75 {

    public void swap(int[] nums,int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    //Dutch National Flag Algorithm
    public void sortColors(int[] nums) {
        int low=0,mid=0,high=nums.length-1;
        while(mid<=high){
            if(nums[mid] == 0){
                swap(nums,low,mid);
                low++;
                mid++;
            }
            else if(nums[mid] == 1){
                mid++;
            }
            else if(nums[mid] == 2){
                swap(nums,mid,high);
                high--;
            }
        }
    }

}
