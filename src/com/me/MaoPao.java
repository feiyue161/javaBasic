package com.me;

public class MaoPao {
    public static void main(String[] args) {
        /*冒泡排序*/
        int[] arrs = {22, 77, 55, 33, 99, 1, 8};
        int[] arr = {9,8,7,6,5,4,3,2,1,};
        int[] arr1= new int[]{9,8,7,6,5,4,3,2,1};
        int[] arr2= new int[9];
        int arr3[]={9,8,7,6,5,4,3,2,1};
        /*控制次数*/
        for (int i = 0; i < arrs.length - 1; i++) {
            for (int j = 0; j < arrs.length - 1 - i; j++) {
                /*数据交换*/
                if (arrs[j] > arrs[j + 1]) {
                    int tmp = 0;
                    tmp = arrs[j];
                    arrs[j] = arrs[j + 1];
                    arrs[j + 1] = tmp;
                }
            }
        }
        for (int a : arrs) {
            System.out.println(a);
        }
//ArrayIndexOutOfBoundsException

    }
}
