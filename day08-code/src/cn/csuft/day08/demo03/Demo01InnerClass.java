package cn.csuft.day08.demo03;
//如果一个事物内部包含另一个事物，那么这就是一个类内部包含另一个类
//例如：身体和心肺的关系，发动机和汽车的关系
//内部类的分类
//成员内部类
//局部内部类（包含匿名内部类）
//成员内部类的定义格式：
//修饰符 class 外部类名称{
//  修饰符 class 内部类名称 {
//            //...
//         }
//     //...
// 注意：内用外，可以随意访问，但是外用内，需要内部类对象
//如何使用成员内部类
//1，间接
//在外部类的方法当中使用内部类，然后main只是调用外部类的方法
//2,直接，
//创建一个内部类，格式：
//[外部类名称.内部类名称 对象名 = new 外部类名称().内部类名称();]
public class Demo01InnerClass {
    public static void main(String[] args) {
        Body body = new Body();//创建一个外部类的对象
        //通过调用外部类的方法，这个方法里面有内部类的方法，于是间接调用类内部类的方法
        body.methodBody();
        System.out.println("====================");
        Body.Heart heart = new Body().new Heart();
        heart.beat();

    }
}
