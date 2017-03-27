package Q2AddTwoNumbers;

/**
 * Edge case: l1 and l2 reaches end but carry is not zero.
 * 03/25/2017
 */

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode preHead = new ListNode(0);
        ListNode pt = preHead;
        ListNode c1 = l1;
        ListNode c2 = l2;
        int carry = 0;
        while (c1 != null || c2 != null) {
            int sum = carry;
            carry = 0;
            if (c1 != null) {
                sum += c1.val;
                c1 = c1.next;
            }
            if (c2 != null) {
                sum += c2.val;
                c2 = c2.next;
            }
            if (sum > 9) {
                sum -= 10;
                carry = 1;
            }
            pt.next = new ListNode(sum);
            pt = pt.next;
        }
        if (carry > 0) {
            pt.next = new ListNode(1);
        }
        return preHead.next;
    }
}
