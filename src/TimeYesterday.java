import java.text.SimpleDateFormat;
import java.util.Date;
//打印昨天的当前时刻
public class TimeYesterday {
    public static void main(String[] args) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date();
        System.out.println(String.format("当前时刻" + simpleDateFormat.format(date)));
        Long yesterday = date.getTime()-24*60*60*1000l;
        date.setTime(yesterday);
        System.out.println("昨天的当前时刻" + simpleDateFormat.format(date));
    }
}
