package cn.csuft.day04.demo05;

import java.util.ArrayList;
import java.util.Random;

//用一个大集合存入20个随机数字，
// 然后筛选其中的偶数元素，放到小集合当中，
// 要求使用自定义的方法进行筛选
public class Demo04ArrayListReturn {
    public static void main(String[] args) {
        Random r= new Random();
        ArrayList<Integer> list1= new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            int num= r.nextInt(100)+1;
            list1.add(num);
        }
        System.out.println(list1);
        System.out.println("=====================================");
//        ArrayList<Integer> list2 = new ArrayList<>();
//        list2.add(intReturn(list1));
//        System.out.println(list2);
        ArrayList<Integer> list2 = intReturn(list1);//list2用来接收结果数组
        System.out.println(list2);


    }
    public static ArrayList<Integer> intReturn(ArrayList<Integer> list){
        ArrayList<Integer> result= new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
           if (list.get(i)%2==0){
               result.add(list.get(i));//如果是偶数，就添加到结果数组当中
           }
        }
             return result;//将结果数组返回

    }
}
