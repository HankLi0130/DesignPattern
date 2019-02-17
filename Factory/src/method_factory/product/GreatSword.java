package method_factory.product;

/**
 * 大劍
 */
public class GreatSword implements Weapon {

    @Override
    public void build() {
        System.out.println("打造大劍");
    }

    @Override
    public void attack() {
        System.out.println("大劍攻擊");
    }
}
