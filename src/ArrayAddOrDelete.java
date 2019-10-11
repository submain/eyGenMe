import java.util.Arrays;

//不使用集合吗，如何给数组增加和删除元素
public class ArrayAddOrDelete {
    public static void main(String[] args) {
        int [] a = new int[10];
        for (int i=0;i<a.length;i++){
            a[i]=i;
        }
        System.out.println(Arrays.toString(a));
        //增加元素
        int b [] = new int [a.length+1] ;
        System.arraycopy(a,0,b,0,a.length);
        b[b.length-1]=10;
        System.out.println(Arrays.toString(b));
        //删除元素
        int c [] = Arrays.copyOf(b,b.length-2);
        System.out.println(Arrays.toString(c));
    }
}

