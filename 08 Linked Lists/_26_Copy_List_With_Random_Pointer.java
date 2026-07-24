package _08_LinkedList;
import java.util.HashMap;

public class _26_Copy_List_With_Random_Pointer {
    class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }

    public Node copyRandomList1(Node head) {
        if(head == null)
            return head;

        Node original = head;


        while(original != null){
            Node temp = new Node(original.val);
            temp.next = original.next;
            original.next = temp;
            original = original.next.next;
        }

        original = head;
        while(original != null){
            if(original.random != null)
                original.next.random = original.random.next;
            else
                original.next.random = null;
            original = original.next.next;
        }

        Node copyHead = head.next;
        Node copy = copyHead;
        original = head;

        while(original != null){
            original.next = original.next.next;
            if(copy.next != null)
                copy.next = copy.next.next;
            original = original.next;
            copy = copy.next;
        }
        return copyHead;

    }

    public Node copyRandomList(Node head) {
        if(head == null)
            return head;

        HashMap<Node,Node> map = new HashMap<Node,Node>();
        Node copyHead = new Node(head.val);
        Node copy = copyHead;
        Node original = head.next;
        map.put(head,copyHead);

        while(original != null){
            copy.next = new Node(original.val);
            copy = copy.next;
            map.put(original,copy);
            original = original.next;
        }

        original = head;
        copy = copyHead;

        while(original != null){
            copy.random = map.get(original.random);
            original = original.next;
            copy = copy.next;
        }
        return copyHead;

    }
}
