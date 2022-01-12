package cn.csuft.day07.demo06;
//向上转型一定是安全的，没有问题的，正确的。但是也有一个弊端
//一旦向上转型为父类，那么就无法调用子类原本特有的内容
//解决方法
//使用对象的向下转型【还原】
public class Demo01Main {
    public static void main(String[] args) {
        //对象的向上转型，就是父类引用指向子类
        Animal animal = new Cat();
        animal.eat();
     //   animal.catchMouse();//错误写法，animal中没有这个方法，所以调用不了
        //所以向下转型
        Cat cat = (Cat) animal;
        cat.catchMouse();
    }
}
