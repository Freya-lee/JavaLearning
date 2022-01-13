package cn.csuft.day07.demo06;

public class Cat extends Animal{

    @Override
    public void eat() {
        System.out.println("吃鱼");
    }
    //子类特有的方法

    public void catchMouse(){
        System.out.println("猫捉老鼠");
    }
}
