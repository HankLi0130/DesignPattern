public interface Block {

    String getIcon();

    String getTitle();

    String getContent();

    void show(Callback callback);
}
