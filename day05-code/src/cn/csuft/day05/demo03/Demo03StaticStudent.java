package cn.csuft.day05.demo03;

public class Demo03StaticStudent {
    public static void main(String[] args) {
        //首先设置一下教室，这是静态的东西，应该通过类名称进行调用
        Student.classroom="101教室";
        Student stu1 = new Student("Lily",24);
        Student stu2 = new Student("Ton",22);
        Student stu3 = new Student("Tommy",25);
        Student stu4 = new Student("July",21);
        System.out.println("姓名: "+stu1.getName()+"  年龄： "+stu1.getAge()+
                " 学号："+stu1.getId()+" 教室： "+stu1.classroom);
        System.out.println("=======================================================");
        System.out.println("姓名: "+stu2.getName()+"  年龄： "+stu2.getAge()+
                " 学号："+stu2.getId()+" 教室： "+stu2.classroom);
        System.out.println("=======================================================");
        System.out.println("姓名: "+stu3.getName()+"  年龄： "+stu3.getAge()+
                " 学号："+stu3.getId()+" 教室： "+stu3.classroom);
        System.out.println("=======================================================");
        System.out.println("姓名: "+stu4.getName()+"  年龄： "+stu4.getAge()+
                " 学号："+stu4.getId()+" 教室： "+stu4.classroom);
        System.out.println("=======================================================");

    }
}
