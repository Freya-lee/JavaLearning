package cn.csuft.day07.demo02;
//使用接口的时候，需要注意
//接口是没有静态代码块和构造方法的
//一个类的直接父类是唯一的，但是一个类可以同时实现多个接口
//格式：public class MyInterfaceImpl implements MyInterfaceA,MyInterfaceB{
// 覆盖重写所有抽象方法
// }
//如果实现类所实现的多个接口当中，存在重复的抽象方法，那么只需要重写一次即可
//如果实现类没有覆盖重写所有接口当中的所有抽象类，那么这个实现类也得变成抽象类
//如果实现类实现的多个接口当中，存在重复的默认方法，那么实现类一定要对冲突的默认方法进行覆盖重写
//如果一个类的父类的方法和接口当中的方法是重名的，那么优先使用父类的方法
public class Demo01Interface {


    public static void main(String[] args) {
        Son son = new Son();
        son.method1();
    }


}
