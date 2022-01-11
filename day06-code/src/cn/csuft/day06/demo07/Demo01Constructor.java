package cn.csuft.day06.demo07;
//继承关系中，父子类构造方法的访问特点
//子类构造方法中，有一个默认的super();在调用父类无参数构造方法，所以一定是先调用的父类构造，后执行的子类构造的方法
//可以通过super关键字，来子类构造调用父类重载构造。
//super();的父类构造调用必须在子类构造方法的第一个语句,不能一个碗子类构造调用多次super();构造
//子类必须调用父类的构造方法，不写就使用默认的super构造方法，写了就使用指定的super调用，super只能有一个，而且只能在第一个
public class Demo01Constructor {
    public static void main(String[] args) {
        Son son = new Son();
    }

}
