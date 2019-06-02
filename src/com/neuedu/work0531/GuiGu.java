package com.neuedu.work0531;

import java.util.Scanner;

public class GuiGu {
    /*
     *验证“鬼谷猜想”：对任意自然数，若是奇数，就对它乘以 3 再加 1；若是
     *偶数，就对它除以 2，这样得到一个新数，再按上述计算规则进行计算，一直进
     *行下去，最终必然得到 1
     * */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个自然数");
        int a=input.nextInt();
        int i= 0;
        for(;;){
            if(a%2==0) {
                i=a/2;
            }
            else {
                i=a*3+1;
            }
            a=i;
            System.out.println(a);
           if (a==1){
               break;
           }

        }

    }




    }



