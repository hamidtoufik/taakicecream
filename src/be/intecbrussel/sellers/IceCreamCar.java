package be.intecbrussel.sellers;

import be.intecbrussel.eatable.Cone;
import be.intecbrussel.eatable.IceRocket;
import be.intecbrussel.eatable.Magnum;

public class IceCreamCar implements IceCreamSeller {

    //-------------------------------------------------------
    private PriceList pricelist;
    private Stock stock;
    private double profit;
    //-------------------------------------------------------
    //constructor
    public IceCreamCar(){
        new PriceList();
        new Stock();
    }
    public IceCreamCar(PriceList priceList, Stock stock){
        this.pricelist = priceList;
        this.stock = stock;
    }
    //---------------------------------------------------------------------------

    //Cone
    @Override //moet nog exception
    public Cone orderCone(Cone.Flavors[] flavors) {
        return prepareCone(flavors);
    }

    @Override
    public double getProfit() {
        return 0;
    }

    @Override
    public Cone[] orderCone(Cone[] Flovars) {
        return new Cone[0];
    }

    @Override
    public IceRocket orderIceRocket(IceRocket Icerocket) {
        return null;
    }

    private Cone prepareCone(Cone.Flavors[] flavors) {
        if (stock.getCones() > 0) {
            if (stock.getBalls() >= flavors.length) {
                profit += pricelist.getBallPrice() * flavors.length;
                stock.setBalls(stock.getBalls() - flavors.length);
                return new Cone(flavors);
            }

        }


        //-------------------------------------------------------------------------------
        //icerocket
        public IceRocket orderIceRocket() {
            return prepareIceRocktes();
        }
        private IceRocket prepareRocket () {
            if (stock.getIceRockets() > 0) {

                profit += pricelist.getRocketPrice() * flavors.length;
                stock.setIceRockets(stock.getIceRockets() - 1);
                return new IceRocket();
            }
        }

        //------------------------------------------------------------------
        //Magnum

        public Magnum orderMagnum(Magnum.Magnumtype type){
            return prepareMagnum(type);
        }
        private Magnum prepareMagnum(Magnum.Magnumtype magnumtype){
            if (stock.getMagnum() > 0) {

                profit += pricelist.getMagnumPrice() * flavors.length;
                stock.setMagnum(stock.getMagnum() - 1);
                return new Magnum(type);
            }
        }
        //---------------------------------------------------------------------------
        // Profit

        public double getProfit() {
            return profit;
        }
    }}
