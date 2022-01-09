package cn.csuft.day04.demo04;

import java.util.ArrayList;

//遍历集合
public class Deno04ArrayListEach {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list);//[]
        //向集合中添加元素
        list.add("Lina");
        list.add("Nana");
        list.add("Tom");
        //遍历集合
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}

