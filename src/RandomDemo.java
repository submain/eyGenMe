import java.util.Random;
//工具类获得指定范围的随机数
public class RandomDemo {
    public static void main(String[] args) {
        System.out.println(getRandom(3,10));
    }
    public static int getRandom(int min,int max){
        return min+ new Random().nextInt(max-min+1);
    }
}
