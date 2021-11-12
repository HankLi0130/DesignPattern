import java.util.List;

public class AdapterTest {

    public static void main(String[] args) {

        List<String> items = List.of(
                "This is my text",
                "This is my text1",
                "This is my text2",
                "This is my text3",
                "This is my text4"
        );

        ListView listView = new ListView(items);
        listView.show();

//        Map<Integer, String> mapItems = Map.of(
//                0, "This is my map text",
//                1, "This is my map text1",
//                2, "This is my map text2",
//                3, "This is my map text3",
//                4, "This is my map text4"
//        );
//
//        ListViewAdapter adapter = new ListViewAdapter(mapItems);
//        ListView listView = new ListView(adapter);
//        listView.show();
    }
}
