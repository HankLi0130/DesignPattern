import method_factory.BowShop;
import method_factory.WeaponShop;
import method_factory.product.Weapon;

public class FactoryTest {

    public static void main(String[] args) {

        // example
//        String weaponName = "大劍";
//
//        Weapon weapon = null;
//
//        switch (weaponName) {
//            case "大劍":
//                weapon = new GreatSword();
//                break;
//            case "太刀":
//                weapon = new LongSword();
//                break;
//            case "弓":
//                weapon = new Bow();
//                break;
//        }
//        weapon.build();
//        weapon.attack();


        // Simple
//        Weapon weapon = SimpleWeaponShop.getWeapon("太刀");
//        weapon.attack();

        // Factory Method
        WeaponShop weaponShop = new BowShop();
        Weapon weapon = weaponShop.getWeapon("麒麟");
        weapon.attack();

        // Abstract Factory
//        PropertyFactory propertyFactory = new HeightPropertyFactory();
//        PropertyWeapon propertyWeapon = new KirinPropertyBow(propertyFactory);
//        propertyWeapon.build();
//        propertyWeapon.attack();

        // Abstract Factory Into Factory Method
//        PropertyFactory propertyFactory = new HeightPropertyFactory();
//        PropertyWeaponShop weaponShop = new PropertyBowShop(propertyFactory);
//        PropertyWeapon propertyWeapon = weaponShop.getWeapon("麒麟");
//        propertyWeapon.attack();
    }
}
