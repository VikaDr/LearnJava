package currency;

public class UzSum extends Currency implements IsFreelyConver{
    public UzSum(String nameOfCurrency, double kursNBU, double rateBuy, double rateSell) {
        super(nameOfCurrency, kursNBU, rateBuy, rateSell);
    }

    @Override
    public boolean getFreelyConv() {
        return false;
    }
}
