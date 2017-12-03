package currency;

public class Euro extends Currency implements IsFreelyConver{


    public Euro(double kursNBU, double rateBuy, double rateSell) {
        super(kursNBU, rateBuy, rateSell);
    }

    @Override
    public boolean getFreelyConv() {
        return true;
    }
}
