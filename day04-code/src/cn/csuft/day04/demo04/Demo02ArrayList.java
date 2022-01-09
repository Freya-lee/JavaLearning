package cn.csuft.day04.demo04;

import java.util.ArrayList;

//数组的长度不可以发生改变
//但是ArrayList集合的长度是可以发生改变的。
//导包创建使用
//ArrayList<E>
//E：泛型,也就是在集合中的所有元素，全是统一的类型
//注意，泛型只能是引用类型，不能是基本类型
public class Demo02ArrayList {
    public static void main(String[] args) {
        //创建来一个ArrayList集合，集合名称叫list，里面装的全是字符串String类型的数据
        //从jdk1，7开始，右侧的尖括号可以不写内容，但是<>本身还是要写的
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list);//不是一个地址值，而是内容
        //如何向ArrayList中添加数据
        list.add("Lisa");
        list.add("Baby");
        list.add("Nancy");
        System.out.println(list);

    }
}
