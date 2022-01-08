package cn.csuft.day03.demo04;
//当方法的局部变量和成员变量重名时，会根据就近原则使用局部变量
//如果需要访问局部变量，需要使用this.关键字
//通过谁调用的方法谁就是this
//this 在重名的情况下，起到区分的效果
public class Person {

    String name;
    public void sayHello(String name){
        System.out.println("Hello "+name+" I am "+this.name);
    }

}