package com.neuedu.work0524;

public class Work1 {
    /*打印出所有的"水仙花数"，所谓"水仙花数"是指一个三位数，其各位数字立方和等于该数本身*/
    /*例如： 153是一个"水仙花数"，因为153=1的三次方＋5的三次方＋3的三次方*/
    /*程序分析：利用for循环控制100-999个数，每个数分解出个位，十位，百位*/
    public static void main(String[] args) {
        int count = 0;
//        int d=3;
        for (int i = 100; i < 1000; i++) {
            int a = i / 100;
            int b = i % 100 / 10;
            int c = i % 10;
//            double a1 = Math.pow(a, d);
//            double b1 = Math.pow(b, d);
//            double c1 = Math.pow(c, d);
//            int a2 = (int) a1;
//            int b2 = (int) b1;
//            int c2 = (int) c1;
//            int e = a2 + b2 + c2;
            if (a * a * a + b * b * b + c * c * c == i) {
                System.out.println(i);
                count++;
            }

        }
        System.out.println("一共有"+count);
    }
}
