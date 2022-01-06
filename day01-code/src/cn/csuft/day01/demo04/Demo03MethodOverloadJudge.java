package cn.csuft.day01.demo04;

public class Demo03MethodOverloadJudge {
    public static void open(){}//正确重载
    public static void open(int a ){}//正确重载
   // static void open(int a ,int b){}
    public static void open(double a, int b){}//正确重载
  //  public static void open(int a ,double b){}
   // public  void open(int a ,double d){}//错误，与上一行冲突
    public static void OPEN(){}//不是重载
 //   public static void open(int i ,int j){}//错误，与第三行冲突

}
