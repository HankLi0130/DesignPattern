package method_factory;

import abstract_factory.product.PropertyWeapon;

public abstract class PropertyWeaponShop {

    public PropertyWeapon getWeapon(String name) {

        PropertyWeapon weapon = createWeapon(name);

        weapon.build();

        return weapon;
    }

    abstract PropertyWeapon createWeapon(String name);
}
