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
        for (int k = 0; k < twoArray.length; k++) {
            for (int n = 0; n < twoArray.length; n++) {
                if (k==n){
                    System.out.print("test");
                }
                else {
                System.out.print("test");
            }
        }
        System.out.println("test13");

        return twoArray;
    }
        return twoArray;
    }
}
