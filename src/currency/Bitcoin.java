package currency;

public class Bitcoin extends Currency implements IsFreelyConver{
    public Bitcoin(double kursNBU, double rateBuy, double rateSell) {
        super(kursNBU, rateBuy, rateSell);

    }

    @Override
    public boolean getFreelyConv() {
        return false;
    }




}
