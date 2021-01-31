package C2;

public class C2ReverseNumberIterative {

    public static int reverseNumber(int number) {
        int reverse = 0;
        while (number > 0) {
            reverse = reverse * 10 + number % 10;
            number /= 10;
        }
        return reverse;
    }

    public static void main(String[] args) {

        System.out.println(reverseNumber(234));
    }
}
