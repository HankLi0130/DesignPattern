package product.teostra;

import product.Weapon;

/**
 * 炎王龍太刀
 */
public class TeostraLongSword implements Weapon {

    @Override
    public void build() {
        System.out.println("打造炎王龍太刀");
    }

    @Override
    public void attack() {
        System.out.println("炎王龍太刀攻擊");
    }
}
