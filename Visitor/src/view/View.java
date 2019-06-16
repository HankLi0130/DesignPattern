package view;

import action.Action;

public interface View {

    void accept(Action visitor);
}
