package method_factory.product.kirin;

import method_factory.product.Weapon;

/**
 * 麒麟大劍
 */
public class KirinGreatSword implements Weapon {

    @Override
    public void build() {
        System.out.println("打造麒麟大劍");
    }

    @Override
    public void attack() {
        System.out.println("麒麟大劍攻擊");
    }
}
