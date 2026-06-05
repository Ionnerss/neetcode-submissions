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
    public void reorderList(ListNode head) {
        ListNode current = head, ojump = head, djump = head;

        while (djump.next != null) {
            if (djump.next.next == null) {
                djump = djump.next;
                ojump = ojump.next;
                break;
            }

            ojump = ojump.next;
            djump = djump.next.next;
        }

        ListNode startSList = ojump.next;
        ListNode previous = null;
        ojump.next = null;

        while (startSList != null) {
            ListNode temp = startSList.next;
            startSList.next = previous;
            previous = startSList;
            startSList = temp;
        }

        while (current.next != null) {
            ListNode temp = current.next;
            current.next = djump;
            if (djump.next == null) {
                djump.next = temp;
                current = temp;
                break;
            }

            ListNode temp2 = djump.next;
            djump.next = temp;

            current = temp;
            djump = temp2;
        }
    }
}
