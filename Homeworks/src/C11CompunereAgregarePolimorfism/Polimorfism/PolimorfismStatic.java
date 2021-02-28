package C11CompunereAgregarePolimorfism.Polimorfism;

public class PolimorfismStatic {
    public static void main(String[] args) {
        printValue("25");
        printValue(34);
        printValue(12.34);
        printValue(1+2 == 3);
    }

    public static void printValue (String string){
        System.out.println(string);
    }

    public static void printValue (int number){
        System.out.println(number);
    }

    public static void printValue(double doubleNumber){
        System.out.println(doubleNumber);
    }

    public static void printValue (boolean booleanValue){
        System.out.println(booleanValue);
    }

}
