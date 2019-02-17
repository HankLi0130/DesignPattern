package method_factory.product.rathalos;

import method_factory.product.GreatSword;

/**
 * 火龍大劍
 */
public class RathalosGreatSword extends GreatSword {

    @Override
    public void build() {
        System.out.println("打造火龍大劍");
    }

    @Override
    public void attack() {
        System.out.println("火龍大劍攻擊");
    }
}
