package org.example.leetcode_task.l08_linked_lists.l082_reverse_linked_list;

public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        ListNode result = null;
        ListNode current = head;

        // current - processing node
        while(current != null) {
            ListNode next = current.next;
            current.next = result; // remove from old and add new list
            result = current; // switch to head of new list
            current = next;  // select new node in old list
        }
        return result;
    }

    public void printAllNodes(ListNode head) {
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        // create linked list
        ListNode listNode5 = new ListNode(5);
        ListNode listNode4 = new ListNode(4, listNode5);
        ListNode listNode3 = new ListNode(3, listNode4);
        ListNode listNode2 = new ListNode(2, listNode3);
        ListNode listNode1 = new ListNode(1, listNode2);

        ReverseLinkedList listNodeOperator = new ReverseLinkedList();
        listNodeOperator.printAllNodes(listNode1);
        ListNode reverseListNode = listNodeOperator.reverseList(listNode1);
        listNodeOperator.printAllNodes(reverseListNode);
        ListNode reverseListNode2 = listNodeOperator.reverseList(null);
        listNodeOperator.printAllNodes(reverseListNode2);
    }
}
