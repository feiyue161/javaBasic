package com.neuedu.work0527;

public class Student {
    /*
    *定义一个学生类 包括 姓名 年龄 分数的特征
    *创建五个学生对象 对其中特征进行赋值 赋值后 根据分数从大到小进行排序
    * */
    String sname;
    int sage;
    int sgrade;

    public void print_student(){
        System.out.println("学生" + "姓名:"+sname+ "年龄:"+sage+"分数："+sgrade );
    }
}
