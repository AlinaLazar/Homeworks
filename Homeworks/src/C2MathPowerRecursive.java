public class C2MathPowerRecursive {

    public static int mathPower(int x, int y){
        if (y == 0){
            return 1;
        }
        return x * mathPower(x,y-1);
    }
    public static void main(String[] args) {

        System.out.println(mathPower(2,3));

    }

}
