public class C1MultipleOf5 {
        public static int getMultipleOf5Lower(int number) { // returneaza cel mai mare multiplu de 5, mai mic sau egal cu n
            return number - number % 5;
        }

        public static int getMultipleOf5Upper(int number) { // returneaza cel mai mic multiplu de 5, mai mare sau egal cu n
            return number / 5 * 5 + (number % 5 == 0 ? 0 : 5);
        }

    public static void main(String[] args) {
        System.out.println(getMultipleOf5Lower(2));
        System.out.println(getMultipleOf5Lower(20));
        System.out.println(getMultipleOf5Lower(18));
        System.out.println( getMultipleOf5Lower(1));

        System.out.println(getMultipleOf5Upper(2));
        System.out.println(getMultipleOf5Upper(20));
        System.out.println(getMultipleOf5Upper(18));
        System.out.println(  getMultipleOf5Upper(1));


    }
}
