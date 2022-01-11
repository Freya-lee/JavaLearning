package cn.csuft.day06.demo11;
//抽象方法：加上abstract关键字，然后去掉大括号，直接分号结束。
//抽象方法所在的类，必须是抽象类,在class之前加上abstract即可
//抽象方法中可以有具体的普通方法
//如何使用抽象类方法
//1，不能直接new一个抽象类对象
//2,必须使用一个子类来继承抽象父类
//3,子类必须覆盖重写（实现）父类当中的所有方法
//4，创建子类对象进行使用
public abstract class Animal {
    //这是一个抽象方法，代表吃东西，但是具体吃什么（大括号的内容）不确定。
    public abstract void eat();
    //这是普通的成员方法
    public void method(){

    }
}
