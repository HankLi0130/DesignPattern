package method_factory;

import method_factory.product.Weapon;
import method_factory.product.kirin.KirinGreatSword;
import method_factory.product.rathalos.RathalosGreatSword;
import method_factory.product.teostra.TeostraGreatSword;

public class GreatSwordShop extends WeaponShop {

    @Override
    Weapon createWeapon(String name) {

        Weapon weapon = null;

        switch (name) {
            case "麒麟":
                weapon = new KirinGreatSword();
                break;
            case "火龍":
                weapon = new RathalosGreatSword();
                break;
            case "炎王龍":
                weapon = new TeostraGreatSword();
                break;
        }

        return weapon;
    }
}
