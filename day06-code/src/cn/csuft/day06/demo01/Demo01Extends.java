package cn.csuft.day06.demo01;
//在继承的关系中，子类就是一个父类，也就是说，子类可以被当作父类看待
//例如：父类是员工子类是讲师，那么讲师就是一个员工
//
//继承的格式：public class 子类名称 extends 父类名称 {
//
//                          }
public class Demo01Extends {

    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        //创建了一个子类对象
      //  teacher.method();//teacher当中虽然什么都没写，但是它继承了父类employee的方法
        //创建一个助教对象
        Assistant assistant =new Assistant();
        assistant.method();
    }
}
