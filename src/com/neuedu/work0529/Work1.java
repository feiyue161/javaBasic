package com.neuedu.work0529;

import java.util.Scanner;

public class Work1 {
    /*
     *定义一个图形类
     *2 创建图形 圆形 正方形 有自己的属性 例如圆形的特征 都有半径 分别定义自己的计算面积和计算周长
     *3 创建main方法 进行测试 创建对象 调用方法计算面积和周长
     * */
    public static void main(String[] args) {
        Yuan cir = new Yuan();
        System.out.println("请输入圆的半径");
        Scanner c=new Scanner(System.in);
        cir.circular=c.nextInt();
        cir.setRadius(4);
        System.out.println("圆形的周长为"+cir.zhouchang());
        System.out.println("圆形的面积为"+cir.arse());
        Square are=new Square();
        System.out.println("请输入正方形的边长");
        Scanner s=new Scanner(System.in);
        are.side=s.nextDouble();
        System.out.println("正方形的周长为"+are.caculatePerimeter());
        System.out.println("正方形的面积为"+are.caculateArea());





    }


}
