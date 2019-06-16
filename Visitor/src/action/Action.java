package action;

import view.CardView;
import view.TextView;

public interface Action {

    void visitCardView(CardView view);

    void visitTextView(TextView view);
}
