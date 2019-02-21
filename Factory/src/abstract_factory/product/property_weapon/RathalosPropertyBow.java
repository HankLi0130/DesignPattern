package abstract_factory.product.property_weapon;

import abstract_factory.PropertyFactory;
import abstract_factory.product.PropertyWeapon;

public class RathalosPropertyBow extends PropertyWeapon {


    private PropertyFactory factory;

    public RathalosPropertyBow(PropertyFactory factory) {
        this.factory = factory;
    }

    @Override
    public void build() {

        this.jewel = factory.getJewel();
        this.color = factory.getColor();

        System.out.println("打造進階火龍弓");
        color.showColor();
        jewel.showName();
        System.out.println();
    }

    @Override
    public void attack() {
        System.out.println("進階火龍弓射擊");
    }
}
