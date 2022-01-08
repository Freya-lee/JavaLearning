package cn.csuft.day03.demo05;
//定义一个标准的类
//一个标准的类主要有下面四个部分
//所有成员变量都要用private关键字进行修饰
//为每一个成员变量编写一对get/set方法
//编写一个无参数的构造方法
//编写一个全参数的构造方法
//这样的标准类也叫做java bean
public class Student {
    private String name;
    private String sex;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getSex() {
        return sex;
    }
    public Student(String name, String sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }
    public Student(){
        System.out.println("我是无参数构造方法");
    }

}
