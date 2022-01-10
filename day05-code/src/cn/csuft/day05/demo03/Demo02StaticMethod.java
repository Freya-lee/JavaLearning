package cn.csuft.day05.demo03;
//一旦使用static修饰成员方法，那么这就成为了静态方法
//静态方法不属于对象，而是属于类的
//如果没有static修饰，那么必须首先创建对象，然后通过对象才能使用它
//有static修饰，最好使用类名称来调用它
//不论是成员变量还是成员方法，如果使用static进行此时，都建议使用类名称调用
//注意：
//静态只能直接访问静态，不能直接访问非静态。
//原因：因为内存非当中，先有的静态变量，后才有的非静态变量
//当静态方法存在的时候，非静态变量也许还没有生成
//静态方法中是不能写this的
//原因：因为this代表当前对象，在类存在的时候，可能还没有当前对象
public class Demo02StaticMethod {
    public static void main(String[] args) {
        MyClass obj = new MyClass();//首先创建对象
        //然后才能使用没有static关键字的方法
        obj.method();
        //对于静态方法来说，可以通过对象名进行调用，也可以通过类名称来进行调用
        obj.methodStatic();//正确但是不建议这样使用，这种写法在编译之后也会自动翻译成为类来调用的方法
        MyClass.methodStatic();//正确，建议这样使用
        //对于本类当中的静态方法，可以省略类名称
        myMethod();
        //但是在编译之后也会翻译为Demo02StaticMethod.myMethod();
    }
    public static void myMethod(){
        System.out.println("自己的方法");
    }
}
