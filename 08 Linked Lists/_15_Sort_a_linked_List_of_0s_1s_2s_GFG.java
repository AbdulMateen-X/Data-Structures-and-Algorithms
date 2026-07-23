package _08_LinkedList;

public class _15_Sort_a_linked_List_of_0s_1s_2s_GFG {
    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public Node segregate(Node head) {
        if(head == null || head.next == null)
            return head;

        Node zeroDummy = new Node(0), zeroTail = zeroDummy;
        Node oneDummy = new Node(0), oneTail = oneDummy;
        Node twoDummy = new Node(0), twoTail = twoDummy;

        Node curr = head;
        while(curr != null){
            if(curr.data == 0){
                zeroTail.next = curr;
                zeroTail = curr;
            }
            else if(curr.data == 1){
                oneTail.next = curr;
                oneTail = curr;
            }
            else{
                twoTail.next = curr;
                twoTail = curr;
            }
            curr = curr.next;
        }

        zeroTail.next = (oneDummy.next!=null)?oneDummy.next:twoDummy.next;
        oneTail.next = twoDummy.next;
        twoTail.next = null;

        return (zeroDummy.next!=null) ? zeroDummy.next : ( (oneDummy.next!=null) ? oneDummy.next : twoDummy.next );

    }
}
