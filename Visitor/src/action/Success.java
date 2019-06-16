package action;

import view.CardView;
import view.TextView;

public class Success implements Action {

    @Override
    public void visitCardView(CardView view) {
        view.showColor("綠色");
    }

    @Override
    public void visitTextView(TextView view) {
        view.showMessage("成功");
    }
}
