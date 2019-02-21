import abstract_factory.HeightPropertyFactory;
import abstract_factory.PropertyFactory;
import abstract_factory.product.PropertyWeapon;
import method_factory.PropertyBowShop;
import method_factory.PropertyWeaponShop;

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
//        WeaponShop weaponShop = new GreatSwordShop();
//        Weapon weapon = weaponShop.getWeapon("火龍");
//        weapon.attack();

        // Abstract Factory
//        PropertyFactory propertyFactory = new LowPropertyFactory();
//        PropertyWeapon propertyWeapon = new KirinPropertyBow(propertyFactory);
//        propertyWeapon.build();
//        propertyWeapon.attack();

        // Abstract Factory Into Factory Method
        PropertyFactory propertyFactory = new HeightPropertyFactory();
        PropertyWeaponShop weaponShop = new PropertyBowShop(propertyFactory);
        PropertyWeapon propertyWeapon = weaponShop.getWeapon("火龍");
        propertyWeapon.attack();
    }
}
