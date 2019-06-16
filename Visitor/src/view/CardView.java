package view;

import action.Action;

public class CardView implements View {

    @Override
    public void accept(Action visitor) {
        visitor.visitCardView(this);
    }

    public void showColor(String color) {
        System.out.println("CardView 顯示顏色 " + color);
    }
}
