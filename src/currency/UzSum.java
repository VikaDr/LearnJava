package currency;

public class UzSum extends Currency implements IsFreelyConver{


    public UzSum(double kursNBU, double rateBuy, double rateSell) {
        super(kursNBU, rateBuy, rateSell);
    }

    @Override
    public boolean getFreelyConv() {
        return false;
    }
}
