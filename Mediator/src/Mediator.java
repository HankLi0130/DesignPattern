import java.util.ArrayList;
import java.util.List;

public class Mediator {

    private List<Plane> planes = new ArrayList<>();

    void registeredPlane(Plane plane) {
        planes.add(plane);
    }

    void sendMessage(Plane plane, String message) {

        message = "注意！！ " + message;

        if (plane == null) {
            for (Plane p : planes) {
                p.receiveMessage(message);
            }
        } else {
            plane.receiveMessage(message);
        }
    }
}
