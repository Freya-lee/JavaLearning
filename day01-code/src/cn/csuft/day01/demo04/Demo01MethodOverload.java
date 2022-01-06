package cn.csuft.day01.demo04;
//对于功能类似的方法，因为参数列表不一样，却需要记住很多不同的方法名称，太麻烦
//方法的重载
//多个方法的名称一样，但是参数列表不一样
//好处：只要记住一个方法名称就可以完成不同的功能
//方法重载与下列因素有关
//1.参数个数不同
//2.参数类型不同
//3.参数的多类型顺序不同public static int sum(int a ,double b)
//方法重载与下列因素无关
//1.与参数名称无关
//2.与方法的返回值类型无关
//3.与修饰符无关
public class Demo01MethodOverload {
    public static void main(String[] args) {
        System.out.println( sum(1,2,3,4));

    }
    public  static  int sum(int  a,int b){
        System.out.println("有两个参数的方法执行");
        return a+b;
    }
    public static  int sum(int a ,int b,int c){
        System.out.println("有三个参数的方法执行");
        return  a+b+c;
    }
    public  static int sum(int a ,int b,int c,int d){
        System.out.println("有四个参数的方法执行");
        return a+b+c+d;
    }
    public static int sum(int a ,double b){
        System.out.println("有四个参数的方法执行");
        return (int) (a + b);
    }


}
