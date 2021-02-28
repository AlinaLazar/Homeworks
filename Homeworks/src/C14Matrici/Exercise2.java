package C14Matrici;

public class Exercise2 {

        public static int[][] adunare(int[][] matrixA, int[][] matrixB){
            int[][] resultMatrix = new int[matrixA.length][matrixA.length];
            if (matrixA.length != matrixB.length) {
                System.out.println("Matricile au dimensiuni diferite. Adunarea nu se poate realiza.");
            } else {
                for (int i = 0; i < matrixA.length; i++) {
                    for(int j = 0; j < matrixA.length; j++) {
                        resultMatrix[i][j] = matrixA[i][j] + matrixB[i][j] ;
                    }
                }
            }
            return resultMatrix;
        }

        public static int[][] scadere (int[][] matrixA, int[][] matrixB) {
            int[][] resultMatrix = new int[matrixA.length][matrixA.length];
            if (matrixA.length != matrixB.length) {
                System.out.println("Matricile au dimensiuni diferite. Scaderea nu se poate realiza.");
            } else {
                for (int i = 0; i < matrixA.length; i++) {
                    for(int j = 0; j < matrixA.length; j++) {
                        resultMatrix[i][j] = matrixA[i][j] - matrixB[i][j];
                    }
                }
            }
            return resultMatrix;
        }

        public static int[][] inmultireScalar (int[][] matrixA, int scalar) {
            int[][] resultMatrix = new int[matrixA.length][matrixA.length];
            for (int i = 0; i < matrixA.length; i++) {
                for(int j = 0; j < matrixA.length; j++) {
                    resultMatrix[i][j] = matrixA[i][j] * scalar;
                }
            }
            return resultMatrix;
        }

        public static int[][] inmultireMatrici(int[][] matrixA, int[][] matrixB) {
            int aRows = matrixA.length;
            int aColumns = matrixA[0].length;
            int bRows = matrixB.length;
            int bColumns = matrixB[0].length;

            int[][] resultMatrix = new int[aRows][bColumns];

            if (aColumns != bRows) {
                System.out.println("Nr randuri matrice A != nr coloane matrice B. Inmultirea nu se poate realiza.");
            } else {
                for (int i = 0; i < aRows; i++) {
                    for(int j = 0; j < bColumns ; j++) {
                        for (int k = 0; k < aColumns; k++)
                        {
                            resultMatrix[i][j] += matrixA[i][k]* matrixB[k][j];
                        }
                    }
                }
            }
            return resultMatrix;
        }

    public static void main(String[] args) {
        int dimension = 3;
        int[][] matrixA = new int[dimension][dimension];
        int[][] matrixB = new int[dimension][dimension];
        int[][] matrixD = new int [2][2];

        matrixA[0][0] = 2;
        matrixA[0][1] = 3;
        matrixA[0][2] = 0;
        matrixA[1][0] = 6;
        matrixA[1][1] = 1;
        matrixA[1][2] = 0;
        matrixA[2][0] = 5;
        matrixA[2][1] = 1;
        matrixA[2][2] = 0;

        matrixB[0][0] = 4;
        matrixB[0][1] = 3;
        matrixB[0][2] = 0;
        matrixB[1][0] = 5;
        matrixB[1][1] = 5;
        matrixB[1][2] = 1;
        matrixB[2][0] = 3;
        matrixB[2][1] = 4;
        matrixB[2][2] = 5;

        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixA[i].length; j++) {
                System.out.print(matrixA[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < matrixB.length; i++) {
            for (int j = 0; j < matrixB[i].length; j++) {
                System.out.print(matrixB[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();



        //adunarea
        int[][] matrixC = new int[dimension][dimension];

        matrixC = adunare(matrixA,matrixB);
        System.out.println();

        matrixC = adunare(matrixA,matrixD);

        for (int i = 0; i < matrixC.length; i++) {
            for (int j = 0; j < matrixC[i].length; j++) {
                System.out.print(matrixC[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();



        //scaderea

        matrixC = scadere(matrixA,matrixB);
        System.out.println();

        matrixC = adunare(matrixA,matrixD);

        for (int i = 0; i < matrixC.length; i++) {
            for (int j = 0; j < matrixC[i].length; j++) {
                System.out.print(matrixC[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();



        //inmultirea cu un scalar

        matrixC = inmultireScalar(matrixA,3);

        for (int i = 0; i < matrixC.length; i++) {
            for (int j = 0; j < matrixC[i].length; j++) {
                System.out.print(matrixC[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();


        //inmultirea a doua matrici ( matrixA * matrixB = matrixC);


        matrixC = inmultireMatrici(matrixA,matrixD);
        System.out.println();

        matrixC = inmultireMatrici(matrixA,matrixB);

        for (int i = 0; i < matrixC.length; i++) {
            for (int j = 0; j < matrixC[i].length; j++) {
                System.out.print(matrixC[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }
}
