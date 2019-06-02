package com.neuedu.work0531;

public class SuShu {
    /*
    *判断101-200之间有多少个素数，并输出所有素数。
    * */
    public static void main(String[] args) {
        int count = 0;
        for (int i = 101; i <= 200; i++) {
            if (i%2!=0&&i%3!=0&&i%5!=0&&i%7!=0&&i%11!=0&&i%13!=0){
                System.out.println(i);
                count++;
            }
        }
        System.out.println("101-200之间有"+count+"个素数");
    }
}
