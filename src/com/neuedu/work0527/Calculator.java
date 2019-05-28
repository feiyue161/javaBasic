package com.neuedu.work0527;

public class Calculator {
    /*
    *定义一个计算器类，包括加、减、乘、除运算。并对其进行测试
    *
    * */
    private int firtNum = 1;
    private int secondNum = 1;

    public void setFirtNum(int firtNum1) {
        firtNum = firtNum1;
    }

    public int getFirtNum() {
        return firtNum;
    }

    public void setSecondNum(int secondNum1) {
        secondNum = secondNum1;
    }

    public int getSecondNum() {
        return secondNum;
    }

    public String toString() {
        return "数:" + firtNum + "数:" + secondNum;
    }


    public void jiafa() {
        int result = firtNum+secondNum;
        System.out.println(result);
    }

    public void jiafa(int firtNum1) {
        firtNum = firtNum1;
        int result = firtNum+secondNum;
        System.out.println(result);
    }

    public void jiafa(int firtNum1, int secondNum1) {
        firtNum = firtNum1;
        secondNum = secondNum1;
        int result = firtNum+secondNum;
        System.out.println(result);
    }

//    public void area() {
//        int result = width * height;
//        System.out.println(result);
//    }
//
//    public void area(int width1) {
//        width = width1;
//        int result = width * height;
//        System.out.println(result);
//    }
//
//    public void area(int width1, int height1) {
//        width = width1;
//        height = height1;
//        int result = width * height;
//        System.out.println(result);
//    }

}
