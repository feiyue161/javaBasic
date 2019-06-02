package com.neuedu.work0531;

import com.neuedu.work0527.Rectangle;

public class E {
    /*
     *编写一个Shape类，具有属性：周长和面积；
     * 定义其子类三角形和矩形，分别具有求周长的方法。
     *定义主类E，在其main方法中创建三角形和矩形类的对象，
     * 并赋给Shape类的对象a、b，使用对象a、b来测试其特性
     * */
    public static void main(String[] args) {
//        实例化三角形对象
        Triangle sanjiao = new Triangle();
        System.out.println(sanjiao.qiuZC(5,6,8));
        System.out.println(sanjiao.qiuZC(5, 5.6, 25.2));

        //实例化矩形对象
        Rectangle jx= new Rectangle();
//        System.out.println(jx.qiuZC(5,6));
//        System.out.println(jx.qiuZC(28, 0));
    }
}
