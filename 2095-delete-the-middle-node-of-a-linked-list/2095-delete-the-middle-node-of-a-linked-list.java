class Solution {
    public ListNode deleteMiddle(ListNode head) {

        if (head.next == null) {
            return null;
        }

        int l = 0;
        ListNode cur = head;

        while (cur != null) {
            l++;
            cur = cur.next;
        }

        int target = l / 2;

        cur = head;

        for (int i = 0; i < target - 1; i++) {
            cur = cur.next;
        }

        cur.next = cur.next.next;

        return head;
    }
}