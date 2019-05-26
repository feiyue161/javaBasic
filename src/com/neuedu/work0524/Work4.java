package com.neuedu.work0524;

public class Work4 {
    /*计算9的阶乘*/
    public static void main(String[] args) {
        int i = 1;
        for (int a = 1; a < 10; a++) {
//            i = a * i;
            i *=a;
        }
        System.out.println(i);
    }
}
