package cn.csuft.day05.demo02;

import java.util.Scanner;

//键盘输入一个字符串，统计各种字符的出现次数,大小写字母要区分
//种类有：大写字母，小写字母，数字，其他
//思路：
//用scanner获取输入
//定义四个变量，存储四种字符出现的次数
//需要对字符串进行一个字一个字的检查，String-->char[]方法就是toCharArray（）
//遍历字符数字，对其种类进行判断,并且进行++动作
//
public class Demo07StringCount {
    public static void main(String[] args) {
        System.out.println("请输入字符串：");

        int countUpper = 0;
        int countLower = 0;
        int countNumber = 0;
        int countOther = 0;

        Scanner sc = new Scanner(System.in);
        String str= sc.next();
        char[] chars=str.toCharArray();//转换成字符数组
        for (int i = 0; i < chars.length; i++) {
            char ch = chars[i];
            if ('A'<=ch&&ch<='Z'){
                countUpper++;//如果是大写字母的情况
            }
            else if ('a'<=ch&&ch<='z'){
                countLower++;//是小写字母的情况
            }
            else if ('0'<=ch&&ch<='9'){
                countNumber++;
            }
            else {
                countOther++;
            }


        }

        System.out.println("大写字母出现："+countUpper+"次");
        System.out.println("小写字母出现："+countLower+"次");
        System.out.println("数字出现："+countNumber+"次");
        System.out.println("其他字符出现："+countOther+"次");

    }

}
