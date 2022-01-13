package cn.csuft.day08.demo01;
//对于成员变量来说
//如果使用final变量来修饰，那么这个变量也是照样不可变
//由于成员变量具有默认值，所以使用来final之后必须手动赋值，不会再给默认值来
//对于final的成员变量，要么使用直接赋值，要么通过构造方法赋值
//
public class Person {
    private final String name ;
//因为使用final修饰词修饰了，所以所有尝试修改这个值的方法都会报错，二者选其一
//    public Person(String name) {
//        this.name = name;
//    }

    public Person() {
        name = "Honey";
    }

    public String getName() {
        return name;
    }

//    public void setName(String name) {
//        this.name = name;
//    }
}
