package com.example.java8;

import java.util.Arrays;
import java.util.List;

/**
 * @author NR
 * @version 1.0
 * @Description TODO
 * @date 2020/1/7 21:52
 */
public class Test3 {
    public static void main(String[] args) {
//        MyInterface1 myInterface1 = ()->{};
//        System.out.println(myInterface1.getClass().getInterfaces()[0]);
//        MyInterface2 myInterface2 = ()->{};
//        System.out.println(myInterface2.getClass().getInterfaces()[0]);
//        new Thread(()->{
//            System.out.println("ThreadStart");
//        }).start();
//
//        List<String> list = Arrays.asList("hello","world","hello world");
////        jdk1.6之前
////        List<String> list2 = new ArrayList<String>();
////        diamond 菱形语法(类型推断的好处)
//        List<String> list2 = new ArrayList<>();
//        list.forEach(i->System.out.println(i.toUpperCase()));
//        list.forEach(i->list2.add(i.toUpperCase()));
//        list2.forEach(i-> System.out.println(i));
        List<String> list = Arrays.asList("hello","world","hello world");
        // stream 串行流
        // list调用流方法stream产生流调用map方法映射值(把i的值映射为i.toUpperCase())，map方法返回的也是流。
        list.stream().map(i->i.toUpperCase()).forEach(i-> System.out.println(i));
        // parallelStream 并行流
        // list.parallelStream();
        list.stream().map(String::toUpperCase).forEach(i-> System.out.println(i));
    }
}
