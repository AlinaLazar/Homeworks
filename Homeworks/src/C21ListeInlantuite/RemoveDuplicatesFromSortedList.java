package C21ListeInlantuite;

public class RemoveDuplicatesFromSortedList {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode it = head;

        while (it != null && it.next != null) {
            if (it.next.val == it.val) {
                it.next = it.next.next;
            } else {
                it = it.next;
            }
        }
        return head;
    }

}
