package _08_LinkedList;

import java.util.ArrayList;

public class _20_Pair_Sum_in_Doubly_Linked_List_GFG {
    class Node
    {
        int data;
        Node next,prev;

        Node(int x){
            data = x;
            next = null;
            prev = null;
        }
    }public static ArrayList<ArrayList<Integer>> findPairsWithGivenSum(int target,
                                                                       Node head) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        Node left = head;
        Node right = head;
        while(right.next != null){
            right = right.next;
        }
        while(left != right && right.next != left){
            int sum = left.data + right.data;
            if(sum == target){
                ArrayList<Integer> temp = new ArrayList<>();
                temp.add(left.data);
                temp.add(right.data);
                result.add(temp);
                left = left.next;
                right = right.prev;
            }
            else if(sum > target)
                right = right.prev;
            else
                left = left.next;

        }
        return result;
    }
}
