public class ProxyTest {

    public static void main(String[] args) {
        Block block = new BlockProxy();

//        Block block = null;
//        try {
//             block = new RealBlock();
//        } catch (InterruptedException e) {
//            System.out.println("--發生錯誤-- " + e.getMessage());
//        }


        block.show(b -> {
            System.out.println("圖示：" + b.getIcon());
            System.out.println("標題：" + b.getTitle());
            System.out.println("內容：" + b.getContent());
        });

    }
}
