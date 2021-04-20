public class reverseSinglyLinkedList {

    //Define a singly linked list
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }

    }

    public ListNode revLinkList(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        ListNode next = null;

        while (curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

}

