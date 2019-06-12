package com.neuedu.work0528.work3;

public class Worker extends Work3 {
    /*
     *  假设要为某个公司编写雇员工资支付程序。
     *  一般工人（Worker）按每月工作的天数计算工资；
     *  销售人员（Salesman）在基本工资基础上每月还有销售提成；
     *  经理（Manager）每月按固定工资支付，
     *  临时工（Floater）按小时支付。
     *  要求描述所有雇员的共同特性（如姓名，性别，出生日期，员工类别）
     *  含有计算工资的方法computeSalay（）， 所有员工用该方法计薪。
     * */

    private int num;/*上班的天数*/
    private float salary;/*每天的工资*/

    public int getNum() {

        return num;
    }

    public void setNum(int num) {

        this.num = num;
    }

    public float getSalary()
    {
        return salary;
    }

    public void setSalary(float salary) {

        this.salary = salary;
    }

//    @Override
//    public void computeSalay() {
//        System.out.println("一般工人的薪资："+num*salary);
//
//    }
    public static void test(){
        System.out.println("worker");
    }
}
