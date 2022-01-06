package cn.csuft.day01.demo03;
//使用方法的注意事项：
// 1。定义方法在类当中，但是不能在方法中仔定义方法，不能嵌套
// 2。定义方法的顺序无所谓
// 3。定义方法之后需要直接调用才会执行
// 4。如果方法有返回值，那么必须写上return 返回值 ；不能没有
// 5。return后面的返回值数据，必须和方法后面的返回值类型，对应起来
// 6。对于一个没有返回值的方法，就不能写return后面的返回值，只能写return自己。
// 7.对于方法中最后一行的return 可以省略不写
public class Demo04MethodNotice {
    public static int method1(){
        return 10;
    }
    public static void method2(){
        return;//不能有返回值，只是结束方法而已。
    }
    public static void method3(){
        System.out.println("AAA");
        System.out.println("BBB");
       // return;//return这一个可以省略不写
    }
    public  static int getMax(int a, int b){
//        if (a>b)
//            return a;
//        else
//            return b;
        return a>b?a:b;
    }
}
