package _08_LinkedList;

public class _11_Remove_Nth_Node_From_End_of_List_LC_19 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {};
        ListNode(int val) {this.val = val;}
        ListNode(int val, ListNode next) {this.val = val;this.next = next;}
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode prev = null;
        ListNode del = head;
        ListNode curr = head;
        int count = 0;
        while(curr != null){
            if(count == n){
                prev = del;
                del = del.next;
            }
            else
                count++;

            curr = curr.next;
        }

        if(prev == null)
            head = head.next;
        else
            prev.next = del.next;

        return head;
    }
}
