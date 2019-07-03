public class MediatorTest {
    public static void main(String[] args) {

        Mediator mediator = new Mediator();

        Plane plane1 = new Plane("波音747", mediator);
        Plane plane2 = new Plane("阿波羅16", mediator);
        Plane plane3 = new Plane("阿帕契", mediator);

        mediator.registeredPlane(plane1);
        mediator.registeredPlane(plane2);
        mediator.registeredPlane(plane3);


        plane1.takingOff();

        plane2.takingOff();

        plane3.landOff();

        mediator.sendMessage(null, "機場關閉！！");
    }
}
