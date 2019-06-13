package com.neuedu.work0611.work1;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Worker> lists = new ArrayList<>();

        lists.add(new Worker("张三", 18, 3000));
        lists.add(new Worker("李四", 25, 3500));
        lists.add(new Worker("王五", 22, 3200));

        lists.add(1, new Worker("赵六", 24, 3300));
        lists.remove(3);

        for (Worker a : lists) {
            System.out.println(a);
        }
        System.out.println("================");
        for (int i = 0; i < lists.size(); i++) {
            System.out.println(lists.get(i));
        }

    }

}
