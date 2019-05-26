package com.neuedu.work0524;

public class Work5 {
    /*
    * 分别计算1-100之间的奇数和 和偶数和
    * */
    public static void main(String[] args) {
        int i = 0;
        int j = 0;
        for (int a=1;a<101&&a>0;a++){
            if (a%2==0){
                i +=a;
            } else{
                j +=a;
            }
        }
        System.out.println("100之间的偶数和为："+i);
        System.out.println("1-100之间的奇数和为"+j);
    }

}
