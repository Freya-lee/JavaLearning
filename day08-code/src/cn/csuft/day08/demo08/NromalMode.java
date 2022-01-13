package cn.csuft.day08.demo08;

import cn.csuft.day08.red.OpenMode;

import java.util.ArrayList;

public class NromalMode implements OpenMode {
    @Override
    public ArrayList<Integer> divide(int totalMoney, int totalCount) {
        int piece = totalMoney/totalCount;//每个人分到的钱数
        int mod= totalMoney%totalCount;//除下来多余的钱数这个给群主
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < totalCount; i++) {
            if (i==totalCount-1){
                list.add(piece+mod);
            }
            else {
                list.add(piece);
            }
        }
        return list;

    }
}
