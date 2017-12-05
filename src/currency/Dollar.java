package currency;

public class Dollar extends Currency implements IsFreelyConver{
    public Dollar(String nameOfCurrency, double kursNBU, double rateBuy, double rateSell) {
        super(nameOfCurrency, kursNBU, rateBuy, rateSell);
    }

    @Override
    public boolean getFreelyConv() {
        return true;
    }
}
