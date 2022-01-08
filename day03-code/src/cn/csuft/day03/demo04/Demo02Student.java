package cn.csuft.day03.demo04;

public class Demo02Student {
    public static void main(String[] args) {
        Student stu = new Student();
        Student stu2 = new Student(23,"Lana");
        System.out.println(stu2.getName()+" is "+stu2.getAge()+" year's old");
    }

}
