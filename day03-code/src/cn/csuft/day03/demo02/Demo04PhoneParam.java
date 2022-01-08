package cn.csuft.day03.demo02;

public class Demo04PhoneParam {
    public static void main(String[] args) {
        Phone one = new Phone();
        one.price= 4999;
        one.color="Black";
        one.brand="VIVO X20";
        method(one);
    }
    public static void method(Phone param){
        System.out.println(param.brand);
        System.out.println(param.color);
        System.out.println(param.price);

    }
    //当一个对象作为参数传递进方法的时候，传递进去的其实是对象的地址值
}
