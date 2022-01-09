package cn.csuft.day04.demo01;
//判断是三个数字中谁最大
import java.util.Scanner;

public class Demo03ScannerMax {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("请输入第一个数字：");
        int a= sc.nextInt();
        System.out.println("请输入第二个数字：");
        int b= sc.nextInt();
        System.out.println("请输入第三个数字：");
        int c= sc.nextInt();

        System.out.println("三个数字中最大的是："+((a>=b?a:b)<=c?c:(a>=b?a:b)));

    }


}
