import abstract_factory.HeightPropertyFactory;
import abstract_factory.PropertyFactory;
import abstract_factory.PropertyWeapon;
import method_factory.PropertyBowShop;
import method_factory.PropertyWeaponShop;

public class FactoryTest {

    public static void main(String[] args) {

        // Simple
//        Weapon weapon = SimpleWeaponShop.getWeapon("太刀");
//        weapon.attack();

        // Factory Method
//        WeaponShop weaponShop = new GreatSwordShop();
//        Weapon weapon = weaponShop.getWeapon("炎王龍");
//        weapon.attack();

        // Abstract Factory
//        PropertyFactory propertyFactory = new HeightPropertyFactory();
//        PropertyWeapon propertyWeapon = new KirinPropertyBow(propertyFactory);
//        propertyWeapon.build();
//        propertyWeapon.attack();

        // Abstract Factory Into Factory Method
        PropertyFactory propertyFactory = new HeightPropertyFactory();
        PropertyWeaponShop weaponShop = new PropertyBowShop(propertyFactory);
        PropertyWeapon propertyWeapon = weaponShop.getWeapon("麒麟");
        propertyWeapon.attack();
    }
}
