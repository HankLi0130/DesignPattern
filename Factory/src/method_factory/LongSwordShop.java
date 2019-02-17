package method_factory;

import method_factory.product.Weapon;
import method_factory.product.kirin.KirinLongSword;
import method_factory.product.rathalos.RathalosLongSword;
import method_factory.product.teostra.TeostraLongSword;

public class LongSwordShop extends WeaponShop {

    @Override
    Weapon createWeapon(String name) {

        Weapon weapon = null;

        switch (name) {
            case "麒麟":
                weapon = new KirinLongSword();
                break;
            case "火龍":
                weapon = new RathalosLongSword();
                break;
            case "炎王龍":
                weapon = new TeostraLongSword();
                break;
        }

        return weapon;
    }
}
