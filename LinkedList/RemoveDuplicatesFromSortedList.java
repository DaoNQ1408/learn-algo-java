// https://leetcode.com/problems/remove-duplicates-from-sorted-list/
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        // dùng curr và nextt để check value = nhau hay không ?
        ListNode curr = head;
        // nếu curr là null hoặc là node duy nhất thì return
        if(curr == null || curr.next == null) {
            return head;
        }
        // sau đó mới tạo curr
        ListNode nextt = curr.next;

        do {
            if(nextt.val == curr.val) { // value = nhau
                if(nextt.next == null) { // nextt là node cuối cùng
                    curr.next = null;
                } else { // nextt không phải là node cuối cùng
                    curr.next = nextt.next;
                    nextt = curr.next;
                }
            } else { // value != nhau thì duyệt tiếp các node tiếp theo
                nextt = nextt.next;
                curr = curr.next;
            }
        } while(curr.next != null); // khi nào curr.next == null thì dừng

        return head;
    }
}
