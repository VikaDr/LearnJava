package currency;

public class Bitcoin extends Currency{
    public Bitcoin(double kursNBU, double rateBuy, double rateSell) {
        super(kursNBU, rateBuy, rateSell);

    }
    public double exchangeCurrencyToGrn(int numberOfCurrency){
        System.out.println("Operacia zapreschena NBU");
        return numberOfCurrency;
    }
}
