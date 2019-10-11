
public class Reflect {
    public int a;
    public ASsImpl aSs;
    private double b;
    public void printf(){
        System.out.println("我是一个输出方法");
    }

    @Override
    public String toString() {
        return "Reflect{" +
                "a=" + a +
                ", aSs=" + aSs +
                ", b=" + b +
                '}';
    }
}
