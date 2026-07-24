package _08_LinkedList;

public class _24_Rotate_List_LC_61 {

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {};
        ListNode(int val) {this.val = val;}
        ListNode(int val, ListNode next) {this.val = val;this.next = next;}
    }

    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null || k == 0)
            return head;

        ListNode curr = head;
        int n = 1;
        while(curr.next != null){
            curr = curr.next;
            n++;
        }
        k = k % n;

        if(k==0)
            return head;

        ListNode tail = curr;
        tail.next = head;

        curr = head;
        for(int i=0;i<n-k-1;i++){
            curr = curr.next;
        }

        head = curr.next;
        curr.next = null;

        return head;

    }
}
