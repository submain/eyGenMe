package com.sy.config;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int a[] = new int[]{1,3,5,6,87,8,9};
        for (int i = 0 ;i<a.length;i++){
            for (int j=0;j<a.length-i-1;j++){
                if (a[j]<a[j+1]){
                    int min = a[j];
                    a[j]=a[j+1];
                    a[j+1]=min;
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
