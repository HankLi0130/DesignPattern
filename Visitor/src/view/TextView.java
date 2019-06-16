package view;

import action.Action;

public class TextView implements View {

    @Override
    public void accept(Action visitor) {
        visitor.visitTextView(this);
    }

    public void showMessage(String text) {
        System.out.println("TextView 顯示 " + text);
    }
}
