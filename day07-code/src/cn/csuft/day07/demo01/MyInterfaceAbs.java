package cn.csuft.day07.demo01;
//在任何版本的java中，接口都可以定义抽象方法
//格式：
//public abstract 返回值类型 方法名称（参数列表）;
//注意：
//1，接口中的抽象方法，修饰符必须是两个固定的关键字：public abstract
//2,这两个关键字修饰符，可以选择性的省略不写
//3，方法的三要素可以随机进行选择
public interface MyInterfaceAbs {
    //这是一个抽象方法
    public abstract void methodA();
    //这也是一个抽象方法
    abstract void methodB();
    public void method();
    //这也是一个抽象方法
    void methodC();

}
