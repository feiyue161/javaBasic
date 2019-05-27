package com.neuedu.work0527;

public class Work5 {
    /*
     *定义一个学生类 包括 姓名 年龄 分数的特征
     *创建五个学生对象 对其中特征进行赋值 赋值后 根据分数从大到小进行排序
     * */
    public static void main(String[] args) {
        Student ada = new Student();
        ada.sname ="阿大";
        ada.sage =19;
        ada.sgrade =60;
        ada.print_student();

        Student aer = new Student();
        aer.sname ="阿二";
        aer.sage =18;
        aer.sgrade =70;
        aer.print_student();

        Student asan = new Student();
        asan.sname ="阿三";
        asan.sage =17;
        asan.sgrade =80;
        asan.print_student();

        Student asi = new Student();
        asi.sname ="阿四";
        asi.sage =16;
        asi.sgrade =90;
        asi.print_student();

        Student awu = new Student();
        awu.sname ="阿五";
        awu.sage =15;
        awu.sgrade =100;
        awu.print_student();

        int[]arrs={ada.sgrade,aer.sgrade,asan.sgrade,asi.sgrade,awu.sgrade};
//        控制次数
        for (int i =0;i<arrs.length-1;i++){
            for (int j = 0;j<arrs.length-1-i;j++){
//           数据交换\
                if (arrs[j+1]>arrs[j]){
                    int tmp = 0;
                    tmp = arrs[j+1];
                    arrs[j+1] = arrs[j];
                    arrs[j] = tmp;
                }
            }
        }

        for(int sgrade :arrs){
            System.out.println(sgrade);
        }

    }



}
