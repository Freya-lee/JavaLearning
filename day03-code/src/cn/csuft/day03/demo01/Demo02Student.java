package cn.csuft.day03.demo01;
//通常情况下，一个类不能直接使用，需要根据类创建出一个对象，才能使用
//如何创建一个对象？
//导包：指出需要使用的类在什么位置
// 格式为：import 包名称.类名称；  import cn.csuft.day03.demo01.Student;
//如果和当前类在同一个包，就不用导包，可以省略不写

//创建
//格式：类名称 对象名 = new 类名称（）；
//Student stu1 = new Student();
//使用,分为两种情况
//使用成员变量：对象名.成员变量
//使用成员方法：对象名.成员方法

public class Demo02Student {
    public static void main(String[] args) {
        //导包。因为在同一个包里面，所以就不用导包
        //创建
        Student stu1 = new Student();
        //使用成员变量
        stu1.name="Lily";
        stu1.age=21;
        //使用成员方法
        stu1.eat();
        stu1.sleep();
        stu1.study();
        System.out.println(stu1.age);
        System.out.println(stu1.name);
    }
}
