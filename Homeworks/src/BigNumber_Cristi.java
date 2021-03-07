import java.util.Arrays;
public class BigNumber_Cristi {

    public static void main(String[] args) {
        int[] op1 = {2, 1, 7, 8};
        int[] op2 = {5, 9, 6};
        System.out.println(noToString(sum(op1, op2)));
    }

    public static int[] sum(int[] op1, int[] op2) {
        int maxL = Math.max(op1.length, op2.length) + 1;
        int[] rez = new int[maxL];
        int offset = 0;
        if (op1.length >= op2.length) {
            offset = sumHelper(rez, op1, op2);
        } else {
            offset = sumHelper(rez, op2, op1);
        }
        //return rez;
        return Arrays.copyOfRange(rez, offset, rez.length);
    }

    private static int sumHelper(int[] response, int[] longer, int[] shorter) {
        int overflow = 0;
        int longerIndex = longer.length - 1;
        int shorterIndex = shorter.length - 1;
        int responseIndex = response.length - 1;

        while (shorterIndex >= 0) {
            int sum = shorter[shorterIndex] + longer[longerIndex] + overflow;
            response[responseIndex] = sum % 10;
            overflow = sum / 10;
            longerIndex -= 1;
            responseIndex -= 1;
            shorterIndex -= 1;
        }

        while (longerIndex >= 0) {
            response[responseIndex] = (longer[longerIndex] + overflow) % 10;
            overflow = (longer[longerIndex] + overflow) / 10;
            responseIndex -= 1;
            longerIndex -= 1;
        }

        if (overflow != 0) {
            response[responseIndex] = overflow;
            responseIndex -= 1;
        }
        return responseIndex + 1;
    }

    private static String noToString(int[] no) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < no.length; i++) {
            sb.append(no[i]);
        }
        return sb.toString();
    }
}
