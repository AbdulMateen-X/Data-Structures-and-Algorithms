package _08_LinkedList;

import java.util.List;

public class _03_Doubly_Linked_List {
    private static class ListNode{
        int data;
        ListNode prev;
        ListNode next;

        public ListNode(int data){
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    private ListNode addAtHead(ListNode head,int data){
        ListNode temp = new ListNode(data);
        if(head == null){
            head = temp;
            return head;
        }

        temp.next = head;
        head.prev = temp;
        head = temp;
        return head;
    }

    private ListNode deleteAtHead(ListNode head){
        if(head == null)
            return head;
        head = head.next;
        if(head != null)
            head.prev = null;
        return head;
    }

    private ListNode reverseDLL(ListNode head) {
        if(head == null)
            return head;

        ListNode current = head;
        ListNode newHead = null;

        while(current != null) {
            ListNode temp = current.next;
            current.next = current.prev;
            current.prev = temp;
            newHead = current;
            current = temp;
        }
        return newHead;
    }

}
