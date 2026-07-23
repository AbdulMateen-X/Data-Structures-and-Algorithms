package _08_LinkedList;

public class _08_Length_Of_Loop_GFG {
    public class Node {
        int data;
        Node next;

        Node(int x) {
            data = x;
            next = null;
        }
    }

    public int lengthOfLoop(Node head) {
        if(head == null)
            return 0;

        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            //Loop Detected
            if(slow == fast) {
                int count = 0;
                do {
                    slow = slow.next;
                    count++;
                } while (slow != fast);
                return count;
            }
        }
        return 0;
    }
}
