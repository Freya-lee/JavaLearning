package cn.csuft.day07.demo01;
//接口就是多个类的公共规范
//接口是一种引用类型，最重要的内容就是其中的抽象方法
//定义一个接口
//public interface 接口名称 {接口内容}
//如果是java7 那么接口中可以包含的内容有：
//1。常量
//2。抽象方法
//如果是java8 那么还可以额外包含的有：
//3，默认方法
//4，静态方法
//如果是java9 那么还可以额外包含的有：
//5，私有方法
//接口使用步骤
//1，接口不能直接使用，必须有一个实现类来实现接口
//格式：public class 实现类名称 implements 接口名称
//有点类似于继承
//接口的实现类必须覆盖重写（实现）接口中所有的抽象方法
//重写：去掉abstract，加上方法体大括号
//创建实现类的对象进行使用
//注意事项：
//如果实现类没有实现接口的所有抽象方法，那么这个类必须是抽象类，不然编译不通过
public class Demo01Interface {
    public static void main(String[] args) {
        MyInterfaceAbstractImpl myInterfaceAbstract = new MyInterfaceAbstractImpl();
        myInterfaceAbstract.method();
        myInterfaceAbstract.methodA();
        myInterfaceAbstract.methodB();
        myInterfaceAbstract.methodC();
    }

}
