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
    //Cone
    @Override
    public Cone[] orderCone(Cone[] Flovars) {
        return super.orderCone(Flovars);
    }
    public Cone[] prepareCone(Cone[] Flavors){
        return Flavors;
    }

    //-------------------------------------------------------------------------------
    //icerocket
    @Override
    public IceRocket orderIceRocket(IceRocket Icerocket) {
        return super.orderIceRocket(Icerocket);
    }
    public IceRocket prepareRocket(IceRocket prep){
        return prep;
    }

    //------------------------------------------------------------------
    //Magnum
    @Override
    public Magnum.Magnumtype orderMagnum(Magnum.Magnumtype type) {
        return super.orderMagnum(type);
    }
    public Magnum.Magnumtype prepareMagnum(Magnum.Magnumtype magnumtype){
        return magnumtype;
    }
    //---------------------------------------------------------------------------
    // Profit
    public double getProfit() {
        return profit;
    }
}
