package cn.csuft.day03.demo05;

public class Demo01Student {
    public static void main(String[] args) {
        Student stu = new Student();
        Student student = new Student("Lily","Woman",24);
        System.out.println(student.getName()+student.getSex()+student.getAge());
        student.setAge(25);
        System.out.println(student.getName()+student.getSex()+student.getAge());
    }
}
