package com.neuedu.work0529;

public class Work2 {
    /*
     * 定义一个乐器类 Instrument 有乐器演奏方法play（）
     *子类Wind 和Brass类 对乐器类演奏方法进行方法重写 定义自己的演奏方式
     *3 创建main方法 进行测试
     * */
    public static void main(String[] args) {
        /*创建子类*/
//        Brass brass = new Brass();
//        brass.play();
        /*父类类型 父类引用对象 =  new 子类对象*/
//        Instrument  i = new Brass();
        /*父类引用指向子类对象   向上转型  过程中  子类会隐藏自己扩展出来的功能*/
//        Instrument  i = new Piano();

//        Instrument i = new Piano();
//        ((Piano) i).panioMethod();

//        Piano p = new Piano();
//        Instrument i = new Instrument();
//        i=p;
//        if (i instanceof Piano){
//            p=(Piano)i;
//        }else{
//            System.out.println("类型不符 不能转换");
//        }
//        Instrument i = new Piano();
//        Instrument i1 = new Piano();
//        Instrument i2 = new Piano();
//        /*构造代码块  在构造方法前执行*/

       /* test(new Piano());
        test(new Brass());*/

       /*int a = 10;
       chang(a);
        System.out.println(a);*/

    }

   /* public static void test(Instrument i) {
        i.play();
    }*/
   public static void chang(int test){
       test = 20;
   }

}


