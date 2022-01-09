package cn.csuft.day04.demo03;

import java.util.Random;
import java.util.Scanner;

//用代码模拟猜数字的游戏
//1，产生一个随机数字
//2，告诉程序猜的是多少
//3，获取输入的数字
//4，比较两个数字，判断是大还是小还是整个猜对了
public class Demo04Random {


    public static void main(String[] args) {
        Random r= new Random();
        int result = r.nextInt(100)+1;//范围为1-100的整数；
        System.out.println(result);
        System.out.println("请输入你猜的数字：");
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();//把猜的数字存入n中
       while (n!=result){
           if (n<result){
               System.out.println("猜小了，请重新输入：");
               n  = sc.nextInt();
           }
           else {
               System.out.println("猜大了，请重新输入：");
               n = sc.nextInt();
           }
       }
        System.out.println("你猜对了！");
    }
}
