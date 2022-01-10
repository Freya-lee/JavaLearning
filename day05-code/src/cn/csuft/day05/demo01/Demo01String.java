package cn.csuft.day05.demo01;
//程序当中所有的双引号当中的字符串，都是String类的对象
//就算没有new，也是String类的对象

//字符串的特点【重点】
//字符串的内容永不可更
//正是因为不可改变，所以，字符串是可以共享使用的
//字符串效果上，相当于char[]字符数组，但是底层原理是byte[]字节数组


//创建字符串的常见3+1种方式
//三种构造方法
//1,public String()//创建一个空白字符串，不含有任何内容
//2,public String(char[] array)//根据字符数组的内容，未创建对应的字符串
//3,public String(byte[] array)//根据字节数组的内容，未创建对应的字符串
//一种直接创建：
//String str = "Hello"//右边直接用双引号
public class Demo01String {
    public static void main(String[] args) {
        //创建字符串
        //使用空参数构造方法
        String str1 = new String();
        System.out.println("第一个字符串："+str1);
        //根据字符数组创建字符串

        //创建字符数组
        char[] charArray = {'a','b','c'};
        String str2 = new String(charArray);
        System.out.println("第二个字符串"+str2);

        //根据字节数组创建字符串

        //创建字节数组
        byte[] byteArray = {98,99,125};
        String str3 = new String(byteArray);
        System.out.println("第三个字符串："+str3);

        //直接创建
        String str = "Hello,World";
        System.out.println("第四个字符串:"+str);

    }

}
