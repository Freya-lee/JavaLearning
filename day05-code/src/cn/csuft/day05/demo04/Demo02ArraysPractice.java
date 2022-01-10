package cn.csuft.day05.demo04;

import java.util.Arrays;

//使用arrays相关的API，将一个随机字符串中的所有字符升序排列，并倒序打印
public class Demo02ArraysPractice {
    public static void main(String[] args) {
        String str1 = "shdsfghdfgft";
        char[] chars = str1.toCharArray();
        Arrays.sort(chars);
        System.out.println(Arrays.toString(chars));
        for (int i = chars.length-1;i>0;i--){
            System.out.print(chars[i]+" ");
        }
    }

}
