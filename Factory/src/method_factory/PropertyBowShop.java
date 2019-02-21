package method_factory;

import abstract_factory.PropertyFactory;
import abstract_factory.product.PropertyWeapon;
import abstract_factory.product.property_weapon.KirinPropertyBow;
import abstract_factory.product.property_weapon.RathalosPropertyBow;

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

            case "火龍":
                propertyWeapon = new RathalosPropertyBow(propertyFactory);
                break;

        }

        return propertyWeapon;
    }
}
