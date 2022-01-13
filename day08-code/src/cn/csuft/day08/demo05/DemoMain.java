package cn.csuft.day08.demo05;
//如果接口的实现类（或者是父类的子类）只需要使用一次
//那么这种情况下就可以省略掉该类的定义，而改为使用【匿名内部类】
//匿名内部类的定义格式
//接口名称 对象名 = new 接口名称(){
//      //  覆盖重写接口的所有方法
//
// }
public class DemoMain {
    public static void main(String[] args) {
        MyInterfaceImpl myInterface = new MyInterfaceImpl();
        myInterface.method();
        MyInterface myInterface1 = new MyInterface() {
            @Override
            public void method() {
                System.out.println("匿名内部类");
            }
        };
        new MyInterface(){

            @Override
            public void method() {
                System.out.println("我是匿名对象的一个方法，而且我还是匿名内部类");
            }
        }.method();//马上调用了自己方法，但是只能调用方法的一个，假设匿名内部类里面有很多方法，你用的还是一个i匿名对象，那么你使用的时候也只能从这些方法里面选一个
    }
}
