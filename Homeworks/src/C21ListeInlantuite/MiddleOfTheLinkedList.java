package C21ListeInlantuite;

public class MiddleOfTheLinkedList {
    public ListNode middleNode(ListNode head) {           //de returnat lista incepand de la mijloc
        ListNode slow = head;
        ListNode fast = head;

        while ( fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
