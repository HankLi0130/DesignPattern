public class Plane {

    private String name;

    private Mediator mediator;

    public Plane(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }

    public void takingOff() {
        mediator.sendMessage(this, name + " 起飛！");
    }

    public void landOff() {
        mediator.sendMessage(this, name + " 降落！");
    }

    public void receiveMessage(String message) {
        System.out.println(name + " 收到訊息： " + message);
    }
}
