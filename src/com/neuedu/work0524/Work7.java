package com.neuedu.work0524;

import java.util.Scanner;

public class Work7 {
    /*
     * 判断一个年份是平年还是闰年
     * */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个年份");
        int result = input.nextInt();
        if ((result%4 == 0 && result%100 != 0) || result%400 == 0){
            System.out.println(result+"是闰年");
        }else {
            System.out.println(result+"是平年");
        }
    }
}
