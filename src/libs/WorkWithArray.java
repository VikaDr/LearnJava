package libs;

public class WorkWithArray {
    public void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) { // начнем с и=0, проверям что 0 меньше длины массива и к и добавляем 1
            System.out.print(array[i] + " ");
        }
        System.out.println("");
    }
    public void comparisonArrayWithValue(int valueForComparison, int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i]<valueForComparison){
                System.out.println(array[i]+ " less than " +valueForComparison);
            }else if (array[i]==valueForComparison){
                System.out.println(array[i]+ " equals " +valueForComparison);
            }
            else {
                System.out.println(array[i]+ " more than " +valueForComparison);
            }
        }
    }

}
