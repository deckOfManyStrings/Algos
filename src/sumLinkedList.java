/**
 * Given 2 non-empty linked lists that represent non-negative integers, add the two numbers and return it as a linked list in reverse order.
 *
 * Note: The 2 given linked lists are in reverse order and each linked list node can only store one digit.
 *
 * Example:
 *
 *
 * Input: (1 -> 2 -> 3) + (4 -> 5 -> 6)
 * Output: 5 -> 7 -> 9
 * Explanation: 321 + 654 = 975.
 *
 *
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }


    public class sumLinkedList {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            ListNode dummyHead = new ListNode(0);
            ListNode p = l1, q = l2, curr = dummyHead;
            int carry = 0;
            while (p != null || q != null) {
                int x = (p != null) ? p.val : 0;
                int y = (q != null) ? q.val : 0;
                int sum = carry + x + y;
                carry = sum / 10;
                curr.next = new ListNode(sum % 10);
                curr = curr.next;
                if (p != null) p = p.next;
                if (q != null) q = q.next;
            }
            if (carry > 0) {
                curr.next = new ListNode(carry);
            }
            return dummyHead.next;

        }
    }
}