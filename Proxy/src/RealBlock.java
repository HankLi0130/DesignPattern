
public class RealBlock implements Block {

    public RealBlock() throws InterruptedException {
        // 耗時作業，例如：取得網路資源
        Thread.sleep(1000);
        System.out.println("-- 作業完成 --");
    }

    @Override
    public String getIcon() {
        return "真實圖示";
    }

    @Override
    public String getTitle() {
        return "真實標題";
    }

    @Override
    public String getContent() {
        return "真實內容";
    }

    @Override
    public void show(Callback callback) {
        callback.onShow(this);
    }
}
