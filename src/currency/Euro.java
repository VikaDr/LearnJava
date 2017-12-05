package currency;

public class Euro extends Currency implements IsFreelyConver{
    public Euro(String nameOfCurrency, double kursNBU, double rateBuy, double rateSell) {
        super(nameOfCurrency, kursNBU, rateBuy, rateSell);
    }

    @Override
    public boolean getFreelyConv() {
        return true;
    }
}
