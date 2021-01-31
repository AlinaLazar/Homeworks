package C2;

public class C2Array {
    public static void main(String[] args) {

        int[] array = {2, 10, 0, 11, 1, 5, 0, 3, 8};

        int backIterator = array.length - 1;
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] != 0) {
                array[backIterator] = array[i];
                backIterator--;
            }
        }
        while (backIterator >= 0) {
            array[backIterator] = 0;
            backIterator--;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
