package Project3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class RadixSortWithQueue {
    private static Queue<String> listWithZeros2 = new LinkedList<>();
    private static Queue<Integer> resultList = new LinkedList<>();

    public static int digitsOfMaxNumberList(int[] list) {
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

    public static void addZerosList(int[] list) {
        for (int i = 0; i < list.length; i++) {
            String result = Integer.toString(list[i]);
            while (result.length() < digitsOfMaxNumberList(list))
                result = "0" + result;
            //System.out.println(result);
            listWithZeros2.offer(result);
        }

    }
        public static void radixSort2(int[] list) {
        addZerosList(list);
        Queue[] bucket = new LinkedList[10];

        for (int i = 0; i < 10; i++) {
            bucket[i] = new LinkedList();
        }

        int iterator = digitsOfMaxNumberList(list) - 1;
            //while (!listWithZeros2.isEmpty()){
            for (int j = 0; j < iterator ; j++){
                for (int i = 0; i < 10; i++) {

                    if(!listWithZeros2.isEmpty()){
                         if (Integer.parseInt(String.valueOf(listWithZeros2.peek().charAt(iterator))) == i) {
                             System.out.println(Integer.parseInt(String.valueOf(listWithZeros2.peek().charAt(iterator))));
                             int aux = Integer.parseInt(String.valueOf(listWithZeros2.poll()));

                             bucket[i].offer(aux);
                             System.out.println(bucket[1]);
                             System.out.println(bucket[3]);
                             System.out.println(bucket[9]);
                         }
                        iterator--;

                    }
            }
        }

//        int idx = 0;
//        while (idx < 10) {
//            if (bucket[idx].size() != 0) {
//                resultList.offer((int) bucket[idx].poll());
//                idx++;
//            }
//
//        }

    }

    public static void main(String[] args) {
        int [] list = {451, 753, 9, 1001};
        radixSort2(list);
        System.out.println(list);
    }
}
