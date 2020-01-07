package com.example.java8;

import java.util.Arrays;
import java.util.List;

/**
 * @author NR
 * @version 1.0
 * @Description TODO
 * @date 2020/1/5 16:10
 */
public class Test1 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6);
//        外部迭代
//        for (int i = 0; i <list.size();i++){
//            System.out.println(list.get(i));
//        }
//        System.out.println("---------------");
//
//        for (Integer i : list) {
//            System.out.println(i);
//        }
//
//        System.out.println("---------------");
//        内部迭代
//        list.forEach(new Consumer<Integer>() {
//            @Override
//            public void accept(Integer i) {
//                System.out.println(i);
//            }
//        });
//        System.out.println("---------------");
//        list.forEach(i -> {
//            System.out.println(i);
//        });
//      method reference 方法引用
        list.forEach(System.out::println);

    }
}
