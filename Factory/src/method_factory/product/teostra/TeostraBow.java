package method_factory.product.teostra;

import method_factory.product.Bow;

/**
 * 炎王龍弓
 */
public class TeostraBow extends Bow {

    @Override
    public void build() {
        System.out.println("打造炎王龍弓");
    }

    @Override
    public void attack() {
        System.out.println("炎王龍弓射擊");
    }
}
