package cn.csuft.day07.demo01;

public class MyInterfaceDefaultB implements MyInterfaceDefault{

    @Override
    public void methodA() {
        System.out.println("实现了抽象方法BBB");
    }

    @Override
    public void methodDefault() {
        System.out.println("实现类B覆盖重写了接口中的默认方法");
    }
}
