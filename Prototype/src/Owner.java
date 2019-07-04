public class Owner implements Cloneable<Owner> {
    public String name;

    public Owner(String name) {
        this.name = name;
    }

    @Override
    public Owner copy() {
        return new Owner(name);
    }
}
