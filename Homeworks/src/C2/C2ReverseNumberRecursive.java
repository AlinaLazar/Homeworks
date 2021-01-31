package C2;

public class C2ReverseNumberRecursive {
    public static int reverseNumber (int number) {

        if (number < 10) {
            return number;
        }

        String lastDigit = String.valueOf(number % 10);

        return Integer.parseInt(lastDigit + reverseNumber(number / 10));
    }

    public static void main(String[] args) {

        System.out.println(reverseNumber(321));

    }
}
