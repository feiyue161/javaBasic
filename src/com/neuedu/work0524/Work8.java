package com.neuedu.work0524;

import java.util.Scanner;

public class Work8 {
    /*
     * 编写程序，输入一个字符，判断它是否为小写字母，如果是，将它转换成大写字母，否则，不转换
     * */
//    public static void main(String[] args) throws Exception {
//        System.out.println("请输入一个字符");
//        char a = (char) System.in.read();
//        if (a >= 'a' && a <= 'z') {
//            a -= 32;
//            System.out.println(a);
//        } else {
//            System.out.println(a);
//        }
//}
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String date = input.next();
        char[] c = date.toCharArray();
        if (c[0] >= 97 && c[0] <= 122) {
            char result = (char) (c[0] - 32);
            System.out.println(result);
        } else if (c[0] >= 65 && c[0] <= 90) {
            System.out.println(date);
        } else {
            System.out.println("不是英文字母 请重新输入");
        }

    }
}