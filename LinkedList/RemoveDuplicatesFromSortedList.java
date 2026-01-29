// https://leetcode.com/problems/remove-duplicates-from-sorted-list/
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode curr = head;

        if(curr == null || curr.next == null) {
            return head;
        }

        ListNode nextt = curr.next;

        do {
            if(nextt.val == curr.val) {
                if(nextt.next == null) {
                    curr.next = null;
                } else {
                    curr.next = nextt.next;
                    nextt = curr.next;
                }
            } else {
                nextt = nextt.next;
                curr = curr.next;
            }
        } while(curr.next != null);

        return head;
    }
}
