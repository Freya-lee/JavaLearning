package cn.csuft.day03.demo04;
//构造方法是专门用来创建对象的方法，当我们通过new来新建对象的时候其实就是在调用构造方法
//构造方法不要返回值类型
//构造方法不能return一个数值
//如果没有编写构造方法，那么编译器会使用默认的构造方法，只是方法体里面是没有内容的
//一旦编写了至少一个构造方法，那么编译器就不会再使用默认构造方法
//构造方法也是可以进行重载的
public class Student {
    private String name;
    private int age;
    public Student(){
        System.out.println("无参数构造方法执行");
    }
    public Student(int age ,String name){
        System.out.println("有参数构造方法执行");
        this.name=name;
        this.age=age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
