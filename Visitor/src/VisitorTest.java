import action.Action;
import action.Failure;
import view.CardView;
import view.TextView;
import view.View;

import java.util.ArrayList;
import java.util.List;

public abstract class VisitorTest {
    public static void main(String[] args) {

        List<View> views = new ArrayList<>();

        views.add(new CardView());
        views.add(new TextView());

        views.add(new CardView());
        views.add(new TextView());

        views.add(new CardView());
        views.add(new TextView());

        Action visitor = new Failure();

        for (View view : views) {
            view.accept(visitor);
        }
    }
}
