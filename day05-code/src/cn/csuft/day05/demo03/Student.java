package cn.csuft.day05.demo03;

public class Student {
    private int id ;//学号
    private String name;
    private int age;
    static String  classroom;
    private  static int idCounter = 0;//学号计数器，每当new了一个新对象，计数器加1


    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.id=++idCounter;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Student() {
        this.id=++idCounter;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

//    public static String getClassroom() {
//        return classroom;
//    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

//    public static void setClassroom(String classroom) {
//        Student.classroom = classroom;
//    }
}
