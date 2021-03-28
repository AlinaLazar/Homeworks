package C22ListeInlantuite2;

import java.util.LinkedList;
import java.util.List;

public class TestClassTown {
    public static void main(String[] args) {

        OrderedList<Town> towns = new OrderedList<>();

        Town town1 = new Town("Timisoara",100);
        Town town2 = new Town("Arad", 150);
        Town town3 = new Town("Bucuresti", 0);
        Town town4 = new Town("Ploiesti", 30);

        towns.addInOrderedList(town1);
        towns.addInOrderedList(town2);
        towns.addInOrderedList(town3);
        towns.addInOrderedList(town4);

        System.out.println(towns);


        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(3);
        list.add(4);
        list.add(4);
        list.add(5);
        list.add(5);
        list.add(6);
        System.out.println("Lista:" + list);
        RemoveDuplicatesLinkedList.removeDuplicates2(list);   //sterge daca sunt cate 2 , nu mai multe
        System.out.println("Lista dupa stergerea duplicatelor :" + list);

//        RemoveDuplicatesLinkedList.removeAllDuplicates(list);  //daca sunt 3 noduri identice mai adaug o variabila?
//        System.out.println("Lista dupa stergerea tuturor duplicatelor:" + list);
    }
}
