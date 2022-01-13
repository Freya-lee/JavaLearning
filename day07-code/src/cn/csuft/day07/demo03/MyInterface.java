package cn.csuft.day07.demo03;
//这个子接口中有1+3个方法
//methodA来自接口A
//methodB来自接口B
//methodCommon来自接口A和接口B
//还有一个自己的method
public interface MyInterface extends MyInterfaceA, MyInterfaceB {
    public abstract void method();

    @Override
    default void methodDefault() {
        System.out.println("我是子类接口重写的默认方法");
    }
}
