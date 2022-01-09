package cn.csuft.day04.demo04;

import java.util.ArrayList;

//ArrayList的常用方法
//添加：public boolean add（E e）//向集合中添加元素，参数类型和泛型一致
//获取：public E get（int index）//从集合当中获取元素，参数是索引编号，返回值就是对应位置的元素
//删除：public E remove（int index）//返回值就是被删除的元素
//获取长度：public int size （）//获取集合的长度，返回值是集合中包含的元素个数
public class Demo03ArrayListMethod {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list);//[]
        //向集合中添加元素
        list.add("Lina");
        list.add("Nana");
        list.add("Tom");
       boolean success= list.add("Tony");
        System.out.println(list);
        System.out.println(list.size());
        System.out.println("添加的动作是否成功："+success);
        //获取元素值
      String a=  list.get(0);
        System.out.println(a);
        //删除一个元素
       String b= list.remove(2);
        System.out.println(b);
        System.out.println(list);
        System.out.println(list.size());

    }

}
