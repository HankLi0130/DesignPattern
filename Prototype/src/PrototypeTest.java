
public class PrototypeTest {
    public static void main(String[] args) {

        //Owner owner = new Owner("Hank");

        Dog white = new Dog("小白", 6);

        Dog black = white.copy();
        black.name = "小黑";
        black.age = 2;

        System.out.println("狗狗名字: " + white.name + " 年紀: " + white.age);
        System.out.println("狗狗名字: " + black.name + " 年紀: " + black.age);

//        System.out.println("狗狗名字: " + white.name + " 年紀: " + white.age + " 主人: " + white.owner.name);
//        System.out.println("狗狗名字: " + black.name + " 年紀: " + black.age + " 主人: " + black.owner.name);
    }
}
