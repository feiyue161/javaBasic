package com.neuedu.work0524;

import java.util.Scanner;

public class Work2 {
    /*
    * 利用条件运算符的嵌套来完成此题：
    * 学习成绩>=90分的同学用A表示，60-89分之间的用B表示，60分以下 的用C表示
    * */
    public static void main(String[] args) {
//        for(;;){}
        while(true){
            Scanner input = new Scanner(System.in);
            int result = input.nextInt();
            int a = result;
            if (a>=90){
                System.out.println("A");
            }else if (a>=60&&a<90){
                System.out.println("B");
            }else if (a<60&&a>=0){
                System.out.println("C");
            }else {
                System.out.println("分数不规范  重新输入");
            }


        }

    }
}
