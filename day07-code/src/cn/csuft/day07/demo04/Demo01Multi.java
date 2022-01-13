package cn.csuft.day07.demo04;
//代码当中体现多态性，其实就是一句话，父类引用指向子类对象
//格式：
//父类名称 对象名 = new 子类名称（）；
//或者
//接口名称 对象名 = new 实现类名称（）；
public class Demo01Multi {
    public static void main(String[] args) {
        //多态的写法
        //左侧父类的引用指向了右侧子类的对象
        Father obj = new Son();
        //上转型对象
        obj.method();
        //会优先使用子类的方法
        //毕竟他还是子类的对象
        obj.methodFather();//这个子类没有，所以就去找父类的

    }
}
