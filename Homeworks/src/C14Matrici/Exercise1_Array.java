package C14Matrici;
import java.util.Scanner;

public class Exercise1_Array {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introdu dimensiunea matricei:");
        int matrixDimension = sc.nextInt();
        int[][] matrix = new int[matrixDimension][matrixDimension];

        System.out.println("Introdu valoarea elementelor de pe diagonala principala:");
        int mainDiagValue = sc.nextInt();

        System.out.println("Introdu valoarea elementelor de pe diagonala secundara:");
        int sndDiagValue = sc.nextInt();

        System.out.println("Introdu valoarea elementului de pe pozitia din centru a matricei.");
        int centerValue = sc.nextInt();

        System.out.println("Introdu valoarea elementelor din „stanga“: cele aflate sub diagonala principala si " +
                "deasupra diagonalei secundare.");
        int leftValue = sc.nextInt();

        System.out.println("Introdu valoarea elementelor din „partea de sus“: cele aflate deasupra diagonalei " +
                "principale si deasupra diagonalei secundare.");
        int upValue = sc.nextInt();

        System.out.println("Introdu valoarea elementelor din „dreapta“: cele aflate deasupra diagonalei " +
                "principale si sub diagonala secundara");
        int rightValue = sc.nextInt();

        System.out.println("Introdu valoarea elementelor din „partea de jos“: cele aflate sub diagonala principala si " +
                "sub diagonala secundara.");
        int bottomValue = sc.nextInt();


        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++){
                if(i == j){
                    matrix[i][j] = mainDiagValue;
                } else if (i + j == (matrixDimension - 1)){
                    matrix[i][j] = sndDiagValue;
                } else if ( matrixDimension % 2 != 0 ){
                    matrix[matrixDimension/2][matrixDimension/2] = centerValue;
                }
                if ((i > j) && (i + j < matrixDimension - 1)){
                    matrix[i][j] = leftValue;
                } else if ( (i < j) && (i + j < matrixDimension - 1)){
                    matrix[i][j] = upValue;
                } else if ((i < j) && (i + j > matrixDimension - 1)){
                    matrix[i][j] = rightValue;
                } else if ((i > j) && (i + j > matrixDimension - 1)){
                    matrix[i][j] = bottomValue;
                }
            }
        }
        for (int i = 0 ; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }



    }
}
