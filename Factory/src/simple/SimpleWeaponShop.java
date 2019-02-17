package simple;

import method_factory.product.Bow;
import method_factory.product.GreatSword;
import method_factory.product.LongSword;
import method_factory.product.Weapon;

public class SimpleWeaponShop {

    // 外部使用
    public static Weapon getWeapon(String type) {

        Weapon weapon = null;

        switch (type) {
            case "大劍":
                weapon = new GreatSword();
                break;
            case "太刀":
                weapon = new LongSword();
                break;
            case "弓":
                weapon = new Bow();
                break;
        }

        if (weapon != null) {
            weapon.build();
        }

        return weapon;
    }
}
