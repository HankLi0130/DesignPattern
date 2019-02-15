package product.kirin;

import product.Weapon;

/**
 * 麒麟弓
 */
public class KirinBow implements Weapon {

    @Override
    public void build() {
        System.out.println("打造麒麟弓");
    }

    @Override
    public void attack() {
        System.out.println("麒麟弓射擊");
    }
}
