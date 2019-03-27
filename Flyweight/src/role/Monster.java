package role;

import java.util.Random;

public class Monster extends Role {

    public Monster(String name) {
        super(name);
    }

    @Override
    public int attack() {
        return new Random().nextInt(150);
    }
}
