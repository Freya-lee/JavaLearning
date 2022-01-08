package cn.csuft.day03.demo03;

public class Demo03Person {
    public static void main(String[] args) {
        Person per1= new Person();
        per1.show();
        per1.name="Lily";
        ///per1.age=20;不能直接访问，因为age是私有的
        per1.setAge(-20);
        per1.show();
    }
}
