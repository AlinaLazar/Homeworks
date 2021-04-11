package Project3;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class RadixSort {

    private static Queue<String> listWithZeros = new LinkedList<>();
    private static HashMap<Integer, LinkedList<String>> hashMap = new HashMap<>(10);

    public static void radixSort (int[] list, String order){
        addZeros(list);
        int aux = digitsOfMaxNumber(list);

        while (aux > 0){
            addToHashMap(aux);
            //System.out.println(aux);
            if (aux == 1 && order.equals("desc")){
                moveFromHashToQueue("desc");
            } else {
                moveFromHashToQueue("asc");
            }
            aux--;
        }
        System.out.print("Rezultat sortare : \n");
        for(String value: listWithZeros) {
            System.out.print(value + " ");
        }
    }


    public static int digitsOfMaxNumber(int[] list) {
        int currentNumber = list[0];
        for (int i = 0; i < list.length; i++) {
            if (list[i] > currentNumber) {
                currentNumber = list[i];
            }
        }
        int digits = 0;
        while (currentNumber != 0) {
            int lastDigit = currentNumber % 10;
            digits++;
            currentNumber /= 10;
        }
        return digits;
    }

    public static void addZeros(int[] list) {
        for (int i = 0; i < list.length; i++) {
            String result = Integer.toString(list[i]);
            while (result.length() < digitsOfMaxNumber(list))
                result = "0" + result;
            //System.out.println(result);
            listWithZeros.offer(result);
        }

    }

    private static void addToHashMap(int iterator) { // muta din coada in hashMap

        int digitIndex = iterator - 1;
        while (!listWithZeros.isEmpty()) {
            int index = Integer.parseInt(String.valueOf(listWithZeros.peek().charAt(digitIndex)));
            LinkedList<String> numbers = hashMap.get(index);
            if (numbers == null) {                    // daca indexul curent nu este deja adaugat in hashMap
                numbers = new LinkedList<String>();   // se creeaza nou linked list
                hashMap.put(index, numbers);          // se ataseaza linked list la indexul curent
            }
            numbers.add(listWithZeros.poll());
        }
    }

    private static void moveFromHashToQueue(String order) {
        if(order.equals("asc")) {
            for(int i =0 ; i <= 9 ;i++) {
                if(hashMap.get(i) != null) {
                    while(!hashMap.get(i).isEmpty()) { //cat timp mai exista elemente in LinkedList aferent index

                        listWithZeros.offer(hashMap.get(i).removeFirst());  // muta elementele din linkedList in coada
                    }
                }
            }
        } else if(order.equals("desc")) {
            for(int i = 9 ; i >= 0 ;i--) {   //mutarea incepe de la ultimul index
                if(hashMap.get(i) != null) {
                    while(!hashMap.get(i).isEmpty()) { //cat timp mai exista elemente in LinkedList aferent index
                        listWithZeros.offer(hashMap.get(i).removeLast());  // muta elementele din linked list incepand cu ultimul element
                    }
                }
            }
        }

    }


    public static void main(String[] args) {
        int [] list = {783, 41, 9, 1001};
       // radixSort(list,"desc");
        radixSort(list,"asc");
    }


}
