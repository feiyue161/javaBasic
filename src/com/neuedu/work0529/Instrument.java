package com.neuedu.work0529;
//抽象类不能直接new对象
//抽象方法只能存在于抽象类中
public abstract class Instrument {
//    会被覆盖 没有实际意义
//    public void play(){
//        System.out.println("乐器可以演奏");
//    }

//    抽象方法  用abstract修饰的方法
// 格式  访问权限修饰符  abstract  方法的类型  方法名(参数)；
    public abstract void play();
    public void a(){}
    static {
        System.out.println("Instrument static  代码块");
    }
    public Instrument(){
        System.out.println("Instrument construstor");
    }
    {
        /*构造代码块   非静态代码块*/
        System.out.println("Instrument 构造代码块");
    }



}