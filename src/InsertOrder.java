

import java.util.Arrays;

public class InsertOrder {
    public static void main(String[] args) {
        int a[] = new int[]{1,3,5,6,87,8,9};
        for (int i = 1 ;i<a.length;i++){
            for (int j=i;j>0;j--){
                if (a[j]<a[j-1]){
                    int s = a[j];
                    a[j]=a[j-1];
                    a[j-1]=s;
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
