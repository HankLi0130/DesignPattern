package method_factory.product.kirin;

import method_factory.product.GreatSword;

/**
 * 麒麟大劍
 */
public class KirinGreatSword extends GreatSword {

    @Override
    public void build() {
        System.out.println("打造麒麟大劍");
    }

    @Override
    public void attack() {
        System.out.println("麒麟大劍攻擊");
    }
}
