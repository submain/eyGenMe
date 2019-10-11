

public class SingleTest {
    public static void main(String[] args) {
            SingleDemo.test();
        SingleDemo singleDemo1 = SingleDemo.getInstance();
        SingleDemo singleDemo2 = SingleDemo.getInstance();
        SingleDemo singleDemo3 = SingleDemo.getInstance();
        System.out.println(singleDemo1);
        System.out.println(singleDemo2);
        System.out.println(singleDemo3);
    }
}
