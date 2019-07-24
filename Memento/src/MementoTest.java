public class MementoTest {
    public static void main(String[] args) {
        Caretaker history = new Caretaker();
        EditText editText = new EditText();

        editText.setText("Java");
        editText.setTextColor("白色");
        editText.setBackgroundColor("黑色");
        history.addMemento(editText.save());

        editText.setText("Kotlin");
        editText.setTextColor("藍色");
        editText.setBackgroundColor("橘色");
        history.addMemento(editText.save());

        editText.setText("Go");
        editText.setTextColor("黃色");
        editText.setBackgroundColor("綠色");
        history.addMemento(editText.save());

        editText.setText("Swift");
        editText.setTextColor("紫色");
        editText.setBackgroundColor("灰色");

        System.out.println("文字：" + editText.getText() + " 文字顏色：" + editText.getTextColor() + " 背景顏色：" + editText.getBackgroundColor());

        editText.restore(history.getMemento(2));
        System.out.println("文字：" + editText.getText() + " 文字顏色：" + editText.getTextColor() + " 背景顏色：" + editText.getBackgroundColor());
    }
}
