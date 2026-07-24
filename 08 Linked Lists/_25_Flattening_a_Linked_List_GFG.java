package _08_LinkedList;

public class _25_Flattening_a_Linked_List_GFG {

    class Node {
        int data;
        Node next;
        Node bottom;

        Node(int x) {
            data = x;
            next = null;
            bottom = null;
        }
    }

    public Node merge(Node l1,Node l2){
        Node dummy = new Node(0);
        Node tail = dummy;

        while(l1 != null && l2 != null){
            if(l1.data < l2.data){
                tail.bottom = l1;
                l1 = l1.bottom;
            }
            else{
                tail.bottom = l2;
                l2 = l2.bottom;
            }
            tail = tail.bottom;
        }

        tail.bottom = (l1 == null) ? l2 : l1;
        return dummy.bottom;
    }

    public Node flatten(Node root) {
        if(root == null || root.next == null)
            return root;
        Node right = flatten(root.next);
        return merge(root,right);
    }

}
