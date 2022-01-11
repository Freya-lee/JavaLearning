package cn.csuft.day06.demo02;
//在父子类继承关系当中，如果成员变量重名，则创建子类对象时，访问有两种方式
//直接通过子类对象访问成员变量
//点号左边是谁就优先用谁，没有则向上找
//间接通过成员方法访问成员变量
//该方法属于谁，就优先用谁，没有再向上找
public class Demo01ExtendsField {


    public static void main(String[] args) {
        Father father = new Father();//创建父类对象
        System.out.println(father.numFather);//只能使用父类的东西，没有任何子类的内容
        Son son =new Son();
        System.out.println(son.numFather);
        System.out.println(son.numSon);//父类的和自己的都可以使用
        System.out.println(son.num);//如果有重名的，那么优先访问自己的，如果没有就向上走
        System.out.println(son.num2);//它没有num2 那么就去父类当中找
        System.out.println("======================");
        son.methodSon();//这个方法是子类的，优先使用子类的，没有再往上找
        son.methodFather();//这个方法自己没有，就去父类当中找，那么输出的就是父类的成员变量

    }
}
