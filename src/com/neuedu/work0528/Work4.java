package com.neuedu.work0528;

public class Work4 {
    /*
     *4、定义两个类，描述如下：
     * 4.1定义一个人类Person：
     * 4.1.1定义一个方法sayHello()，可以向对方发出问候语“hello,my name is XXX”
     * 4.1.2有三个属性：名字、身高、体重
     * 4.2定义一个PersonCreate类：
     * 4.2.1创建两个对象，分别是zhangsan，33岁，1.73；ishi，44，1.74
     * 5.2.2分别调用对象的sayHello()方法。
     * */
    public static void main(String[] args) {
        CreatePerson p1 = new CreatePerson();
        p1.setName("zhangsan");
        p1.setAge(33);
        p1.setHeight(173);
        p1.sayHello();
        CreatePerson p2 = new CreatePerson();
        p2.setName("lisi");
        p2.setAge(44);
        p2.setHeight(174);
        p2.sayHello();

    }

}
