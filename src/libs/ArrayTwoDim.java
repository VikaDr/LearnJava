package libs;

public class ArrayTwoDim {
    public static int[][] createMatrix (int i, int j) {
        int[][] arrayMas = new int[i][j];
        for (i = 0; i < arrayMas.length; i++) {
            for (j = 0; j < arrayMas.length; j++) {
                arrayMas[i][j]=5;
            }
        }
        printMatrix(arrayMas);
        return arrayMas;
    }

    public static int[][] arrayChange(int valueForChange, int[][] createMatrix) {
        if (createMatrix.length == createMatrix[1].length) {
            int n = 0;
            for (int k = 0; k < createMatrix.length; k++) {
                while (k == n) {
                    createMatrix[k][n] = valueForChange;
                    n++;
                }
            }
         printMatrix(createMatrix);
        }
        else {
            System.out.println("Error");
        }
        return createMatrix;
    }
    public static void printMatrix (int[][] matrixForPrint){

        for (int i = 0; i < matrixForPrint.length; i++) {
            for (int n = 0; n < matrixForPrint.length; n++) {
                System.out.print(matrixForPrint[i][n] + " ");
            }
            System.out.println();
        }
    }
}