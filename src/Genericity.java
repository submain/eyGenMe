

import java.util.ArrayList;
import java.util.List;

public class Genericity {
    public static void getInstance(List<? extends Number> list){
        System.out.println(list);
    }
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        List<String> list2 = new ArrayList<>();
        list2.add("1");
        list2.add("2");
        List<Double> list3 = new ArrayList<>();
        list3.add(13.23);
        list3.add(31.67);
      getInstance(list);
       // getInstance(list2);
        getInstance(list3);

    }
}
