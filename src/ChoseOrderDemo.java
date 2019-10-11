


import java.util.*;

public class ChoseOrderDemo {
    public static void main(String[] args) {
        int a [] = new int[]{1,41,31,51,23};
        int min;
        int indexmin;
        for (int i=0;i<a.length;i++){
            min=a[i];
            indexmin=i;
            for (int j=i+1;j<a.length;j++){
                if (min>a[j]){
                     min = a[j];
                     indexmin=j;
                }
            }
            if (a[i]!=min){
                a[indexmin]=a[i];
                a[i]=min;

            }
        }
        System.out.println(Arrays.toString(a));
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        Iterator<Integer> iterator = list.iterator();
        ListIterator<Integer> listIterator = list.listIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());

        }
        while (listIterator.hasNext()){
            System.out.println(listIterator.next());
            System.out.println(listIterator.previousIndex());

        }
    }
}
