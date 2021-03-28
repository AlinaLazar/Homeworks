package C22ListeInlantuite2;

import java.util.LinkedList;
import java.util.ListIterator;

public class BigNumbers {
//    public static LinkedList<Integer> sum(LinkedList<Integer> op1, LinkedList<Integer> op2) {
//
//
//    }

    public static LinkedList<Integer> makeSum (LinkedList<Integer> sourceList, LinkedList<Integer> destinationList) {
        ListIterator<Integer> it1 = sourceList.listIterator();
        ListIterator<Integer> it2 = destinationList.listIterator();
        int keepInMind = 0;
        LinkedList<Integer> result = new LinkedList<>();
        Integer totalValue = 0;

        while(it1.hasNext()){
            it1.next();
        }
        while(it2.hasNext()){
            it2.next();
        }
        while (it2.hasPrevious() && it1.hasPrevious()){
            totalValue = it1.previous() + it2.previous() + keepInMind;
            if(totalValue/10 > 0){

                result.addFirst(totalValue % 10);
                keepInMind = 0;
                keepInMind = totalValue/10 + keepInMind;
            }
            else {
                destinationList.add(totalValue);
            }
        }
        if(!it2.hasPrevious() && it1.hasPrevious()){
            totalValue = it1.previous();
            result.addFirst(totalValue);
        }
        if(it2.hasPrevious() && !it1.hasPrevious()){
            totalValue = it2.previous();
            result.addFirst(totalValue);
        }
        return result;
        }




    public static void main(String[] args) {
        LinkedList<Integer> listA = new LinkedList<>();
        listA.add(2);
        listA.add(1);
        listA.add(7);
        listA.add(8);
        LinkedList<Integer> listB = new LinkedList<>();
        listB.add(5);
        listB.add(9);
        listB.add(6);
        System.out.println(makeSum(listA,listB));
    }
}
