package cn.csuft.day07.demo01;
//从java8开始，接口中允许定义默认方法
//格式：public default 返回值类型 方法名称（参数列表）{//方法体}
//接口中的默认方法，可以解决接口的升级问题
public interface MyInterfaceDefault {
    //抽象方法

    void methodA();
    //新添加一个抽象方法
   // void  methodB();
    //如果直接这样添加，那么就会导致另外两个实现类都发生错误，需要重新写
    //新添加的方法改成默认方法
    public  default void methodDefault(){
        System.out.println("这是新添加的默认方法");
    }
    //这样A，B就不会出错


}
