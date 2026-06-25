package _05_ArrayProblems;

public class _19_Rearrange_Array_Elements_By_Sign_LC_2149 {

    public static int[] rearrangeArray2(int[] nums) {
        int[] arr = new int[nums.length];
        int pos_idx=0;
        int neg_idx=1;

        for(int i=0;i<nums.length;i++){
            if(nums[i]>0) {
                arr[pos_idx] = nums[i];
                pos_idx += 2;

            }
            else {
                arr[neg_idx] = nums[i];
                neg_idx += 2;

            }
        }

        return arr;
    }
    public static int[] rearrangeArray(int[] nums) {
        int[] arr = new int[nums.length];
        int k = 0,p=0,n=0;
        for(int i=0;i<nums.length/2;i++){
            while(nums[p] < 0)
                p++;
            arr[k++] = nums[p++];

            while(nums[n] > 0)
                n++;
            arr[k++] = nums[n++];
        }

        return arr;
    }

    public static void main(String[] args){
        int[] nums = {3,1,-2,-5,2,-4};
        int[] arr = rearrangeArray2(nums);
        for(int x : arr){
            System.out.print(x + " ");
        }
    }
}
