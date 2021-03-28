package C21ListeInlantuite;

public class MergeTwoLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode auxList = new ListNode();
        ListNode head = auxList;
        ListNode it1 = l1;
        ListNode it2 = l2;

        while (it1 != null && it2 != null) {

            if (it1.val <= it2.val) {           //aleg valoarea mai mica si o adaug in lista
                head.next = it1;
                it1 = it1.next;                      //mut iteratorul pentru lista 1
            } else {
                head.next = it2;
                it2 = it2.next;                     //mut iteratorul pentru lista 2
            }

            head = head.next;                       //mut iteratorul pentru lista comuna
        }

        if (it1 != null && it2 == null) {            //verific daca lista 1 mai are elemente si le                                                        adaug la lista comuna
            head.next = it1;
        }
        if (it1 == null && it2 != null) {            //verific daca lista 2 mai are elemente si le                                                        adaug la lista comuna
            head.next = it2;
        }

        return auxList.next;                        //returnez lista comuna
    }
}
