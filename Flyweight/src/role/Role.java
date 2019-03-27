package role;

public abstract class Role implements Behavior {

    private int hp;

    private String name;

    public Role(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    @Override
    public void hurt(int num) {
        hp -= num;
        System.out.println(name + "受到攻擊，傷害：" + num + " ， HP: " + hp);
    }

    @Override
    public boolean isAlive() {
        return hp > 0;
    }
}
