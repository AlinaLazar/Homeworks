import java.util.Scanner;
public class C1ComplementaryNumber {

    private static final Scanner sc = new Scanner(System.in);

    public static int readMessageFromInput (String message) {
        if (message == null){
            System.out.println("Please insert the number");
        }else{
            System.out.println(message + " and press enter!");
        }
        return sc.nextInt();
    }

    public static int complementaryNumber (int number){
        int auxNumber = 1;
        while (auxNumber < number){
            auxNumber *= 10;
        }
        return (auxNumber - number);
    }

    public static void main (String [] args) {
        int number = readMessageFromInput(null);
        System.out.println(complementaryNumber(number));

    }
}
