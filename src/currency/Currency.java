package currency;

abstract public class Currency {
    double kursNBU;
    double rateSell, rateBuy;
    double kursSell, kursBuy;

    public Currency(double kursNBU, double rateBuy, double rateSell){
        this.kursNBU = kursNBU; //возьми переменную этого класса и запиши в нее то что придет извне (с конструктора)
        this.rateBuy = rateBuy;
        this.rateSell = rateSell;
        kursBuy = kursNBU * rateBuy;
        kursSell = kursNBU * rateSell;
    }

    public double getKursNBU() {
        return kursNBU;
    }

    public void setKursNBU(double kursNBU) {
        this.kursNBU = kursNBU;
        updateKursSellAndBuy();
    }


    public double getRateSell() {
        return rateSell;
    }

    public void setRateSell(double rateSell) {
        this.rateSell = rateSell;
        updateKursSellAndBuy();
    }

    public double getRateBuy() {
        return rateBuy;
    }

    public void setRateBuy(double rateBuy) {
        this.rateBuy = rateBuy;
        updateKursSellAndBuy();
    }

    public double getKursSell() {
        return kursSell;
    }

    public double getKursBuy() {
        return kursBuy;
    }

    public double exchangeGrnToCurrency(int grn){
        double tempResult = grn / kursBuy;
        System.out.println("Kurs " + kursBuy + " For " + grn + " you get " + tempResult);
        return tempResult;
    }

    public double exchangeCurrencyToGrn (int currency){
        double tempResult2 = currency * kursSell;
        System.out.println("Kurs " + kursSell +  " For " + currency + " you get " + tempResult2);
        return tempResult2;

    }

    private void updateKursSellAndBuy(){
        kursBuy = kursNBU * rateBuy;
        kursSell = kursNBU * rateSell;

    }
}