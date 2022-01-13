package cn.csuft.day07.demo01;

//不能通过接口实现类的对象，来调用接口当中的静态方法
//正确用法，通过接口名称，直接调用其中的静态方法
//接口名称.静态方法名
public class Demo03Interface {
    //因没有抽象方法，就可以不要重写
    public static void main(String[] args) {
        MyInterfaceStaticImpl myInterfaceStatic = new MyInterfaceStaticImpl();
      //  myInterfaceStatic.methodStatic();//错误写法
        //接口名称调用静态方法
        //静态跟对象没关系，今天只跟类有关系
        MyInterfaceStatic.methodStatic();
    }
}
