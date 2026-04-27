package _05_ArrayProblems;

public class _02_SecondLargestElement {
//    public static int secondLargestElement(int[] nums) {
//        int max = nums[0];
//        for(int i=1;i<nums.length;i++){
//            if(nums[i]>max)
//                max = nums[i];
//        }
//
//        int secondMax= Integer.MIN_VALUE;
//        for(int i=0;i< nums.length;i++){
//            if(nums[i] != max){
//                secondMax = nums[i];
//                break;
//            }
//        }
//
//        if(secondMax  < max) {
//            for (int i = 1; i < nums.length; i++) {
//                if (nums[i] > secondMax && nums[i] < max)
//                    secondMax = nums[i];
//            }
//            return secondMax;
//        }
//
//        return -1; //second max not found
//    }
    public static int secondLargestElement(int[] nums) {
        int max=nums[0];
        int second_max=Integer.MIN_VALUE;
        boolean flag = false; //Flag indicating whether second_max has been found or not

        for(int i=1;i<nums.length;i++){
            if(nums[i]>max){
                second_max = max; //Retrieving current max as second max value
                max = nums[i]; //Updating Current Max
                flag = true;

            }
            else if(nums[i]<max && nums[i]>=second_max) { //if second_max < nums[i] < max then second_max = nums[i]
                second_max = nums[i];
                flag = true;
            }
        }
        //Second max not found
        if(!flag)
            return -1;

        //Second Max found
        return second_max;
    }
    public static void main(String[] args){
        int[] arr = {Integer.MIN_VALUE,Integer.MIN_VALUE,Integer.MIN_VALUE};
        System.out.println(secondLargestElement(arr));
    }
}
