package com.neuedu.work0524;

import java.util.Scanner;

public class Work10 {
    /*
    * 一个整数的各位数字之和能被 9 整除，则该数也能被 9 整除。编程验证给定的整数能否9 整除
    * */
    public static void main(String[] args) {
        System.out.println("请输入一个整数");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int i = 0;
       while (a%10>0){
           i=i+a%10;
           a=a/10;
       }
       i=a+i;
       if (i%9==0){
           System.out.println("能被9整除");
       }else{
           System.out.println("不能被9整除");
       }
    }
}
