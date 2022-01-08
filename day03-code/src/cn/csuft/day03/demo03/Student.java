package cn.csuft.day03.demo03;

public class Student {
    private String name;
    private int age;
    private boolean male;//是不是男生
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setMale(boolean male) {
        this.male = male;
    }

    public boolean isMale() {
        return male;
    }//使用布尔值的时候，get方法必须使用is
}
