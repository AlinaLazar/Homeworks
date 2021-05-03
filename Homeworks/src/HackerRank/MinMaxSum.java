package HackerRank;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class MinMaxSum {
    static void miniMaxSum(int[] arr) {
        List<Integer> list = new ArrayList<>();
        for(int i : arr){
            list.add(i);
        }
        Collections.sort(list);
        long minSum = 0;
        long maxSum = 0;
        for (int i = 1; i < list.size(); i++){
            maxSum += list.get(i);
        }
        for(int i= 0; i < list.size()-1; i++){
            minSum += list.get(i);
        }
        System.out.println((long)minSum + " "+ (long)maxSum);
    }

    public static void main(String[] args) {
        int [] arr = {942381765, 627450398, 954173620, 583762094, 236817490};
        miniMaxSum(arr);
    }
}
