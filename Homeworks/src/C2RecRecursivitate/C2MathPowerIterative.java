package C2;

public class C2MathPowerIterative {

    public static int mathPower (int x, int y){
        if (y < 0){
            System.out.println("the exponent must be positive");
        }
        int result = 1;

        for (int i = 0; i < y; i++){
            result *= x;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(mathPower(2,3));
    }
}
