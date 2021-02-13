package C1;

import java.util.Scanner;
public class C1SumsOfPrimeNumbers {
    public static final Scanner sc = new Scanner(System.in);

    public static int readNumberFromInput ( String message) {
        if ( message == null ) {
            System.out.println("Please insert the number:");
        } else {
            System.out.println(message + "and press Enter! ");
        }
        return sc.nextInt();
    }


    public static boolean isPrime (int number) {
        if (number < 2) {
            return false;
        }

        for (int i = 2; i <= number/2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }


    public static void printPrimesSequences (int limit) {
        int sum = 0;
        for (int i = 2; i <= limit; i++) {

            if (isPrime(i)) {
                sum += i;
                if (sum <= limit) {
                    System.out.print(sum + " ");
                }else {
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        int limit = readNumberFromInput("Please insert the upper limit!");
        printPrimesSequences(limit);

    }
}
