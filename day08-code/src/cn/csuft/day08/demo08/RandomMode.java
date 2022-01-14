package cn.csuft.day08.demo08;

import cn.csuft.day08.red.OpenMode;

import java.util.ArrayList;
import java.util.Random;

public class RandomMode implements OpenMode {
    @Override
    public ArrayList<Integer> divide(int totalMoney, int totalCount) {
        ArrayList<Integer> list = new ArrayList<>();
        //随机分配，最少一分钱
        //最多不大于剩下金额平均数的二倍一半的二倍
        Random r = new Random();
        //totalMoney不变Count也不变
        int leftMoney = totalMoney;
        int leftCount = totalCount;
        //随机发前n-1个
        for (int i = 0; i < totalCount-1; i++) {
            int money = r.nextInt(leftMoney/leftCount*2)+1;
            list.add(money);
            leftMoney-=money;
            leftCount--;
        }
        list.add(leftMoney);
        return list;
    }
}
