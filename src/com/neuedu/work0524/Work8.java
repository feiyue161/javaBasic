package com.neuedu.work0524;
public class Work8 {
    /*
     * 编写程序，输入一个字符，判断它是否为小写字母，如果是，将它转换成大写字母，否则，不转换
     * */
    public static void main(String[] args) throws Exception {
        System.out.println("请输入一个字符");
        char a = (char) System.in.read();

        if (a >= 'a' && a <= 'z') {
            a -= 32;
            System.out.println(a);
        }else{
            System.out.println(a);
        }
    }

}