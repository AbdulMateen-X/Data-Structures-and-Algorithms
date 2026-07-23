package _08_LinkedList;

public class _09_Palindrome_Linked_List_LC_234 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {
        }
        ListNode(int val) {
            this.val = val;
        }
        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }


        //Reverse Second Half
        ListNode currentNode =  slow;
        ListNode prevNode = null;
        while(currentNode != null){
            ListNode nextNode = currentNode.next;
            currentNode.next = prevNode;
            prevNode = currentNode;
            currentNode = nextNode;
        }

        //Compare
        ListNode firstHalf = head;
        ListNode secondHalf = prevNode;

        while(secondHalf != null){
            if(secondHalf.val != firstHalf.val)
                return false;

            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }

        return true;
    }
}
