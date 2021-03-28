package C21ListeInlantuite;

public class RotateList {
    public ListNode rotateRight(ListNode head, int k) {

        if (head == null || k == 0) {
            return head;
        }

        int count = 1;
        //fac lista circulanta
        ListNode it = head;
        while (it.next != null) {
            it = it.next;
            count += 1;
        }
        it.next = head;

        //calculez unde trebuie "rupta" lista
        k = k % count;
        int positionToBreak = count - k;

        //desfac legaturile
        count = 1;
        it = head;
        while (count < positionToBreak) {
            it = it.next;
            count++;
        }
        ListNode first = it.next;
        it.next = null;
        return first;
    }
}
