import java.util.List;

public class ListView {
    private final List<String> items;

    public ListView(List<String> items) {
        this.items = items;
    }

    public void show() {
        for (int i = 0; i < items.size(); i++) {
            System.out.println("No." + i + " : " + items.get(i));
        }
    }
}
