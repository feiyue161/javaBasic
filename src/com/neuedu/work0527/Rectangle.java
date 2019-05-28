package com.neuedu.work0527;

public class Rectangle {
    /*
     *1 定义长方形类，含：
     * 特征：宽、高（整型）；
     *方法：求周长、面积；
     *方法3个：（1）无参——宽、高默认值为1；（2）1个参数——宽、高均为参数值；
     *         （3）2个参数——宽、高各为参数值。并对其进行测试
     * */
    private int width = 1;
    private int height = 1;

    public void setWidth(int width1) {
        width = width1;
    }

    public int getWidth() {
        return width;
    }

    public void setHeight(int height1) {
        height = height1;
    }

    public int getHeight() {
        return height;
    }

    public String toString() {
        return "宽" + width + "高" + height;
    }


    public void perimeter() {
        int result = (width + height) * 2;
        System.out.println(result);
    }

    public void perimeter(int width1) {
        width = width1;
        int result = (width + height) * 2;
        System.out.println(result);
    }

    public void perimeter(int width1, int height1) {
        width = width1;
        height = height1;
        int result = (width + height) * 2;
        System.out.println(result);
    }

    public void area() {
        int result = width * height;
        System.out.println(result);
    }

    public void area(int width1) {
        width = width1;
        int result = width * height;
        System.out.println(result);
    }

    public void area(int width1, int height1) {
        width = width1;
        height = height1;
        int result = width * height;
        System.out.println(result);
    }


}
