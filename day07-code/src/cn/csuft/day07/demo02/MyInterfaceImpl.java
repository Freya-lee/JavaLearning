package cn.csuft.day07.demo02;

public class MyInterfaceImpl implements MyInterfaceA,MyInterfaceB{
    @Override
    public void methodA() {
        System.out.println("我是接口A的方法，我被实现了");
    }

    @Override
    public void method() {
        System.out.println("我是那个重名的抽方法，现在我被实现了");
    }

    @Override
    public void methodDefault() {
        //对多个接口中的冲突默认方法进行了覆盖重写
        System.out.println("我重写了默认的冲突方法");
    }

    @Override
    public void methodB() {
        System.out.println("我是接口B的方法，我被实现了");

    }

}
