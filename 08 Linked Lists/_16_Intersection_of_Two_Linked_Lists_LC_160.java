package _08_LinkedList;

public class _16_Intersection_of_Two_Linked_Lists_LC_160 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {};
        ListNode(int val) {this.val = val;}
        ListNode(int val, ListNode next) {this.val = val;this.next = next;}
    }

    public ListNode getIntersectionNode1(ListNode headA, ListNode headB) {
        ListNode pA = headA;
        ListNode pB = headB;

        while(pA != pB){
            pA = (pA == null) ? headB : pA.next;
            pB = (pB == null) ? headA : pB.next;
        }

        return pA;
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lengthA = 0, lengthB = 0;
        ListNode currA = headA, currB = headB;
        while(currA != null || currB != null){
            if(currA != null){
                lengthA++;
                currA = currA.next;
            }
            if(currB != null){
                lengthB++;
                currB = currB.next;
            }
        }
        currA = headA;
        currB = headB;

        if(lengthA > lengthB){
            for(int i=0;i<lengthA-lengthB;i++){
                currA = currA.next;
            }
        }
        if(lengthB > lengthA){
            for(int i=0;i<lengthB-lengthA;i++){
                currB = currB.next;
            }
        }

        while(currA != null && currB != null){
            if(currA == currB)
                return currA;

            currA = currA.next;
            currB = currB.next;
        }

        return null;
    }
}
