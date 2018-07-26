package com.example.demo;


import com.example.demo.pojo.Apple;
import com.example.demo.pojo.Apple1;

public class test {
    public static void main(String args[]) {

        test1((String s) -> new Integer(1), "hehehe");  //参数不输入 直接初始化一个值返回
        //test1(Integer::new, "hehehe"); //It's wrong
        test2(Apple::new,"hehehe");
        //test2(Apple1::new,"hehehe");//Compile error
        //I think XXX::new is equivalen to new XXX() but here shoe  it's  not
    }

    public static void test1(Lambdademo1<Integer> lambdademo1, String s) {
        Integer i = lambdademo1.test(s);
        System.out.println(i);
    }

    public static void test2(Lambdademo1<Apple> lambdademo1, String s) {
        Apple i = lambdademo1.test(s);
        System.out.println(i.getColor());
    }

    public static void test3(Lambdademo1<Apple1> lambdademo1, String s) {
        Apple1 i = lambdademo1.test(s);
        System.out.println(i.getColor());
    }

}