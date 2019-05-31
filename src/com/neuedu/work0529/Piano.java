package com.neuedu.work0529;

public class Piano extends  Instrument {
//    @Override
    public void play() {
    }
    public void panioMethod (){
        System.out.println("piano a methosd");
    }
    static{
        System.out.println("piano static 代码块");
    }
    public Piano(){
        super();
        System.out.println("piano constructor");
    }
    {
        /*构造代码块   非静态代码块*/
        System.out.println("Instrument 构造代码块");
    }

}
