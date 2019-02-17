package method_factory;

import abstract_factory.PropertyFactory;
import abstract_factory.PropertyWeapon;
import abstract_factory.product.property_weapon.KirinPropertyBow;

public class PropertyBowShop extends PropertyWeaponShop {

    PropertyFactory propertyFactory;

    public PropertyBowShop(PropertyFactory propertyFactory) {
        this.propertyFactory = propertyFactory;
    }

    @Override
    PropertyWeapon createWeapon(String name) {

        PropertyWeapon propertyWeapon = null;

        switch (name) {

            case "麒麟":
                propertyWeapon = new KirinPropertyBow(propertyFactory);
                break;
        }

        return propertyWeapon;
    }
}
