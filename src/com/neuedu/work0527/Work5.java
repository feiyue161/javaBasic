package com.neuedu.work0527;

public class Work5 {
    /*
     *定义一个学生类 包括 姓名 年龄 分数的特征
     *创建五个学生对象 对其中特征进行赋值 赋值后 根据分数从大到小进行排序
     * */
    public static void main(String[] args) {
        Students[] stus = new Students[5];
        for(int i=0;i<stus.length;i++){
            Students student = new Students();
            student.sname="abc";
            student.score=80+i;
            stus[i] = student;
        }
//        for (int i=0;i<stus.length;i++){
//            for (int j=0;j<stus.length;j++){
//                if (stus[j].score>stus[j+1].score){
//        int tmp = 0;
//        tmp = stus[j+1].score;
//        stus[j].score = stus[j+1].score;
//        stus[j].score = tmp;
////
//                }
//            }
//        }
        for(Students s:stus){
            System.out.println(s);
        }

    }

    }



