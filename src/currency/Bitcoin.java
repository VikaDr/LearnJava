package currency;

public class Bitcoin extends Currency implements IsFreelyConver{
    public Bitcoin(double kursNBU, double rateBuy, double rateSell) {
        super(kursNBU, rateBuy, rateSell);

    }
    public double exchangeCurrencyToGrn(int bitcoin){
        System.out.println("Operacia zapreschena NBU");
        return bitcoin;
    }

    @Override
    public boolean getFreelyConv() {
        return false;
    }




}