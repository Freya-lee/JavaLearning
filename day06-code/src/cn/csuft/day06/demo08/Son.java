package cn.csuft.day06.demo08;
//super的关键字用法有三种：
//在子类的成员方法中，访问父类的成员变量
//在子类的成员方法中，调用父类的成员方法
//在子类的构造方法中，访问父类的构造方法
public class Son extends Father{
    int num = 20;
    public void method(){
        System.out.println("我是子类的num"+num);
        System.out.println("父类的num"+super.num);
        super.method();//访问父类的方法
    }
    public Son(){
        super();
        System.out.println("我是子类的构造方法");
    }

}
