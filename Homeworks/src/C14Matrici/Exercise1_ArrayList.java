package C14Matrici;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise1_ArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introdu dimensiunea matricei:");
        int matrixDimension = sc.nextInt();
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<ArrayList<Integer>>(matrixDimension);
        for (int i = 0 ; i < matrixDimension; i++){
            ArrayList<Integer> newRow = new ArrayList<>(matrixDimension);
            for ( int j = 0; j < matrixDimension; j++){
                newRow.add(0);
            }
            matrix.add(newRow);
        }

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

        for (int i = 0; i < matrix.size(); i++) {
            for (int j = 0; j < matrix.get(i).size(); j++){
                if(i == j){
                    matrix.get(i).set(j,mainDiagValue);
                } else if (i + j == (matrixDimension - 1)){
                    matrix.get(i).set(j,sndDiagValue);
                } else if ( matrixDimension % 2 != 0 ){
                    matrix.get(matrixDimension/2).set(matrixDimension/2, centerValue);
                }
                if ((i > j) && (i + j < matrixDimension - 1)){
                    matrix.get(i).set(j, leftValue);
                } else if ( (i < j) && (i + j < matrixDimension - 1)){
                    matrix.get(i).set(j, upValue);
                } else if ((i < j) && (i + j > matrixDimension - 1)){
                    matrix.get(i).set(j, rightValue);
                } else if ((i > j) && (i + j > matrixDimension - 1)){
                    matrix.get(i).set(j, bottomValue);
                }
            }
        }

        for (int i = 0; i <matrix.size(); i++){
            for (int j = 0; j <matrix.get(i).size(); j++){
                System.out.print(matrix.get(i).get(j) + "\t");
            }
            System.out.println();
        }
    }
}
