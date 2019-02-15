import method.GreatSwordShop;
import method.WeaponShop;
import product.Weapon;

public class FactoryTest {

    public static void main(String[] args) {

        // Simple
//        Weapon weapon = SimpleWeaponShop.getWeapon("太刀");
//        weapon.attack();

        // Factory Method
        WeaponShop weaponShop = new GreatSwordShop();
        Weapon weapon = weaponShop.getWeapon("炎王龍");
        weapon.attack();
    }
}
