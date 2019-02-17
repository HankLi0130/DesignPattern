package method_factory.product.rathalos;

import method_factory.product.Bow;

/**
 * 火龍弓
 */
public class RathalosBow extends Bow {

    @Override
    public void build() {
        System.out.println("打造火龍弓");
    }

    @Override
    public void attack() {
        System.out.println("火龍弓射擊");
    }
}
