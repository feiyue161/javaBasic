package com.neuedu.work0524;

import java.util.Scanner;

public class Work6 {
    /*
     *一个5位数，判断它是不是回文数。即12321是回文数，个位与万位相同，十位与千位同
     * */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int result = input.nextInt();
        int a = result/10000;
        int b = result%10000/1000;
        int c = result%100/10;
        int d = result%10;
        if (a==d&&b==c){
            System.out.println("是回文数");
        }else {
            System.out.println("不是回文数");
        }
    }
}
