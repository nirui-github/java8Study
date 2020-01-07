package com.example.java8;

/**
 * @author NR
 * @version 1.0
 * @Description TODO
 * @date 2020/1/5 19:35
 */
public class Test2 {
    public void myTest(MyInterface myInterface){
        System.out.println(1);
        myInterface.test();
        System.out.println(2);
    }

    public static void main(String[] args) {
        Test2 test2= new Test2();
        test2.myTest(new MyInterface() {
            @Override
            public void test() {
                System.out.println("myTest");
            }
        });
        System.out.println("Lambda 表达式方法");
        // 左边问方法的参数 ，右边位方法的方法体
        test2.myTest(() ->{
            System.out.println("myTest");
        });
        System.out.println("--------------");

        MyInterface myInterface = ()->{
            System.out.println("myTest");
        };
        System.out.println(myInterface.getClass());
        // 获取父类
        System.out.println(myInterface.getClass().getSuperclass());
        System.out.println(myInterface.getClass().getInterfaces()[0]);
    }
}
