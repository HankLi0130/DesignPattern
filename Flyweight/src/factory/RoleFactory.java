package factory;

import role.Hero;
import role.Monster;
import role.Role;
import role.Type;

import java.util.HashMap;

public class RoleFactory {

    // Cache
    private static HashMap<String, Role> roleMap = new HashMap<>();

    public static Role createRole(Type type) {

        Role role = roleMap.get(type.name());

        if (role == null) {

            switch (type) {
                case MONSTER:
                    role = new Monster("怪物");
                    break;

                case HERO:
                    role = new Hero("英雄");
                    break;
            }

            roleMap.put(type.name(), role);
        }

        return role;
    }
}
