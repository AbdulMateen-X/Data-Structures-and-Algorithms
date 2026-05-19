package _05_ArrayProblems;
import java.util.ArrayList;

public class _08b_Union_Of_Two_Sorted_Arrays_Using_ArrayList {

    //Helper Function to add val to th result list provided that val is not present in the list
    public static void addIfUnique(ArrayList<Integer> list,int val){
        if(list.isEmpty() || list.getLast() != val){
            list.add(val);
        }
    }

    public static ArrayList<Integer> unionArray(int[] nums1, int[] nums2) {

        int n1 = nums1.length,n2 = nums2.length;

        ArrayList<Integer> result = new ArrayList<>(n1+n2); // initial capacity
        int i=0,j=0;

        while(i<n1 && j<n2){
            if(nums1[i] == nums2[j]){
                addIfUnique(result,nums1[i]);
                i++;
                j++;
            }
            else if(nums1[i] < nums2[j]){
                addIfUnique(result,nums1[i]);
                i++;
            }
            else{
                addIfUnique(result,nums2[j]);
                j++;
            }
        }

        while(i<n1){
            addIfUnique(result,nums1[i]);
            i++;
        }

        while(j<n2){
            addIfUnique(result,nums2[j]);
            j++;
        }

        return result;
    }

    public static  void main(String[]args){
        int nums1[] = {1,1,1,3};
        int nums2[] = {1,2,2};
        ArrayList<Integer> result = unionArray(nums1,nums2);
        System.out.println(result);
    }
}
