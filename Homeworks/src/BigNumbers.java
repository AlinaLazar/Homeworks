public class BigNumbers {
    public int[] sum(int[] op1, int[] op2) {
        int maxLength = Math.max(op1.length, op2.length);
        int[] reverseOp1 = reverseArray(op1,maxLength);
        int[] reverseOp2 = reverseArray(op2,maxLength);

        int[] resultSumReversed = new int[maxLength];

        int smth = 0;

        for(int i = 0 ; i < maxLength ; i++) {
            resultSumReversed[i] = reverseOp1[i] + reverseOp2[i] + smth;
            smth = 0;
            if(resultSumReversed[i] > 9) {
                resultSumReversed[i] = resultSumReversed[i] % 10;
                smth++;
            }
        }
        int[] resultfinal = reverseArray(resultSumReversed,resultSumReversed.length);

        return resultfinal;
    }


    public static void main(String[] args) {
        int noTests = 6;

        int[][] op1 = {{0}, {9, 9}, {9}, {2, 1, 7, 8},
                {5, 0, 5, 0, 5}, {1, 0, 8, 6, 7, 8, 9, 4, 2, 3, 4}};
        int[][] op2 = {{1, 0, 1}, {1}, {9, 9, 9, 9}, {5, 9, 6},
                {5, 5, 0, 5, 0}, {3, 4, 2, 8, 9, 7, 9, 2, 3, 4, 9}};
        int[][] correct = {{1, 0, 1}, {1, 0, 0}, {1, 0, 0, 0, 8}, {2, 7, 7, 4},
                {1, 0, 5, 5, 5, 5}, {4, 5, 1, 5, 7, 6, 8, 6, 5, 8, 3}};

        int total = 0;
        for (int i = 0; i < noTests; i++) {
            System.out.println("Test " + (i+1) + ":");
            String op1S = noToString(op1[i]);
            String op2S = noToString(op2[i]);

            BigNumbers bn = new BigNumbers();
            int[] rez = bn.sum(op1[i], op2[i]);

            String rezS = noToString(rez);
            String correctS = noToString(correct[i]);
            System.out.println(op1S + " + " + op2S + " = " + rezS + " C: " + correctS +
                    "......" + (rezS.equals(correctS) ? "OK" : "WRONG"));
            System.out.println();

            total += rezS.equals(correctS) ? 1 : 0;
        }

        System.out.println("Your total score is: " + total + " / " + noTests);
        System.out.println(total > 3 ? "You passed! Hurray! :)" : "Sorry.. :(");
    }

    private static String noToString(int[] no) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < no.length; i++) {
            sb.append(no[i]);
        }
        return sb.toString();
    }

    public int[] reverseArray(int[] array, int maxLength) {
        int[] aux = new int[maxLength];
        int smth = array.length;
        for (int i = 0; i < array.length; i++) {
            aux[smth - 1] = array[i];
            smth -= 1;
        }
        return aux;
    }

}
