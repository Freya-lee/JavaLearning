package cn.csuft.day07.demo06;
//如何才能知道一个父类引用对象本来是什么类？
//格式：
//对象 instanceof 类型
//这样会得到一个boolean值的结果，也就是说判断前面的对象能不能当作后面的类型的实例
public class Demo02Instanceof {
    public static void main(String[] args) {
        Animal animal = new Dog();//本来是一只猫
        animal.eat();//猫吃鱼
        System.out.println("================");
        //如果需要调用子类特有的方法，那么就需要向下转型
        //判断一下animal是否是Cat类型
        if (animal instanceof Cat){
            Cat cat = (Cat) animal;
            cat.eat();
            cat.catchMouse();
        }
        if (animal instanceof Dog){
            Dog dog = (Dog) animal;
            dog.watchHouse();
            dog.eat();
        }
        giveMeAPet(new Cat());

    }
    public static void giveMeAPet(Animal animal){
        if (animal instanceof Cat){
            System.out.println("养了一只猫");
            //让猫捉老鼠
            //但是现在左边的是Animal
            //所以需要向下转型
            Cat cat = (Cat) animal;
            cat.catchMouse();
            cat.eat();
        }
        if (animal instanceof  Dog){
            System.out.println("养了一只狗");
            Dog dog = (Dog) animal;
            dog.watchHouse();
            dog.eat();
        }

    }
}
