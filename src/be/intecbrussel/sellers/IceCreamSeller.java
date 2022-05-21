package be.intecbrussel.sellers;

import be.intecbrussel.eatable.Cone;
import be.intecbrussel.eatable.IceRocket;
import be.intecbrussel.eatable.Magnum;

public interface IceCreamSeller extends Profitable{

default Cone orderCone(Cone.Flavors[] flavors){
    return new Cone(flavors);
}



    default  IceRocket orderIceRocket(){
    return new IceRocket();
}

    //questions; is getProfit or getTotalProfit
    double getProfit();

    Cone[] orderCone(Cone[] Flovars);

    IceRocket orderIceRocket(IceRocket Icerocket);

    default Magnum orderMagnum(Magnum.Magnumtype type){
   return new Magnum(type);
}
}
