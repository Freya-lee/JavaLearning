package cn.csuft.day07.demo03;

public class MyInterfaceImpl implements MyInterface{
    @Override
    public void method() {
        System.out.println("我是从MyInterface实现的方法");
    }

    @Override
    public void methodA() {
        System.out.println("我是从MyInterfaceA实现的方法");

    }

    @Override
    public void methodB() {
        System.out.println("我是从MyInterfaceB实现的方法");

    }

    @Override
    public void methodCommon() {
        System.out.println("我是从MyInterfaceA和B实现的方法");

    }
}
