package com.assignments;


import org.testng.annotations.Test;

public class ReverseLinkedList {

    class ListNode {
        int no;
        ListNode next;
        ListNode(int no) {
            this.no = no;
        }
    }

    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }
        return prev;
    }

    public void printList(ListNode head) {
        ListNode currentNode = head;

        while (currentNode != null) {
            System.out.print(currentNode.no + " ");
            currentNode =currentNode.next;
        }
        System.out.println();
    }


    @Test
    public void test1() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        //head.next=new ListNode(6);

        System.out.println("Original List is:");
        printList(head);

        ListNode reversedHead = reverseList(head);

        System.out.println("Reversed List is:");
        printList(reversedHead);
    }

}


