package _08_LinkedList;

public class _02_Delete_Node_in_a_Linked_List_LC_237 {
    static class Node{
        int data;
        _02_Delete_Node_in_a_Linked_List_LC_237.Node next;

        Node(int data, _02_Delete_Node_in_a_Linked_List_LC_237.Node next){
            this.data = data;
            this.next = next;
        }

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public void deleteNode(Node node) {
        node.data = node.next.data;
        node.next = node.next.next;
    }
}
