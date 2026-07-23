package _08_LinkedList;

public class _14_Sort_List_LC_148 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {};
        ListNode(int val) {this.val = val;}
        ListNode(int val, ListNode next) {this.val = val;this.next = next;}
    }

    public ListNode merge(ListNode list1,ListNode list2){

        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;

        while(list1 != null && list2 != null){
            if(list1.val <= list2.val){
                tail.next = list1;
                list1 = list1.next;
            }
            else{
                tail.next = list2;
                list2 = list2.next;
            }
            tail = tail.next;
        }
        tail.next = (list1 == null) ? list2 : list1;
        return dummy.next;
    }
    public ListNode mergeSort(ListNode head){
        if(head == null || head.next == null)
            return head;

        ListNode slow = head;
        ListNode fast = head.next;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        ListNode right = mergeSort(slow.next);
        slow.next = null;
        ListNode left = mergeSort(head);
        return merge(left,right);
    }
    public ListNode sortList(ListNode head) {
        return mergeSort(head);
    }
}
