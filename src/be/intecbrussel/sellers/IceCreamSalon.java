package be.intecbrussel.sellers;

import be.intecbrussel.eatable.Cone;
import be.intecbrussel.eatable.IceRocket;
import be.intecbrussel.eatable.Magnum;

public class IceCreamSalon implements IceCreamSeller{

    private PriceList priceList;
    private double totalProfit;
    //--------------------------------------------------------------
    //constructor
    public IceCreamSalon(){

    }
    public IceCreamSalon(PriceList priceList){
        this.priceList = priceList;
    }
    //-----------------------------------------------------------------

    //questions; is getProfit or getTotalProfit
    @Override

    public double getProfit() {
        return totalProfit;
    }

    @Override
    public Cone[] orderCone(Cone[] Flovars) {
        return new Cone[0];
    }

    @Override
    public IceRocket orderIceRocket(IceRocket Icerocket) {
        return null;
    }

    @Override
    public Cone orderCone(Cone.Flavors[] flavors) {
        totalProfit = totalProfit + priceList.getBallPrice() * flavors.length;
        return new Cone(flavors);
    }


    @Override
    public IceRocket orderIceRocket() {
        totalProfit = totalProfit + priceList.getRocketPrice();
        return new IceRocket();
    }

    @Override
    public Magnum orderMagnum(Magnum.Magnumtype type) {
        totalProfit = totalProfit + priceList.getMagnumPrice(type);
        return new Magnum(type);
    }

    @Override
    public String toString() {
        return "IceCreamSalon{" +
                "priceList=" + priceList +
                ", totalProfit=" + totalProfit +
                '}';
    }
}
