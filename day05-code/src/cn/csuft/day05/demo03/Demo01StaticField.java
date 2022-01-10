package cn.csuft.day05.demo03;
//如果一个成员变量使用了static关键字，
// 那么这个变量不再属于对象自己，而是属于所在的类，多个对象共享一个数据
public class Demo01StaticField {
    public static void main(String[] args) {
        Student stu1 = new Student("Lily",24);
        Student stu2 = new Student("Ton",22);
        Student stu3 = new Student("Tommy",25);
        Student stu4 = new Student("July",21);
        stu1.classroom="001";
        System.out.println(stu1.classroom);
        System.out.println(stu2.classroom);
        System.out.println(stu1.getId());
        System.out.println(stu2.getId());
        System.out.println(stu4.getId());

    }

}
