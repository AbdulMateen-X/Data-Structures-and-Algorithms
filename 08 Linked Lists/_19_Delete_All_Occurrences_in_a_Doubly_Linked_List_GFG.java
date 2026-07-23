package _08_LinkedList;

public class _19_Delete_All_Occurrences_in_a_Doubly_Linked_List_GFG {
    class Node {
        int data;
        Node next;
        Node prev;

        Node(int x) {
            data = x;
            next = null;
            prev = null;
        }
    }

    static Node deleteAllOccurOfX(Node head, int x) {
        Node curr = head;
        while(curr != null){
            if(curr.data == x){
                if(curr.prev == null){
                    head = curr.next;
                    if(head != null) head.prev = null;
                }
                else if(curr.next == null){
                    curr.prev.next = null;
                    curr.prev = null;
                }
                else{
                    curr.prev.next = curr.next;
                    curr.next.prev = curr.prev;
                }
            }
            curr = curr.next;
        }
        return head;

    }

}
