package libs;

public class ArrayTwoDim {
    public static int[][] twoArray(int i, int j) {
        int[][] arrayMas = new int[i][j];
        for (i = 0; i < arrayMas.length; i++) {
            for (j = 0; j < arrayMas.length; j++) {
                System.out.print((arrayMas[i][j]=5) + " ");
            }
            System.out.println();
        }
        return arrayMas;
    }

    public static int[][] arrayChange(int valueForChange, int[][] twoArray) {
        for (int i = 0; i < twoArray.length; i++) {



        }
        System.out.println();
        return twoArray;
    }
  }
