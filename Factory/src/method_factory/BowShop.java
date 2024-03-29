package method_factory;

import method_factory.product.Weapon;
import method_factory.product.kirin.KirinBow;
import method_factory.product.rathalos.RathalosBow;
import method_factory.product.teostra.TeostraBow;

public class BowShop extends WeaponShop {

    @Override
    Weapon createWeapon(String name) {

        Weapon weapon = null;

        switch (name) {
            case "麒麟":
                weapon = new KirinBow();
                break;
            case "火龍":
                weapon = new RathalosBow();
                break;
            case "炎王龍":
                weapon = new TeostraBow();
                break;
        }

        return weapon;
    }
}
