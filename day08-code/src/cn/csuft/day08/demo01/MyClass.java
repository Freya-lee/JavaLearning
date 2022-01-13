package cn.csuft.day08.demo01;
//当final关键字用来修饰一个类的时候，格式：
//public final class 类名称
//含义，当前这个类不能含有任何的子类
//一个类如果是final的，那么所有其中所有的成员方法都部分进行重写覆盖（因为没有子类）
//注意，对于方法来说，abstract和final不能同时使用，因为抽象方法是必须要重写的

public final class MyClass extends Object{
    public void  method(){
        System.out.println("我这个类有final修饰");
    }
}
