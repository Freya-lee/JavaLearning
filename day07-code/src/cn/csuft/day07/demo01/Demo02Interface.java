package cn.csuft.day07.demo01;
//接口的默认方法，可以通过接口的实现类对象直接调用
//接口的默认方法，也可以通过接口的实现类进行覆盖重写
public class Demo02Interface {
    public static void main(String[] args) {
        MyInterfaceDefaultA interfaceDefaultA = new MyInterfaceDefaultA();
        interfaceDefaultA.methodA();
        //调用默认方法，如果实现类当中没有，就会向上找调用接口当中的默认方法
        interfaceDefaultA.methodDefault();
        MyInterfaceDefaultB interfaceDefaultB= new MyInterfaceDefaultB();
        interfaceDefaultB.methodDefault();
    }
}
