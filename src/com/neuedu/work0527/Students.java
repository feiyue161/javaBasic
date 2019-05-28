package com.neuedu.work0527;

public class Students {
    String sname;
    int age;
    int score;

    public void setSname(String sname1) {
        sname = sname1;
    }
    public void  setAge(int age1){
        age=age1;
    }
    public void setScore(int score1){
        score=score1;
    }
    public String getSname(){
        return sname;
    }
    public int getAge(){
        return age;
    }
    public int getScore(){
        return score;
    }
    public String toString(){
        return "姓名"+sname+"成绩"+score;
    }

}
