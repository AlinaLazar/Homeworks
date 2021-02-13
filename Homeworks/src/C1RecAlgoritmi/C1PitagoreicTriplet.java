package C1;

import java.util.Scanner;
public class C1PitagoreicTriplet {
    public static final Scanner sc = new Scanner(System.in);

    public static int readNumberFromInput(String message) {
        if (message == null) {
            System.out.println("Please insert the upper limit");
        } else {
            System.out.println(message + " press Enter ");
        }
        return sc.nextInt();
    }

    public static void printPitagoreicTripletV1(int limit) { // varianta directa
        for (int i = 1; i <= limit; i++) {
            for (int j = i; j <= limit; j++) {
                for (int k = j; k <= limit; k++) {
                    if (i * i + j * j == k * k) {
                        System.out.println(i + " " + j + " " + k);
                    }
                }
            }
        }
    }

    public static void printPitagoreicTripletV2(int upper) { // varianta optimizata
        for (int i = 1; i <= upper; i++) {
            for (int j = i; j <= upper; j++) {
                int k2 = (i * i + j * j);
                int k = (int) Math.sqrt(k2);
                if (k * k == k2 && k <= upper) {
                    System.out.println(i + " " + j + " " + k);
                }
            }
        }
    }

    public static void main(String[] args) {
        long startTime = System.nanoTime();
        int limit = readNumberFromInput(null);
        printPitagoreicTripletV1(limit);
        long endTime = System.nanoTime();
        double duration = (endTime - startTime) / 1000_000d;
        System.out.println(duration);

        long startTime2 = System.nanoTime();
        int upper = readNumberFromInput(null);
        printPitagoreicTripletV2(upper);
        long endTime2 = System.nanoTime();
        double duration2 = (endTime2 - startTime2) / 1_000_000d;
        System.out.println(duration2);
    }
}
