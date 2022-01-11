package cn.csuft.day06.demo13;

public class DemoMain {
    public static void main(String[] args) {
      //  Animal animal = new Animal() ;//错误
     //   Dog dog = new Dog();//错误
        //这两个都是抽象类
        Dog2Ha ha = new Dog2Ha();//这是普通类，可以直接new对象
        ha.sleep();
        ha.eat();
        System.out.println("=====================");
        DogGolden golden = new DogGolden();
        golden.sleep();
        golden.eat();


    }
}
