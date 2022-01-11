package cn.csuft.day06.demo14;

import java.util.ArrayList;

public class Manager extends User{
    public Manager(){

    }
    public Manager(String name,int money){
        super(name, money);
    }
    public ArrayList<Integer> send (int totalMoney, int count){
        //首先需要一个集合，用来存储若干个红包的金额
        ArrayList<Integer> list = new ArrayList<>();
        //要查看一下群主自己有多少钱
        int leftMoney = super.getMoney();
        if (totalMoney<=leftMoney) {
            super.setMoney(leftMoney - totalMoney);
            int num = totalMoney / count;
            int mod = totalMoney % count;//余数，甩下的零头
            //剩下的零头放进最后一个红包中

            for (int i = 0; i < count; i++) {
                if (i == count - 1) {
                    list.add(num + mod);
                } else {
                    list.add(num);
                }
            }
        }
        else {
            System.out.println("余额不足");
            return list;
        }
        return list;
    }
}
