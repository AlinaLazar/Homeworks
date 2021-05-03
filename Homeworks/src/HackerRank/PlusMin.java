package HackerRank;

import java.text.DecimalFormat;

public class PlusMin {

    static void plusMinus(int[] arr) {
        double countNegative = 0;
        double countPositive = 0;
        double countZeros = 0;

        for(int i : arr){
            if (i < 0){
                countNegative++;
            }
            if (i == 0){
                countZeros++;
            }
            if (i > 0){
                countPositive++;
            }
        }

        System.out.println((float)countNegative/arr.length);
        System.out.println((float)countPositive/arr.length);
        System.out.println((float)countZeros/arr.length);

    }

    public static void main(String[] args) {
        int [] arr = {-4, 3, -9, 0, 4, 1};
        plusMinus(arr);
    }
}
