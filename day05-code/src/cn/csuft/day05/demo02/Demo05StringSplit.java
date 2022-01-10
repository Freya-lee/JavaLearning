package cn.csuft.day05.demo02;
//分割字符串的方法：
//public String[] split(String regex);按照参数的规则，将字符串切分为若干份
//这个regex其实是一个正则表达式,如果按照英文句号.进行分割，输入的应该是"\\."
public class Demo05StringSplit {
    public static void main(String[] args) {
        String str1 = "aaa,bbb,ccc";
      String[] array1=  str1.split(",");
        System.out.println(array1);
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }
        System.out.println("===================");
        //也可以按照空格分割
        String str2= "aaa bbb ccc";
        String[] array2 = str2.split(" ");
        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);
        }
        System.out.println("===================");
        //错误写法
        String str3 = "aaa.bbb.ccc";
        String[] array3 = str3.split(".");
        for (int i = 0; i < array3.length; i++) {
            System.out.println(array3[i]);//没有输出，因为根本没有按照.分割字符串
        }
        //这样是没办法得到相应的分割数组的，获取长度也为0
        System.out.println(array3.length);
        System.out.println("====================");
        //正确写法
        String[] array4 = str3.split("\\.");
        for (int i = 0; i < array4.length; i++) {
            System.out.println(array4[i]);
        }

    }

}
