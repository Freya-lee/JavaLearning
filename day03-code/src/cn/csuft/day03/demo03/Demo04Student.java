package cn.csuft.day03.demo03;

public class Demo04Student {
    public static void main(String[] args) {
        Student stu= new Student();
        stu.setAge(20);
        stu.setMale(false);
        stu.setName("Tina");
        System.out.println("姓名："+stu.getName());
        System.out.println("性别："+stu.isMale());
        System.out.println("年龄："+stu.getAge());
    }
}
