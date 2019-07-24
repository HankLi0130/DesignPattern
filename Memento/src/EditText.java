public class EditText {

    private String text;

    private String textColor;

    private String backgroundColor;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getTextColor() {
        return textColor;
    }

    public void setTextColor(String textColor) {
        this.textColor = textColor;
    }

    public String getBackgroundColor() {
        return backgroundColor;
    }

    public void setBackgroundColor(String backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    // Memeto
    public Memento save() {
        return new Memento(text, textColor, backgroundColor);
    }

    public void restore(Memento m) {
        text = m.getText();
        textColor = m.getTextColor();
        backgroundColor = m.getBackgroundColor();
    }
}
