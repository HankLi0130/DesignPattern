package product;

/**
 * 弓
 */
public class Bow implements Weapon {

    @Override
    public void build() {
        System.out.println("打造弓");
    }

    @Override
    public void attack() {
        System.out.println("弓射擊");
    }
}
