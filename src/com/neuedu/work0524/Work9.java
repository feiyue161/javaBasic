package com.neuedu.work0524;

public class Work9 {
    /*
     *用 while 循环，计算 1~200 之间所有 3 的倍数之和
     * */
    public static void main(String[] args) {
        int a = 0;
        int i = 1;
        while (i < 201) {
            if (i % 3 == 0) {
                a += i;
            }
            i++;
        }
        System.out.println("和为："+a);
    }
}
