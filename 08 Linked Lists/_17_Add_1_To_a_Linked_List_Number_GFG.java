package _08_LinkedList;

public class _17_Add_1_To_a_Linked_List_Number_GFG {
    class Node{
        int data;
        Node next;

        Node(int x){
            data = x;
            next = null;
        }
    }

    public Node addOne(Node head) {
        Node p = null;
        Node curr = head;
        while(curr != null){
            if(curr.data != 9)
                p = curr;

            curr = curr.next;
        }

        if(p == null){
            Node newNode = new Node(1);
            newNode.next = head;
            head = newNode;
            p = head;
        }
        else
            p.data += 1;

        p = p.next;
        while(p != null){
            p.data = 0;
            p = p.next;
        }
        return head;
    }
}
