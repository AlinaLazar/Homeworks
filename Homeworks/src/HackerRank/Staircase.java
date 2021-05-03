package HackerRank;

public class Staircase {
    static void staircase(int n) {
            int s = n-1;
            int h = 1;
            while (n != 0) {
                for (int i = 0; i < s; i++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < h; j++) {
                    System.out.print("#");
                }
                System.out.println();
                h++;
                s--;
                n--;
            }
        }



    public static void main(String[] args) {
        int n = 4;
        staircase(n);
    }
}
