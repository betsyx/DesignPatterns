package com.icefire.keep.move.javase.demo;

/**
 * @author: icefire
 * @date: 9/5/2022 11:31 PM
 * @description: 变量，常量，作用域
 */
public class Demo01 {

    //类变量
    static double salary = 60000;

    //实例化变量，从属于对象，如果不进行初始化，这个类型的默认值 0 0.0
    //布尔值：默认值是false
    //除了基本类型，其余的默认值是null
    String name;
    int age;


    public static void main(String[] args) {

        //局部变量，必须声明和初始化值
        int i = 10;
        System.out.println(i);

        //变量类型，变量名字 = new Demo01();
        Demo01 demo01 = new Demo01();
        System.out.println(demo01.age);
        System.out.println(demo01.name);

    }

    //其他方法
    public void add(){

        int i = 2;
    }

}
