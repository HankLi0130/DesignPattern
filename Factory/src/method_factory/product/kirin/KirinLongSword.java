package method_factory.product.kirin;

import method_factory.product.Weapon;

/**
 * 麒麟太刀
 */
public class KirinLongSword implements Weapon {

    @Override
    public void build() {
        System.out.println("打造麒麟太刀");
    }

    @Override
    public void attack() {
        System.out.println("麒麟太刀攻擊");
    }
}
