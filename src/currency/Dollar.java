package currency;

public class Dollar extends Currency implements IsFreelyConver{

    public Dollar(double kursNBU, double rateBuy, double rateSell) {
        super(kursNBU, rateBuy, rateSell);     //передает курс в конструктор родитель
    }


    @Override
    public boolean getFreelyConv() {
        return true;
    }
}
