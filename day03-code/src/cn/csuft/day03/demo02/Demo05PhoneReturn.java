package cn.csuft.day03.demo02;
//对象作为方法的返回值
public class Demo05PhoneReturn {
    public static void main(String[] args) {
        Phone two = getPhone();
        System.out.println(two.price);
        System.out.println(two.color);
        System.out.println(two.brand);
    }
    public static Phone getPhone(){
        Phone one = new Phone();
        one.brand= "Xiaomi";
        one.price=2999;
        one.color="Pink";
        return one;
//返回值其实就是对象的地址值
    }
}
