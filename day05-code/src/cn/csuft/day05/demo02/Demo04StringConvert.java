package cn.csuft.day05.demo02;
//String当中与转换相关的常用方法有
//public char[] toCharArray();将当前字符串拆分为字符数组作为返回值
//public Byte[] getBytes();获得当前的字符串底层的字节数组
//public String[] replace(CharSequence oldString,CharSequence newString);
//将所有出现的老字符串替换成为新字符串，返回替换之后的结果，新字符串
//charSequence意思就是可以使用字符串类型，现在就把它当中字符串类型就可以
public class Demo04StringConvert {
    public static void main(String[] args) {
        char [] chars="Hello".toCharArray();
        System.out.println(chars[4]);
        System.out.println(chars.length);
        System.out.println("===================");
        //转化成为字节数组
        byte[] bytes= "abc".getBytes();
        System.out.println(bytes[0]);
        System.out.println("===================");

        String str1= "How do you do?";
        String str2 = str1.replace("o","aa");
        System.out.println(str2);
        //看看原来的变了没有
        System.out.println(str1);//没有改变




    }

}
