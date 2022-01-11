package cn.csuft.day06.demo09;
//super关键字用来访问父类内容，而this关键字用来访问本类内容
//在本类的成员方法中，访问本类的成员变量
//在本类的成员方法中，访问本类的另一个成员方法
//在本类的构造方法中，访问本类的另一个构造方法
//在第三中要注意，this();必须在构造方法的第一个语句,而且是唯一一个（只能用一次）
public class Son extends Father{
    int num = 20;
    public void showNum(){
        int num = 10;
        System.out.println("局部变量的num："+num);
        System.out.println("本类变量的num："+this.num);
        System.out.println("父类当中的num："+super.num);
    }
    public  void methodA(){
        System.out.println("我是这个类的方法中另一个成员方法A");
    }
    public  void methodB(){
        System.out.println("我是这个类的方法中另一个成员方法B");
        this.methodA();//调用A方法。起到一个强调的作用，强调A方法不是来自父类而是来自本类中的另一个方法
    }
    public Son (int num){
        System.out.println("我是一个构造方法我有参数"+num);
    }
    public Son(){
       // this();必须在第一个
        this(9);
        System.out.println("我是那个没参数的构造方法");

    }


}
