package com.neuedu.work0613.work1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class Test1 {

    /**
     *产生10个1-100的随机数，并放到一个数组中
     *把数组中大于等于10的数字放到一个list集合中，并打印到控制台。
     */
    public static void main(String[] args) throws IOException {
        //产生10个1-100的随机数，并放到一个数组中
        int[] arr = new int[10];
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(100) + 1;
        }

        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> hm = new HashMap<>();
        //(1)把数组中大于等于10的数字放到一个list集合中，并打印到控制台。
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 10) {
                list.add(arr[i]);
            }
        }
        System.out.println(list);
        for (Integer integer : hm.keySet()) {
            System.out.print(hm.get(integer) + " ");
        }
    }

}

