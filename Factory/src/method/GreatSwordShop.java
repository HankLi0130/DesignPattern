package method;

import product.Weapon;
import product.kirin.KirinGreatSword;
import product.rathalos.RathalosGreatSword;
import product.teostra.TeostraGreatSword;

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
