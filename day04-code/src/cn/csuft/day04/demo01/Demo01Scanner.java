package cn.csuft.day04.demo01;

import java.util.Scanner;
//Scanner类的功能,可以实现键盘输入到程序当中
//引用类型的一般使用步骤
//导包，创建，使用
//导包：import 包路径.类名称
//如果要使用目标类，和当前类位于同一个包下，则可以省略导包语句不写
//只有java。lang包下的内容不需要导包，其他的包都需要imort导入
//创建： 类名称 对象名 = new 类名称（）
//使用：对象名.成员方法名（）
public class Demo01Scanner {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);//System.in意思就是从键盘输入
        //获取键盘输入的一个int数字：int num = sc.nextInt();
        int num = sc.nextInt();
        System.out.println("输入的数字是："+num);
        //获取键盘输入的一个字符串： String str = sc. next();
        String str = sc. next();
        System.out.println("输入的字符串是："+str);
    }
}
