package cn.csuft.day03.demo02;
//两个对象使用同一个方法
public class Demo02PhoneTwo {
    public static void main(String[] args) {
        Phone ph1=new Phone();
        ph1.brand="iPhone 11";
        ph1.color="white";
        ph1.price=4999;
        System.out.println("Brand:"+ph1.brand+" Color:"+ph1.color+" Price:"+ph1.price);
        ph1.call("Lily");
        ph1.mail("Lucy");
        System.out.println("==============");
        Phone ph2=new Phone();
        ph2.brand="Xiaomi 13";
        ph2.color="white";
        ph2.price=1999;
        System.out.println("Brand:"+ph2.brand+" Color:"+ph2.color+" Price:"+ph2.price);
        ph2.call("Tom");
        ph2.mail("Judy");
    }
}//这个时候两个没有产生任何联系
