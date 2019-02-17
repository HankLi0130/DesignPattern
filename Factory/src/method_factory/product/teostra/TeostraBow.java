package method_factory.product.teostra;

import method_factory.product.Weapon;

/**
 * 炎王龍弓
 */
public class TeostraBow implements Weapon {

    @Override
    public void build() {
        System.out.println("打造炎王龍弓");
    }

    @Override
    public void attack() {
        System.out.println("炎王龍弓射擊");
    }
}
