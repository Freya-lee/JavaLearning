package cn.csuft.day04.demo02;

import java.util.Scanner;

public class Demo02Anonymous {
    public static void main(String[] args) {
//        //普通使用方式
//        Scanner sc= new Scanner(System.in);
//        int num = sc.nextInt();
//        //匿名对象的方式
//        int num = new Scanner(System.in).nextInt();
//        System.out.println("输入的是："+num);
        //使用一般方法传入参数
     //   Scanner sc= new Scanner(System.in);
        //methodParam(sc);
        //下面使用匿名类来使用下面的静态方法
        methodParam(new Scanner(System.in));
        Scanner sc= methodReturn();
      int a=  sc.nextInt();
        System.out.println("返回的输入数字是："+a);
    }
    //匿名对象作为参数传入方法
    public static void methodParam(Scanner sc){
        int i = sc.nextInt();
        System.out.println("输入的是："+i);
    }
    //匿名对象作为返回值
    public static Scanner methodReturn(){
        return new Scanner(System.in);
    }
}
