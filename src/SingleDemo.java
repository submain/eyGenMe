

public class SingleDemo {
    private SingleDemo singleDemo ;
    static {
        System.out.println("静态外部类");
    }
    private SingleDemo(){

    }
    private static class SingleGet{
        static {
            System.out.println("静态内部类");
        }
        private static final SingleDemo SINGLE_DEMO = new SingleDemo();
    }
    public static SingleDemo getInstance(){
        return SingleGet.SINGLE_DEMO;
    }
    public static void test(){
        System.out.println("测试...");
    }
}
