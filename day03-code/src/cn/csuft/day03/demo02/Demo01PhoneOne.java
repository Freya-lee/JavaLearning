package cn.csuft.day03.demo02;

public class Demo01PhoneOne {
    public static void main(String[] args) {
        Phone ph1=new Phone();
        ph1.brand="iPhone 11";
        ph1.color="white";
        ph1.price=4999;
        System.out.println("Brand:"+ph1.brand+" Color:"+ph1.color+" Price:"+ph1.price);
        ph1.call("Lily");
        ph1.mail("Lucy");
    }
}
