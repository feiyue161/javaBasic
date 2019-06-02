package com.neuedu.work0531;

public class Shape {
    /*
     *编写一个Shape类，具有属性：周长和面积；定义其子类三角形和矩形，分别具有求周长的方法。
     *定义主类E，在其main方法中创建三角形和矩形类的对象，并赋给Shape类的对象a、b，使用对象a、b来测试其特性
     * */
    //定义成员变量
    private double zhouchang;
    private double mianji;
    public double getZhouchang() {
        return zhouchang;
    }
    public void setZhouchang(double zhouchang) {
        this.zhouchang = zhouchang;
    }
    public double getMianji() {
        return mianji;
    }
    public void setMianji(double mianji) {
        this.mianji = mianji;
    }
}
