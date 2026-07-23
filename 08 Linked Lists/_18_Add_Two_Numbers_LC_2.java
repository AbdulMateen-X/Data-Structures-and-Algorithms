package _08_LinkedList;

public class _18_Add_Two_Numbers_LC_2 {

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {};
        ListNode(int val) {this.val = val;}
        ListNode(int val, ListNode next) {this.val = val;this.next = next;}
    }

    public ListNode addTwoNumbers1(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        int carry = 0;

        while(l1 != null || l2 != null || carry != 0){
            int val1 = (l1 != null) ? l1.val : 0;
            int val2 = (l2 != null) ? l2.val : 0;
            int sum = val1 + val2 + carry;
            carry = sum / 10;

            tail.next = new ListNode(sum % 10);
            tail = tail.next;

            if(l1 != null)
                l1 = l1.next;
            if(l2 != null)
                l2 = l2.next;
        }

        return dummy.next;
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int sum = 0;
        ListNode head = null, tail = null;

        while(l1 != null || l2 != null){
            if(l1 == null){
                sum += l2.val;
                ListNode temp = new ListNode(sum % 10);
                tail.next = temp;
                tail = tail.next;
                l2 = l2.next;
            }
            else if(l2 == null){
                sum += l1.val;
                ListNode temp = new ListNode(sum % 10);
                tail.next = temp;
                tail = tail.next;
                l1 = l1.next;
            }
            else{
                sum += l1.val + l2.val;
                ListNode temp = new ListNode(sum % 10);
                if(head == null){
                    head = temp;
                    tail = temp;
                }
                else{
                    tail.next = temp;
                    tail = tail.next;
                }
                l1 = l1.next;
                l2 = l2.next;
            }
            if(sum > 9)
                sum = 1;
            else
                sum = 0;
        }
        if(sum == 1){
            ListNode temp = new ListNode(1);
            tail.next = temp;
            tail = tail.next;
        }

        return head;
    }
}
