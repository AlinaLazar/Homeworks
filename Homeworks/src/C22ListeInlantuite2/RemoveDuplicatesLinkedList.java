package C22ListeInlantuite2;

import java.util.LinkedList;
import java.util.ListIterator;

public class RemoveDuplicatesLinkedList {
    public static LinkedList<Integer> removeDuplicates(LinkedList<Integer> list) {
        ListIterator<Integer> it = list.listIterator();
        Integer current = null;
        Integer aux = null;

        while (it.hasNext()) {
            current = it.next();
            if (it.hasNext()) {
                aux = it.next();
            }
            if (current == aux) {
                it.previous();
                it.remove();
            }
        }
        return list;
    }

    public static LinkedList<Integer> removeDuplicates2(LinkedList<Integer> list) {
        ListIterator<Integer> it = list.listIterator();
        Integer current = null;
        Integer aux = null;
        Integer duplicateValue = null;

        while (it.hasNext()) {
            current = it.next();
            System.out.print(current + "current");
            if (it.hasNext()) {
                aux = it.next();
                System.out.println( );
                System.out.print(aux + "aux");
            }
            if (current == aux) {
                duplicateValue = current;

                it.remove();
            }
            if(duplicateValue == current){
                it.previous();
                it.remove();
            }
        }
        return list;
    }


    public static LinkedList<Integer> removeAllDuplicates(LinkedList<Integer> list) {
        ListIterator<Integer> it = list.listIterator();
        Integer current = null;
        Integer aux = null;
        Integer duplicateValue = null;

        while (it.hasNext()) {
            current = it.next();
            if (it.hasNext()) {
                aux = it.next();      //se stabilesc valorile current si aux
            }
            if (current == aux) {
                duplicateValue = current;  // se sterg ambele noduri care sunt duplicate si se stocheaza valoarea in var duplicatedValue
                it.remove();
                it.previous();
                it.remove();
            } else if (duplicateValue == current) {   // sterge valoarea unica ramasa duplicata
                it.previous();
                it.remove();
            }
        }
        return list;
    }

    public static LinkedList<Integer> removeDuplicates3(LinkedList<Integer> list) { //cristi
        ListIterator<Integer> it = list.listIterator();

        while (it.hasNext()) {
            int value = it.next();
            // salvez valoarea curenta
            if (it.hasNext()) {
            /*
            daca exista un element urmator
                verific daca valoarea elementului urmator este egala cu valoarea curenta
                daca este indeplinita conditia de mai sus -> sterg elementul
             */
                while(it.hasNext() && it.next() == value) {
                    it.remove();
                }
                // dupa ce am sters toate elementele consecutive egale, merg un pas "inapoi"
                it.previous();
            }
        }
        return list;
    }
}

