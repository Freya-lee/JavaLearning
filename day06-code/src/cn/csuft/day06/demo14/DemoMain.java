package cn.csuft.day06.demo14;

import java.util.ArrayList;

//发红包案例
//发红包有一个抽象类：用户类，里面有用户姓名，和用户相对应的金额
//然后有群主类和和普通成员类
//群主负责发红包的方法
//普通成员负责收红包的方法
//发红包的逻辑，三要素：
//1，返回值类型：ArrayList<Integer>
//2，方法名称：send
//3，参数列表：1，总共发多少钱 int totalMoney 2，分成多少分 int count
//方法
//public ArrayList<Integer> send (int totalMoney,int count){
//
//
//              ...//
//              }
//收红包的逻辑，三要素：
//1，返回值类型：void 只需要往普通用户的余额中添加相应的数目即可
//2，方法名称：receive
//3，参数列表：ArrayList<Integer>
// public void receive(ArrayList<Integer> list){
//     //...
//
// }
public class DemoMain {
    public static void main(String[] args) {
        Manager manager = new Manager("Lily",500);
        Receiver receiver1 = new Receiver("A",200);
        Receiver receiver2 = new Receiver("B",200);
        Receiver receiver3 = new Receiver("C",200);
        Receiver receiver4 = new Receiver("D",200);
        Receiver receiver5 = new Receiver("E",200);
        Receiver receiver6 = new Receiver("F",200);
//        manager.send(1500,6);

        manager.show();
        receiver1.show();
        receiver2.show();
        receiver3.show();
        receiver4.show();
        receiver5.show();
        receiver6.show();
        System.out.println("=======================");
        ArrayList<Integer> list = manager.send(153,6);
        System.out.println(list);
        receiver1.receive(list);
        System.out.println(list);
        receiver2.receive(list);
        System.out.println(list);
        receiver3.receive(list);
        System.out.println(list);
        receiver4.receive(list);
        System.out.println(list);
        receiver5.receive(list);
        System.out.println(list);
        receiver6.receive(list);
        System.out.println(list);
        manager.show();
        receiver1.show();
        receiver2.show();
        receiver3.show();
        receiver4.show();
        receiver5.show();
        receiver6.show();

    }


}
