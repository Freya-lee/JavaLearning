package cn.csuft.day04.demo04;

public class Demo01Array {
    public static void main(String[] args) {
        //首先创建一个长度为三的数组
        Person [] array = new Person[3];
        Person one = new Person("Lina",23);
        Person two = new Person("Tina",25);
        Person three = new Person("Lana",13);
        //把三个对象放入数组
        array[0]= one;
        array[1]= two;
        array[2]= three;
        //存的都是地址值
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[0].getAge()+"  "+array[0].getName());
        System.out.println(array[1].getAge()+"  "+array[1].getName());
        System.out.println(array[2].getAge()+"  "+array[2].getName());
        //数组有有一个缺点，一旦创建，长度不可以改变
    }
}
