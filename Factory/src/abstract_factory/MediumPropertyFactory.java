package abstract_factory;

import abstract_factory.product.color.Black;
import abstract_factory.product.color.Color;
import abstract_factory.product.jewel.Jewel;
import abstract_factory.product.jewel.TwoJewel;

public class MediumPropertyFactory implements PropertyFactory {
    @Override
    public Color getColor() {
        return new Black();
    }

    @Override
    public Jewel getJewel() {
        return new TwoJewel();
    }
}
