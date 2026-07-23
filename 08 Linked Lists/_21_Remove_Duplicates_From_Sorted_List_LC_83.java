package _08_LinkedList;

public class _21_Remove_Duplicates_From_Sorted_List_LC_83 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {};
        ListNode(int val) {this.val = val;}
        ListNode(int val, ListNode next) {this.val = val;this.next = next;}
    }
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null)
            return head;
        ListNode curr = head;
        while(curr.next != null){
            if(curr.val == curr.next.val){
                curr.next = curr.next.next;
            }
            else
                curr = curr.next;
        }
        return head;
    }
}
