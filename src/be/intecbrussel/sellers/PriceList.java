package be.intecbrussel.sellers;

public class PriceList {

    //variabele instellen
    private double ballPrice;
    private double rocketPrice;
    private double magnumStandardprice;
    //----------------------------------------------------------------
    //constructor
    public PriceList(){

    }
    public PriceList(double ballPrice, double rocketPrice, double magnumStandardprice){


    }
    //-----------------------------------------------------------------------------

    //methode instellen

    public void setBallPrice(double ballPrice){
        this.ballPrice = ballPrice;
    }

    public void setRocketPrice(double rocketPrice) {
        this.rocketPrice = rocketPrice;
    }

    public void setMagnumStandardprice(double magnumStandardprice) {
        this.magnumStandardprice = magnumStandardprice;
    }

    public double getBallPrice() {
        return ballPrice;
    }

    public double getRocketPrice() {
        return rocketPrice;
    }
    //moet nog de setter voor magnum

}
