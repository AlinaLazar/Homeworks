package C19LambdaExpresion;

public class Exercises {
    public static void main(String[] args) {
        IOperator adunare = (a,b) -> a + b;
        IOperator scadere = (a, b) -> a - b;
        IOperator inmultire = (a, b) -> a * b;
        IOperator impartire = (a, b) -> a/b;

        System.out.println(adunare.operation(2,3));
        System.out.println(scadere.operation(2,3));
        System.out.println(inmultire.operation(2,3));
        System.out.println(impartire.operation(2,3));

        IVerifyProperty isEven = x -> {
            return (x % 2 == 0);

        };

        IVerifyProperty isNegative = x ->{
            return ( x < 0);
        };

        IVerifyProperty isZero = x -> {
            return ( x == 0);
        };

        System.out.println(isEven.verify(4));
        System.out.println(isNegative.verify(-6));
        System.out.println(isZero.verify(10));
    }
}
