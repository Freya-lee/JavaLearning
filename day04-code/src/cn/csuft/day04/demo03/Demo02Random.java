package cn.csuft.day04.demo03;

import java.util.Random;

//获取一个随机数，但是有范围：左闭右开区间：int num = r.nextInt(3)//这个的含义就是[0,3)也就是0，1，2
public class Demo02Random {
    public static void main(String[] args) {
        Random r=new Random();
        int num=r.nextInt(3);
        System.out.println("随机数为："+num);
    }
}
