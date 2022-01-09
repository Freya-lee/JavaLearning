package cn.csuft.day04.demo05;

import java.util.ArrayList;

//创建四个学生对象并添加到集合当中，然后遍历
public class Demo02ArrayListStudent {


    public static void main(String[] args) {
        //创建四个学生对象
        Student stu1= new Student("Lily",21);
        Student stu2= new Student("Timmy",45);
        Student stu3= new Student("Lucy",13);
        Student stu4= new Student("Freya",24);
        Student stu5= new Student();
        //创建集合
        ArrayList<Student> liststu=new ArrayList<>();
        liststu.add(stu1);
        liststu.add(stu2);
        liststu.add(stu3);
        liststu.add(stu4);
        liststu.add(stu5);
        System.out.println(liststu);
        for (int i = 0; i < liststu.size(); i++) {
            System.out.println(liststu.get(i).getName()+" "+liststu.get(i).getAge());
        }
        System.out.println("===========");
        stu3.setName("Nancy");
        stu3.setAge(23);
        for (int i = 0; i < liststu.size(); i++) {
            System.out.println(liststu.get(i).getName()+" "+liststu.get(i).getAge());
        }

    }


}
