package cn.csuft.day03.demo02;
//定义一个类，用来模拟手机这一事物
//成员变量：品牌，价格，颜色
//成员方法：打电话，发短信
public class Phone {
    //成员变量
    String brand;
    int price;
    String color;
    //成员方法
    public void call(String who){
        System.out.println("I am calling with "+who);
    }
    public void mail(String who){
        System.out.println("This mail is from "+who);
    }



}
