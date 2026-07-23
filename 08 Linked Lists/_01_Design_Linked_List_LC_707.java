package _08_LinkedList;

class MyLinkedList {

    private static class Node{
        int data;
        Node next;

        Node(int data,Node next){
            this.data = data;
            this.next = next;
        }

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    private Node head;
    private int size;

    public MyLinkedList() {
        head = null;
        size = 0;
    }

    public int getSize(){
        return this.size;
    }

    public void printList(){
        Node current = head;
        for(int i=0;i<size;i++) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }

    public int get(int index) {
        if(index < 0 || index>= size)
            return -1;

        Node current = head;
        for(int i=0;i<index;i++)
            current = current.next;

        return current.data;
    }

    public void addAtHead(int val) {
        Node temp = new Node(val);
        temp.next = head;
        head = temp;
        size++;
    }

    public void addAtTail(int val) {
        Node temp = new Node(val);
        if(head == null){
            head = temp;
            size++;
            return;
        }

        Node current = head;
        for(int i=0;i<size-1;i++){
            current = current.next;
        }
        current.next = temp;
        size++;
    }

    public void addAtIndex(int index, int val) {
        if(index<0 || index>size)
            return;

        if(index == 0) {
            addAtHead(val);
            return;
        }

        Node current = head;
        Node temp = new Node(val);

        for(int i=0;i<index-1;i++)
            current = current.next;

        temp.next = current.next;
        current.next = temp;
        size++;
    }

    public void deleteAtIndex(int index) {
        if(index < 0 || index >=size)
            return;

        if(index == 0){
           head = head.next;
           size--;
           return;
        }

        Node current = head;
        for(int i=0;i<index-1;i++)
            current = current.next;

        current.next = current.next.next;
        size--;
    }
}

public class _01_Design_Linked_List_LC_707 {
    public static void main(String[] args){
        MyLinkedList list = new MyLinkedList();
        list.addAtTail(10);
        list.addAtTail(20);
        list.addAtTail(30);
        list.addAtIndex(0,1);
        list.addAtIndex(2,15);
        list.addAtIndex(5,100);
        list.deleteAtIndex(0);
        list.deleteAtIndex(3);
        list.deleteAtIndex(3);
        list.printList();
    }
}
