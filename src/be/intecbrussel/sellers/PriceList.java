package be.intecbrussel.sellers;

import be.intecbrussel.eatable.Magnum;

public class PriceList {

    //variabele instellen
    private double ballPrice;
    private double rocketPrice;
    private double magnumStandardprice;
    //----------------------------------------------------------------
    //constructor
    public PriceList(){
this(1,1,1);
    }
    public PriceList(double ballPrice, double rocketPrice, double magnumStandardprice){
        this.ballPrice = ballPrice;
        this.rocketPrice = rocketPrice;
        this.magnumStandardprice = magnumStandardprice;


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
    //----------------------------------------------------------------------------

    public double getBallPrice() {
        return ballPrice;
    }

    public double getRocketPrice() {
        return rocketPrice;
    }
    //moet nog de setter voor magnum
    public double getMagnumPrice(Magnum.Magnumtype magnumtype){

        switch(magnumtype){
            case ALPINENUTS:
                return magnumStandardprice *1.5;
            case MILKCHOCOLATE:
                return magnumStandardprice *1.1;
            case BLACKCHOCOLATE:
                return magnumStandardprice *1.3;
            case WHITECHOCOLATE:
                return magnumStandardprice*1.2;
            case ROMANTICSTRAWBERRIES:
                return magnumStandardprice*1.4;

        }
        return magnumStandardprice;

    }

}
