package abstract_factory;

import abstract_factory.product.color.Color;
import abstract_factory.product.jewel.Jewel;

public interface PropertyFactory {

    Color getColor();

    Jewel getJewel();
}
