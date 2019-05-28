package com.neuedu.work0528;

public class Notebook {
    /*
     *定义一个笔记本类，该类有颜色（char）和cpu型号（int）两个属性
     *1 无参和有参的两个构造方法；有参构造方法可以在创建对象的同时为每个属性赋值
     *2 输出笔记本信息的方法
     * 3. 然后编写一个测试类，测试笔记本类的各个方法
     * */
    char color;
    int cpu;

//    public void setColor(char color1) {
//
//        color = color1;
//    }
//
//    public void getColor() {
//
//       return color;
//    }
//    public void setCpu(int cpu1) {
//
//        cpu = cpu1;
//    }
//
//    public int getCpu() {
//
//        return cpu;
//    }


    public Notebook() {

    }

    public Notebook(char color1, int cpu1) {
        color = color1;
        cpu = cpu1;
    }

    public String toString() {
        return "笔记本的颜色；" + color + "型号；" + cpu;
    }

}
