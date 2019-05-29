package com.neuedu.work0529;

public class Yuan {
    /*
    * 定义一个图形类
    2 创建图形 圆形 正方形 有自己的属性
    例如圆形的特征 都有半径 分别定义自己的计算面积和计算周长
    3 创建main方法 进行测试 创建对象 调用方法计算面积和周长
    * */
    public int circular;//圆形
    public int radius;

    public int getCircular() {
        return circular;
    }

    public void setCircular(int circular) {
        this.circular = circular;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
    public double zhouchang(){
        return 2*Math.PI*radius;
    }
    public double arse(){
        return Math.PI*Math.pow(radius,2);
    }

}
