package product;

/**
 * 太刀
 */
public class LongSword implements Weapon {

    @Override
    public void build() {
        System.out.println("打造太刀");
    }

    @Override
    public void attack() {
        System.out.println("太刀攻擊");
    }
}
