package libs;

public class LibClass {
    public static void sum(int var11, int var12) {
        System.out.println("Sum Int: " + (var11 + var12));
    }

    public static void sum(String var13, String var14) {
        System.out.println("Sum String: " + (var13 + var14));
    }

    public static void sum(String var15, int var16) {
        System.out.println("Sum StringInt: " + (var15 + var16));
    }

    public static int sum(int varInteger, String varString) {
        int tempResult;
        try {
            tempResult = varInteger + Integer.parseInt(varString);//"798" -> 789  "7a89"
            return tempResult;
        } catch (NumberFormatException e) {
            System.out.print("Error: ");
            return 88888;
        } catch (Exception e){
            System.out.print("Error: ");
            return 99999;
        }
    }

    public void multiplication(int mnojitel_1, int mnojitel_2){
        System.out.println(mnojitel_1 * mnojitel_2);
    }

    public static void multiplication2(int var17, int var18) {
        System.out.println(var17 * var18);
    }

    public static int division(int var19, int var20) {
        int intResult;
        try{
            intResult = var19 / var20;
            return intResult;
        } catch (ArithmeticException e) {
            System.out.print("Division Error: " );
            return var19;
        } catch (Exception e) {
            System.out.print("Division Error: " );
            return var19;
        }

    }

    public void division(int del1, double del2 ){
        System.out.println(del1/del2);
    }

    public static double division(double var21, double var22){
        try {
            System.out.println(var21 / var22);
            return 0;
        }catch (Exception e) {
            System.out.println("Error" + e);
            return 0;
        }
    }

    /**
     *
     * @param var1
     * @param var2
     * @return
     * @throws ArithmeticException
     */
    public byte div (byte var1, byte var2) throws ArithmeticException {
        return (byte) (var1/var2);
    }

}
