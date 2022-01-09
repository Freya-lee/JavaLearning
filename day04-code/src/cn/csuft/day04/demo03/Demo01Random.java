package cn.csuft.day04.demo03;

import java.util.Random;

//导包创建使用
//导包：import java.util.Random
//创建：Random r= new Random();//小括号中留空即可
//使用：获取一个随机int数字(范围是int的所有范围) ：int num= r.nextInt();
//获取一个随机数，但是有范围：左闭右开区间：int num = r.nextInt(3)//这个的含义就是[0,3)也就是0，1，2
public class Demo01Random {
    public static void main(String[] args) {
        Random r= new Random();
        int num = r.nextInt();
        System.out.println("随机数是："+num);
    }
}
