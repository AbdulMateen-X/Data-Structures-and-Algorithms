package _08_LinkedList;

public class _23_Reverse_Nodes_In_K_Groups_LC_25 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {};
        ListNode(int val) {this.val = val;}
        ListNode(int val, ListNode next) {this.val = val;this.next = next;}
    }

    public ListNode reverseKGroup1(ListNode head, int k) {
        if (head == null || head.next == null || k == 1)
            return head;

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode groupPrev = dummy; // The node right before the current group
        ListNode curr = head;
        ListNode groupStart = head;
        int count = 0;

        while (curr != null) {
            count++;
            if (count == k) {
                ListNode nextGroupStart = curr.next;
                ListNode prev = nextGroupStart;
                ListNode p = groupStart;

                // Standard reversal for k nodes
                while (p != nextGroupStart) {
                    ListNode nextNode = p.next;
                    p.next = prev;
                    prev = p;
                    p = nextNode;
                }

                // Connect the previous group's end to the new head of this group
                groupPrev.next = curr;

                // The original start of this group is now its tail
                groupPrev = groupStart;

                // Prepare for the next group
                groupStart = nextGroupStart;
                curr = nextGroupStart;
                count = 0;
            } else {
                curr = curr.next;
            }
        }

        return dummy.next;
    }

    public ListNode reverseKGroup(ListNode head, int k) {

        if(head == null || head.next == null || k == 1)
            return head;

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode curr = head;
        ListNode p = head;
        int count = 0;
        ListNode lastGroupEnd = p;

        while(curr != null){
            count++;
            if(count == k){
                ListNode nextGroupStart = curr.next;
                ListNode prevNode = curr.next;
                while(p != nextGroupStart){
                    ListNode nextNode = p.next;
                    p.next = prevNode;
                    prevNode = p;
                    p = nextNode;
                }
                if(dummy.next == head)
                    dummy.next = curr;
                else{
                    ListNode temp = lastGroupEnd.next;
                    lastGroupEnd.next = curr;
                    lastGroupEnd = temp;
                }
                count = 0;
                curr = nextGroupStart;
            }
            else
                curr = curr.next;
        }
        return dummy.next;
    }


}
