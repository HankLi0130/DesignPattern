public class Dog implements Cloneable<Dog> {

    public String name;

    public int age;

//    public Owner owner;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

//    public Dog(String name, int age, Owner owner) {
//        this.name = name;
//        this.age = age;
//        this.owner = owner;
//    }

    @Override
    public Dog copy() {
        return new Dog(this.name, this.age);

//        return new Dog(this.name, this.age, this.owner);

//        return new Dog(this.name, this.age, this.owner.copy());
    }
}
