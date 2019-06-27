public class ProxyTest {

    public static void main(String[] args) {

        Block block = new BlockProxy();

        block.show(b -> {
            System.out.println("圖示：" + b.getIcon());
            System.out.println("標題：" + b.getTitle());
            System.out.println("內容：" + b.getContent());
        });

    }
}
