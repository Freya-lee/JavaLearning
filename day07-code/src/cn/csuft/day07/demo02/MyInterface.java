package cn.csuft.day07.demo02;

public interface MyInterface {
    public default void method1(){
        System.out.println("我是接口中的默认方法");
    }
}
