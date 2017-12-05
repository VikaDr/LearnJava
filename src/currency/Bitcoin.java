package currency;

public class Bitcoin extends Currency{
    public Bitcoin(String nameOfCurrency, double kursNBU, double rateBuy, double rateSell) {
        super(nameOfCurrency, kursNBU, rateBuy, rateSell);
    }

    public double exchangeCurrencyToGrn(int numberOfCurrency){
        System.out.println("Operacia zapreschena NBU");
        return numberOfCurrency;
    }
}
