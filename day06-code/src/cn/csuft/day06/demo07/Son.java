package cn.csuft.day06.demo07;

public class Son extends Father{
    public Son(){

        //super();是调用父类的构造方法
        super();//在调用父类的无参数构造方法
      //  super(8);//在调用父类的有参数构造方法
        //只能选择父类的一种构造方法
        System.out.println("子类构造方法");
    }
    public void method(){
      //  super();//错误写法，只有子类的构造方法才可以调用父类的构造方法
    }

}
