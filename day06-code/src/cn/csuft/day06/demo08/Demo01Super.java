package cn.csuft.day06.demo08;
//super的使用方法三种
////super的关键字用法有三种：
////在子类的成员方法中，访问父类的成员变量
////在子类的成员方法中，调用父类的成员方法
////在子类的构造方法中，访问父类的构造方法
public class Demo01Super {
    public static void main(String[] args) {
        Son son = new Son();
        son.method();
    }
}
