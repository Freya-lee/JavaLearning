package cn.csuft.day06.demo04;
//在父子类继承关系中，创建子类对象，访问成员方法的规则
//创建的对象是谁，就优先使用谁，没有就向上找
//注意：无论是成员变量还是成员方法，如果没有就向上找父类的额，没有父类向下找子类的
//重写（Override）：
//在继承关系当中，方法名称一样，参数列表也一样，
//重写（Override）：重写发生在继承关系当中，参数列表也一样。方法的覆盖，覆写
//重载（Overload）：重载方法名称一样，但是参数列表不一样
//方法的覆盖重写的特点，创建的是子类对象，就优先使用子类的方法
public class Demo01ExtendsMethod {


    public static void main(String[] args) {
        Son son =new Son();
        son.methodSon();
        son.methodFather();
        son.method();//重名的时候，优先使用自己的，没有就向上找。
        //
    }
}
