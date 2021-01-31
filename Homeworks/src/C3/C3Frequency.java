package C3;

import java.util.Scanner;
import java.util.Arrays;
public class C3Frequency {
    public static final Scanner sc = new Scanner(System.in);

    public static String readMessageFromInput ( String message) {
        if (message == null) {
            System.out.println("Please insert the message");
        } else {
            System.out.println(message + " and press Enter.");
        }
        return sc.nextLine();
    }

    public static void maxFreq (String inputString) {
        int maxOcc = 0;
        int maxCurrent = 0;
        inputString = inputString.toLowerCase();

        for ( int i = 0; i < inputString.length(); i++) {
            maxCurrent = 1;
            if (Character.isWhitespace(inputString.charAt(i))) {
                continue;
            }
            for ( int j = i + 1; j < inputString.length(); j++) {
                if ( inputString.charAt(i) == inputString.charAt(j)) {
                    maxCurrent++;

                }
            }
            if (maxCurrent > maxOcc) {
                maxOcc = maxCurrent;
            }
        }

        for (int i = 0; i < inputString.length(); i++) {
            maxCurrent = 1;
            if (Character.isWhitespace(inputString.charAt(i))) {
                continue;
            }
            for ( int j = i + 1; j < inputString.length(); j++) {
                if ( inputString.charAt(i) == inputString.charAt(j)) {
                    maxCurrent++;

                }
            }
            if (maxCurrent == maxOcc) {
                System.out.println("Character " + inputString.charAt(i) + " appears " + maxOcc + " times.");
            }
        }
    }

    public static void minFreq (String inputString) {
        int minOcc = inputString.length();
        int minCurrent = 0;
        inputString = inputString.toLowerCase();

        for ( int i = 0; i < inputString.length(); i++) {
            minCurrent = 1;
            if (Character.isWhitespace(inputString.charAt(i)) || inputString.indexOf(inputString.charAt(i)) != i) {
                continue;
            }
            for ( int j = i + 1; j < inputString.length(); j++) {
                if ( inputString.charAt(i) == inputString.charAt(j)) {
                    minCurrent++;

                }
            }
            if (minCurrent < minOcc) {
                minOcc = minCurrent;
            }
        }

        for (int i = 0; i < inputString.length(); i++) {
            minCurrent = 1;
            if (Character.isWhitespace(inputString.charAt(i)) || inputString.indexOf(inputString.charAt(i)) != i) {
                continue;
            }
            for ( int j = i + 1; j < inputString.length(); j++) {
                if ( inputString.charAt(i) == inputString.charAt(j)) {
                    minCurrent++;

                }
            }
            if (minCurrent == minOcc) {
                System.out.println("Character " + inputString.charAt(i) + " appears " + minOcc + " times.");
            }
        }
    }


    public static void main(String[] args) {
        String quoteForMax = readMessageFromInput("Please insert the text for max frequency");
        String quoteForMin = readMessageFromInput("Please insert the text for min frequency");

        maxFreq(quoteForMax);
        minFreq(quoteForMin);

    }

}


