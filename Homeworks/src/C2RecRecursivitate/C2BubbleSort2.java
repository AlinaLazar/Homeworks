package C2;

public class C2BubbleSort2 {
    public static void main(String[] args) {
        double [] array = {3.2, -1.0, 0.7, 5.9, 2.1};
        bubbleSortDescending(array);
    }

    public static void bubbleSortDescending (double [] array) {
        double [] bubbleSort = new double [array.length];

        boolean sort = false;
        do {
            sort = false;
            for (int j = 1; j < bubbleSort.length; j++) {
                if (array[j] < array[j-1]) {
                    double aux = array [j];
                    array[j] = array[j-1];
                    array[j-1] = aux;
                    sort = true;
                }
            }

        }while(sort);

        for (int i = 0; i < bubbleSort.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println( );
    }
}
