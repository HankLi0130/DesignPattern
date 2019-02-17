package method_factory.product.teostra;

import method_factory.product.LongSword;

/**
 * 炎王龍太刀
 */
public class TeostraLongSword extends LongSword {

    @Override
    public void build() {
        System.out.println("打造炎王龍太刀");
    }

    @Override
    public void attack() {
        System.out.println("炎王龍太刀攻擊");
    }
}
