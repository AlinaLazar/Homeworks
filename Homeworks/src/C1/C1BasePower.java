package C1;

import java.util.Scanner;
public class C1BasePower {

    private static final Scanner sc = new Scanner(System.in);

    public static int readMessageFromInput (String message) {
        if (message == null){
            System.out.println("Please insert the number");
        }else{
            System.out.println(message + " and press enter!");
        }
        return sc.nextInt();
    }

    public static void basePower (int base, int exponent){
        if (exponent < 0){
            System.out.println("The exponent must be positive");
            return;
        }
        int ctrResult = 1;
        for (int ctrPower = 0; ctrPower <= exponent; ctrPower++){
            System.out.print(ctrResult + " ");
            ctrResult *= base;
        }

    }
    public static void main(String[] args) {
    int base = readMessageFromInput("Please insert the base");
    int exponent = readMessageFromInput("Please insert the exponent");

    basePower(base,exponent);

    }
}
