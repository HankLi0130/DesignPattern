package role;

import java.util.Random;

public class Hero extends Role {

    public Hero(String name) {
        super(name);
    }

    @Override
    public int attack() {
        return new Random().nextInt(100);
    }
}
