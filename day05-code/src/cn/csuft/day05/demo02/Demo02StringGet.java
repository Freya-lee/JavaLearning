package cn.csuft.day05.demo02;
//一些常用的获取字符串的方法
//public int length();//获取字符串含有的字符个数，拿到字符串的长度
//public String concat(String str);//将当前字符串和参数字符串拼接成为返回值的新字符串
//public char charAt(int index);//获取指定索引位置的单个字符串，（索引从0开始）；
//public int indexOf(String str);//查找参数字符串在字符串在本字符中首次出现的索引位置，如果没有就返回-1值
public class Demo02StringGet {
    public static void main(String[] args) {
        //获取字符串长度
        System.out.println("说的那地方回复风格".length());
        //拼接字符串
        System.out.println("hello".concat(" world"));
        //返回指定索引位置的单个字符串
        String str= "Hello,World!";
        System.out.println(str.charAt(5));//索引是从0开始的
        //返回某个字符的索引位置
        System.out.println(str.indexOf('l'));//只会返回第一次出现的位置
        System.out.println(str.indexOf("p"));



    }
}
