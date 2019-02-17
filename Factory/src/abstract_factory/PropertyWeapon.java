package abstract_factory;

import abstract_factory.product.color.Color;
import abstract_factory.product.jewel.Jewel;
import method_factory.product.Weapon;

public abstract class PropertyWeapon implements Weapon {

    protected Jewel jewel;

    protected Color color;
}
