package com.neuedu.work0527;

import java.util.Scanner;

public class Work2 {
    /*
     *定义圆类，它有一个变量radius(半径)。从键盘输入数据，
     *将半径传递给radius，编程计算并输出圆的周长和面积（确保输入的数据不为负数）。并对其进行测试
     *
     * */
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println("请输入半径（不要输入负值）");
        Scanner input = new Scanner(System.in);
        int radius = input.nextInt();
        circle.setRadius(radius);
        double result = circle.perimeter();
        System.out.println("圆的周长："+result);
        double result1=circle.area();
        System.out.println("圆的面积："+result1);

    }
}
