package C21ListeInlantuite;

public class ReverseList {
    public ListNode reverseList(ListNode head){
        ListNode it = head;
        ListNode previous = null;

        while (it != null){
            ListNode temp = it.next;
            it.next = previous;
            previous = it;
            it = temp;
        }
        return previous;
    }
}
