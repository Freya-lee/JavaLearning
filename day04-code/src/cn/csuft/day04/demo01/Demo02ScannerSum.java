package cn.csuft.day04.demo01;

import java.util.Scanner;

//键盘输入两个int数字并且进行求和
public class Demo02ScannerSum {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1,num2;
        System.out.println("请输入第一个数字：");
        num1=sc.nextInt();
        System.out.println("请输入第二个数字：");
        num2=sc.nextInt();
        System.out.println(num1+"+"+num2+"的和为"+(num1+num2));
    }
}
