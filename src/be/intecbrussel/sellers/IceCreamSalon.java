package be.intecbrussel.sellers;

import be.intecbrussel.eatable.Cone;
import be.intecbrussel.eatable.IceRocket;
import be.intecbrussel.eatable.Magnum;

public class IceCreamSalon extends IceCreamSeller{

    private PriceList priceList;
    private double totalProfit;
    //--------------------------------------------------------------

    //questions; is getProfit or getTotalProfit
    public double getTotalProfit() {
        return totalProfit;
    }

    @Override
    public Cone[] orderCone(Cone[] Flovars) {
        return super.orderCone(Flovars);
    }

    @Override
    public IceRocket orderIceRocket(IceRocket Icerocket) {
        return super.orderIceRocket(Icerocket);
    }

    @Override
    public Magnum.Magnumtype orderMagnum(Magnum.Magnumtype type) {
        return super.orderMagnum(type);
    }

    @Override
    public String toString() {
        return "IceCreamSalon{" +
                "priceList=" + priceList +
                ", totalProfit=" + totalProfit +
                '}';
    }
}
