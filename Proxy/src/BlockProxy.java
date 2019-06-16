public class BlockProxy implements Block {

    private RealBlock realBlock;

    @Override
    public String getIcon() {
        if (realBlock != null) {
            return realBlock.getIcon();
        } else {
            return "代理圖示";
        }
    }

    @Override
    public String getTitle() {
        if (realBlock != null) {
            return realBlock.getTitle();
        } else {
            return "代理標題";
        }
    }

    @Override
    public String getContent() {
        if (realBlock != null) {
            return realBlock.getContent();
        } else {
            return "代理內容";
        }
    }

    @Override
    public void show(Callback callback) {
        if (realBlock != null) {
            realBlock.show(callback);
        } else {
            // 代理作用
            callback.onShow(this);

            // 真正的服務
            new Thread(() -> {

                try {
                    // 耗時作業
                    realBlock = new RealBlock();
                    realBlock.show(callback);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }).start();
        }
    }
}
