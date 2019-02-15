package method;

import product.Weapon;

public abstract class WeaponShop {

    public Weapon getWeapon(String name) {

        Weapon weapon = createWeapon(name);

        weapon.build();

        return weapon;
    }

    abstract Weapon createWeapon(String name);
}
