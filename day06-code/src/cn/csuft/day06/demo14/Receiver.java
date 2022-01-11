package cn.csuft.day06.demo14;

import java.util.ArrayList;
import java.util.Random;

public class Receiver extends User{
    public Receiver() {
    }

    public Receiver(String name, int money) {
        super(name, money);
    }
    public void receive(ArrayList<Integer> list){
        //从多个红包当中随机抽取一个
        //随机获取一个集合当中的索引编号
        Random r = new Random();
        int index = r.nextInt(list.size());
        //从集合当中删除
        int delta=list.remove(index);
        //获取当前成员的金额
        int money=super.getMoney();
        //将得到的金额加上当前金额就是最后的金额
      super.setMoney(delta+money);




    }
}
