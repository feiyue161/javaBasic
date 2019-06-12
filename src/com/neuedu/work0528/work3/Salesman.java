package com.neuedu.work0528.work3;

public class Salesman extends Work3 {
    /*
     *  假设要为某个公司编写雇员工资支付程序。
     *  一般工人（Worker）按每月工作的天数计算工资；
     *  销售人员（Salesman）在基本工资基础上每月还有销售提成；
     *  经理（Manager）每月按固定工资支付，
     *  临时工（Floater）按小时支付。
     *  要求描述所有雇员的共同特性（如姓名，性别，出生日期，员工类别）
     *  含有计算工资的方法computeSalay（）， 所有员工用该方法计薪。
     * */
    private float basic;
    private float exsalary;

    public float getBasic() {
        return basic;
    }

    public void setBasic(float basic) {
        this.basic = basic;
    }

    public float getExsalary() {
        return exsalary;
    }

    public void setExsalary(float exsalary) {
        this.exsalary = exsalary;
    }

//    @Override
//    public void computeSalay() {
//        System.out.println("销售人员的薪资："+basic+exsalary);
//    }
}
