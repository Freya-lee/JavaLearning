package cn.csuft.day07.demo02;

public interface MyInterfaceB {
    //错误写法，接口不能由静态代码块
//    static {
//
//    }
    //错误写法，接口不能有构造方法
//    public  Demo01Interface(){
//
//    }
    void methodB();
    void method();
    public default void methodDefault(){
        System.out.println("我是B的默认方法");
    }

}
