package cn.csuft.day04.demo05;
//题目：生成6个1-33之间的随机数，添加到集合，并遍历集合。

import java.util.ArrayList;
import java.util.Random;

public class Demo01ArrayListRandom {
    public static void main(String[] args) {
        Random r= new Random();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            int num = r.nextInt(33)+1;
            list.add(num);
        }
        System.out.println(list);
        //遍历集合
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
