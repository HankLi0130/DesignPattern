package abstract_factory;

import abstract_factory.product.color.Color;
import abstract_factory.product.color.Red;
import abstract_factory.product.jewel.Jewel;
import abstract_factory.product.jewel.ThreeJewel;

public class HeightPropertyFactory implements PropertyFactory {
    @Override
    public Color getColor() {
        return new Red();
    }

    @Override
    public Jewel getJewel() {
        return new ThreeJewel();
    }
}
