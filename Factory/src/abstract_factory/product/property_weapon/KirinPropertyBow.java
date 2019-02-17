package abstract_factory.product.property_weapon;

import abstract_factory.PropertyFactory;
import abstract_factory.PropertyWeapon;

/**
 * 麒麟弓
 */
public class KirinPropertyBow extends PropertyWeapon {

    PropertyFactory factory;

    public KirinPropertyBow(PropertyFactory factory) {
        this.factory = factory;
    }

    @Override
    public void build() {
        this.color = factory.getColor();
        this.jewel = factory.getJewel();
        System.out.println("打造進階麒麟弓");
        color.showColor();
        jewel.showName();
        System.out.println();
    }

    @Override
    public void attack() {
        System.out.println("進階麒麟弓射擊");
    }
}
