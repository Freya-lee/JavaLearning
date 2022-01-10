package cn.csuft.day05.demo03;

public class MyClass {
    int num ;//成员变量
    static int numStatic;//静态变量
    //成员方法
    public void method(){
        System.out.println("这是一个普通的成员方法");
        System.out.println(num);
        System.out.println(numStatic);//成员方法可以访问成员变量，也可以访问静态变量
    }
    //静态方法
    public static  void methodStatic(){
        System.out.println("这是一个静态方法");
    //    System.out.println(num);//错误写法，静态方法不能直接访问非静态的成员变量
        System.out.println(numStatic);//静态方法只能访问静态变量
    }

}
