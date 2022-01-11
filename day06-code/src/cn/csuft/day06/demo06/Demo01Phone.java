package cn.csuft.day06.demo06;

public class Demo01Phone {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.call();
        phone.mail();
        phone.show();
        System.out.println("================");
        NewPhone newPhone= new NewPhone();
        newPhone.show();
        newPhone.mail();
        newPhone.call();
    }
}
