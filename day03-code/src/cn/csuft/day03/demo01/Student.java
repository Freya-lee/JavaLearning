package cn.csuft.day03.demo01;
//定义一个类：用来模拟学生事物
//属性是什么？姓名，年龄
//行为是什么？吃饭，睡觉，学习
///对于到Java类当中，
// 成员变量（属性）：
// String name//名字
// int age//年龄
// 成员方法（行为）：public void sleep(){}//睡觉
// public void eat(){}//吃饭
// public void study(){}//学习
//注意：
// 成员方法是没有static的
// 成员变量是直接定义在类当中的，在方法外面
public class Student {
    //先写成员变量
    String name;//姓名
    int age;//年龄
    //成员方法
    public void eat(){
        System.out.println("吃饭");
    }
    public void sleep(){
        System.out.println("睡觉");
    }
    public void study(){
        System.out.println("学习");
    }
}
