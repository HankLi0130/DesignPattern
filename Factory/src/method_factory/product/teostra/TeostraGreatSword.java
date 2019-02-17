package method_factory.product.teostra;

import method_factory.product.Weapon;

/**
 * 炎王龍大劍
 */
public class TeostraGreatSword implements Weapon {

    @Override
    public void build() {
        System.out.println("打造炎王龍大劍");
    }

    @Override
    public void attack() {
        System.out.println("炎王龍大劍攻擊");
    }
}
