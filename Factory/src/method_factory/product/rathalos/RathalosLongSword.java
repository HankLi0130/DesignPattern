package method_factory.product.rathalos;

import method_factory.product.LongSword;

/**
 * 火龍太刀
 */
public class RathalosLongSword extends LongSword {

    @Override
    public void build() {
        System.out.println("打造火龍太刀");
    }

    @Override
    public void attack() {
        System.out.println("火龍太刀攻擊");
    }
}
