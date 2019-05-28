package com.neuedu.work0527;

public class Car {
    /*
     * 1）编写一个Car类，具有：特征：品牌(mark)——String类型   价格（price）、速度（speed）——int型
     *功能：驾驶（void drive( )）    功能：变速（void speedChange(int newSpeed)），把新速度赋给speed
     *3）定义主类E，在其main方法中创建Car类的两个对象：aodi和benchi的对 象并测试其对象的特性
     * */
    private String mark;
    private int price;
    private int speed;
    public void setMark(String mark1) {
        mark = mark1;
    }

    public String getMark() {
        return mark;
    }
    public void setPrice(int price1) {
        price = price1;
    }

    public int getPrice() {
        return price;
    }
    public void setSpeed(int speed1) {
        speed = speed1;
    }

    public int getSpeed() {
        return speed;
    }











    public void derver(){
        
    }
    public void speedChange(int newSpeed){
        speed = newSpeed;

    }
    public String toString() {
        return "品牌" + mark + "价格" + price+"速度"+speed;
    }


}
