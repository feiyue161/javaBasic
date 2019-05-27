package com.neuedu.work0527;

public class Rectangle {
    /*
     *1 定义长方形类，含：
     * 特征：宽、高（整型）；
     *方法：求周长、面积；
     *方法3个：（1）无参——宽、高默认值为1；（2）1个参数——宽、高均为参数值；
     *         （3）2个参数——宽、高各为参数值。并对其进行测试
     * */
    int length;
    int width;

    public double perimeter(){
        return 2*(width+length);
    }
    public double area() {
        return width * length;
    }

        /*无参*/
    public void Rectangle1(){

    }



}
