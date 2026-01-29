// https://leetcode.com/problems/remove-nth-node-from-end-of-list/
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        int size = 0;
        ListNode count = head;
        ListNode prev = head;

        // tính size của linked list
        while (count != null) {
            size++;
            count = count.next;
        }
        // nếu muốn xóa node đầu tiên
        if(size == n) {
            return head.next;
        }
        // vị trí node cần xóa tính từ 0
        int place = size - n;
        // duyệt tới trc node cần xóa
        for(int i = 0; i < place - 1; i++) {
            prev = prev.next;
        }

        ListNode delete = prev.next;
        // xóa node
        if(delete == null || delete.next == null) {
            prev.next = null;
        } else {
            prev.next = delete.next;
            delete.next = null;
        }


        return head;
    }
}
