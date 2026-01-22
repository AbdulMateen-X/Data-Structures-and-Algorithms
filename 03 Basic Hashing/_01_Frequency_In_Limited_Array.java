//  You are given an array arr[] containing positive integers. The elements in the array arr[]
//  range from  1 to n (where n is the size of the array), and some numbers may be repeated or
//  absent. Your have to count the frequency of all numbers in the range 1 to n and
//  return an array of size n such that result[i] represents the frequency of the number i (1-based indexing).

import java.util.Arrays;
import java.util.List;

public class _01_Frequency_In_Limited_Array {
    public static List<Integer> frequencyCount(int[] arr){
        Integer[] freq = new Integer[arr.length];
//        for(int i=0;i<freq.length;i++){
//            freq[i] = 0;
//        }
        Arrays.fill(freq,0);
        for(int i=0;i<arr.length;i++){
            freq[arr[i]-1]++;
        }
        return Arrays.asList(freq);
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4,4,5,5,5,9};
        System.out.println(frequencyCount(arr));
    }
}
