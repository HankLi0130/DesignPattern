package method_factory.product.kirin;

import method_factory.product.Bow;

/**
 * 麒麟弓
 */
public class KirinBow extends Bow {

    @Override
    public void build() {
        System.out.println("打造麒麟弓");
    }

    @Override
    public void attack() {
        System.out.println("麒麟弓射擊");
    }
}
