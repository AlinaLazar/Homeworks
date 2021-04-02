package C22ListeInlantuite2;

import java.util.Collections;
import java.util.LinkedList;

public class MergeTwoSortedListsLinkedLists{
    public static LinkedList<Integer> mergeTwoSortedLists(LinkedList<Integer> list1, LinkedList<Integer> list2){
        list1.addAll(list2);
        Collections.sort(list1);
        return list1;
    }
}
