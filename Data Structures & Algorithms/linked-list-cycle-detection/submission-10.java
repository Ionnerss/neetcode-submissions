/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public boolean hasCycle(ListNode head) {
        if (head == null) return false;

        ListNode ojump = head, djump = head.next;
        while (ojump.next != null && djump.next != null) {
            if (ojump == djump) return true;
            ojump = ojump.next;
            if (djump.next.next == null) return false;
            djump = djump.next.next;
        }
        return false;
    }
}
