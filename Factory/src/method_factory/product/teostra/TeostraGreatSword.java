package method_factory.product.teostra;

import method_factory.product.GreatSword;

/**
 * 炎王龍大劍
 */
public class TeostraGreatSword extends GreatSword {

    @Override
    public void build() {
        System.out.println("打造炎王龍大劍");
    }

    @Override
    public void attack() {
        System.out.println("炎王龍大劍攻擊");
    }
}
