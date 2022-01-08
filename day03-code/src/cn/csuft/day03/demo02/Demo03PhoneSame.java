package cn.csuft.day03.demo02;
//两个对象有相同的引用
public class Demo03PhoneSame {
    public static void main(String[] args) {
        Phone ph1=new Phone();
        ph1.brand="iPhone 11";
        ph1.color="white";
        ph1.price=4999;
        System.out.println("Brand:"+ph1.brand+" Color:"+ph1.color+" Price:"+ph1.price);
        ph1.call("Lily");
        ph1.mail("Lucy");
        System.out.println("==============");
        Phone ph2=ph1;//这行代码被修改了，现在ph2里面也是ph1的引用
        //现在不给ph2赋值，直接看ph2里面是什么内容
        System.out.println("Brand:"+ph2.brand+" Color:"+ph2.color+" Price:"+ph2.price);
        System.out.println("==============");
        ph2.brand="Xiaomi 13";
        ph2.color="white";
        ph2.price=1999;
        System.out.println("Brand:"+ph2.brand+" Color:"+ph2.color+" Price:"+ph2.price);
        System.out.println("==============");
        System.out.println("Brand:"+ph1.brand+" Color:"+ph1.color+" Price:"+ph1.price);

            //ph2改变了，ph1也会跟着改变
        //两个对象引用指向了同一个对象空间

    }
}
