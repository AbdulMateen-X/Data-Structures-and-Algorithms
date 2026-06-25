package _05_ArrayProblems;

import java.util.ArrayList;
public class _21_Array_Leaders {
    public static ArrayList<Integer> leaders(int arr[]) {
        ArrayList<Integer> result  = new ArrayList<>();
        int max = arr[arr.length-1];
        result.add(arr[arr.length-1]);
        for(int i=arr.length-2;i>=0;i--){
            if(arr[i] >= max){
                result.add(0,arr[i]);
                max = arr[i];
            }
        }
        return result;
    }
}
