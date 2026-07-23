package _08_LinkedList;

public class _22_Remove_Duplicates_From_A_Sorted_DLL_GFG {
    class Node {
        int data;  // value stored in node
        Node next;
        Node prev;

        Node(int value) {
            data = value;
            next = null;
            prev = null;
        }
    }
    
    Node removeDuplicates(Node headRef) {
        if(headRef == null)
            return headRef;

        Node curr = headRef;
        while(curr.next != null){
            if(curr.data == curr.next.data){
                curr.next = curr.next.next;
                if(curr.next != null)
                    curr.next.prev = curr;
            }
            else
                curr = curr.next;
        }

        return headRef;
    }
}
