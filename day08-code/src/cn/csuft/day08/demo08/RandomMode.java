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
        for (int i = 0; i < totalCount; i++) {
            list.add(r.nextInt(1)+(2*(totalMoney/totalCount-i-1)));
        }
        return list;
    }
}
