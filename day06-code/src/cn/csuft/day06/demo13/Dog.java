package cn.csuft.day06.demo13;
//子类也是一个抽象类
public  abstract class Dog extends Animal{

//
//    @Override
//    public void sleep() {
//
//    }

    @Override
    public void eat() {
        System.out.println("狗吃屎");
    }

}
