package _08_LinkedList;

public class _12_Delete_the_Middle_Node_of_A_LInked_List_LC_2095 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {};
        ListNode(int val) {this.val = val;}
        ListNode(int val, ListNode next) {this.val = val;this.next = next;}
    }

    public ListNode deleteMiddle(ListNode head) {
        // Edge case: single node list
        if(head == null || head.next == null)
            return null;

        ListNode slow = head;
        ListNode fast = head.next.next;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        // slow is now right BEFORE the middle node
        slow.next = slow.next.next;
        return head;
    }
}
