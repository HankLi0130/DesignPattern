package action;

import view.CardView;
import view.TextView;

public class Failure implements Action {

    @Override
    public void visitCardView(CardView view) {
        view.showColor("紅色");
    }

    @Override
    public void visitTextView(TextView view) {
        view.showMessage("失敗");
    }
}
