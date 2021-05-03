package HackerRank;

import java.util.*;

public class BirthdayCakeCandles {
    public static int birthdayCakeCandles(List<Integer> candles) {

        int max = candles.get(0);
        int count = 0;

        for(int i : candles){
            if(i >= max){
                max = i;
            }
        }

        for(int j : candles){
            if(j == max) {
                count++;
            }
        }
        return count;

    }

    public static void main(String[] args) {
        int [] arr = {44, 53, 31, 27, 77, 60, 66, 77, 26, 36};
        List<Integer> list = new ArrayList<>();
        for(int i : arr){
            list.add(i);
        }

        System.out.println(birthdayCakeCandles(list));
    }
}
