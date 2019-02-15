package method;

import product.Weapon;
import product.kirin.KirinLongSword;
import product.rathalos.RathalosLongSword;
import product.teostra.TeostraLongSword;

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
