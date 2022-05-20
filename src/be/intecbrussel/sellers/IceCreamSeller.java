package be.intecbrussel.sellers;

import be.intecbrussel.eatable.Cone;
import be.intecbrussel.eatable.IceRocket;
import be.intecbrussel.eatable.Magnum;

public interface IceCreamSeller extends Profitable{

    orderCone(Cone[] Flovars);

    public IceRocket orderIceRocket(IceRocket Icerocket);

    Magnum orderMagnum( Magnum.MagnumType type);

}
