package cn.csuft.day04.demo05;

import java.util.ArrayList;
import java.util.Random;

//定义以指定格式打印集合的方法（ArrayList类型作为参数），
// 使用{}扩起集合，使用@分割每个元素，格式参照{元素@元素@元素}
public class Demo03ArrayListPrint {
    public static void main(String[] args) {
        Random r= new Random();
        ArrayList<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            int num = r.nextInt(100)+1;//随机生成1-100的整数
            list1.add(num);//把随机数填入集合list1
        }
        System.out.println(list1);//查看生成的随机数组
        System.out.println("==============================");//分割线
        listPrint(list1);//调用函数

    }
    public static void listPrint(ArrayList<Integer> list){//按照格式打印集合
        System.out.print("{ ");
        for (int i = 0; i < list.size(); i++) {
            if (i<list.size()-1){
                System.out.print(list.get(i)+" @ ");//如果不是集合的最后一个数就进行这个操作
            }
            else {
                System.out.print(list.get(i)+" }");
            }
        }
    }
}
