package cn.csuft.day07.demo01;

public class MyInterfaceAbstractImpl implements MyInterfaceAbs {

    @Override
    public void methodA() {
        System.out.println("我是抽象方法A，现在我被实现了");
    }

    @Override
    public void methodB() {
        System.out.println("我是抽象方法B，现在我被实现了");

    }

    @Override
    public void method() {
        System.out.println("我是抽象方法，现在我被实现了");

    }

    @Override
    public void methodC() {
        System.out.println("我是抽象方法C，现在我被实现了");

    }
}
