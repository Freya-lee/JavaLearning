package cn.csuft.day04.demo04;

import java.util.ArrayList;
//如果希望ArrayList中存储基本类型的数据，必须使用对应的包装类
//基本类    包装类（引用类型，包装类位于：java.lang包下）
//byte     Byte
//short    Short
//int      Integer
//long     Long
//float    Float
//double   Double
//char     Character
//boolean  Boolean

public class Deno05ArrayListBasic {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        //下面是错误写法，泛型中只能是引用类型，不能是基本类型
       // ArrayList<int> list1 = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        System.out.println(list1);
        list1.add(2);
        list1.add(5);
        list1.add(54);
        System.out.println(list1);
        System.out.println(list1.get(0));
    }
}
