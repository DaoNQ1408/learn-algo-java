class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode result = new ListNode(); // linked list chính
        ListNode curr = result; // node để duyệt

        while (list1 != null && list2 != null) {
            // gắn node tiếp thep vào linked list
            if(list1.val > list2.val) {
                curr.next = list2;
                list2 = list2.next;
            } else {
                curr.next = list1;
                list1 = list1.next;
            }
            // node duyệt qua node tiếp theo
            curr = curr.next;
        }

        // khi 1 trong 2 list null, gắn phần còn lại của list kia vào result
        curr.next = (list1 != null) ? list1 : list2;

        return result.next;
    }
}
