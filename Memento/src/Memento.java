public class Memento {

    private String text;

    private String textColor;

    private String backgroundColor;

    public Memento(String text, String textColor, String backgroundColor) {
        this.text = text;
        this.textColor = textColor;
        this.backgroundColor = backgroundColor;
    }

    public String getText() {
        return text;
    }

    public String getTextColor() {
        return textColor;
    }

    public String getBackgroundColor() {
        return backgroundColor;
    }
}
