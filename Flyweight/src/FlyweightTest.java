import factory.RoleFactory;
import role.Role;
import role.Type;

public class FlyweightTest {

    public static void main(String[] args) throws InterruptedException {

        Role hero = RoleFactory.createRole(Type.HERO);
        hero.setHp(1000);

        Role monster = RoleFactory.createRole(Type.MONSTER);
        monster.setHp(300);

        System.out.println(monster.getName() + " hashcode: " + monster.hashCode());

        action(hero, monster);

        monster = RoleFactory.createRole(Type.MONSTER);
        monster.setHp(300);

        System.out.println(monster.getName() + " hashcode: " + monster.hashCode());

        action(hero, monster);
    }

    public static void action(Role role1, Role role2) throws InterruptedException {

        do {
            role1.hurt(role2.attack());
            role2.hurt(role1.attack());

            Thread.sleep(500);
        } while (role1.isAlive() && role2.isAlive());

        if (!role1.isAlive()) System.out.println(role1.getName() + " 死亡！");
        if (!role2.isAlive()) System.out.println(role2.getName() + " 死亡！");
    }
}
