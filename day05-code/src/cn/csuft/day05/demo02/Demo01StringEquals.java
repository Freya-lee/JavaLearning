package cn.csuft.day05.demo02;
//常用的字符串比较方法
//==是进行字符串的地址值比较
//public boolean equals(Objects obj),参数可以是任何对象
// 只有参数是一个字符串并且内容相同的才会给出ture
//如果比较的是一个常量和一个变量相比较，最好把常量写在前面，不然容易出现空指针异常。
// 当变量为null的时候，就会出现空指针异常

//public boolean equalsIgnoreCase(String str),忽略大小对内容进行比较
public class Demo01StringEquals {
    public static void main(String[] args) {
        String str1= "Hello";
        String str2= "Hello";
        char [] charArray={'H','e','l','l','o'};
        String str3=new String(charArray);

        System.out.println(str1.equals(str2));//true
        System.out.println(str1.equals(str3));//true
        System.out.println(str2.equals(str3));//true

        System.out.println("Hello".equals(str1));//true
        System.out.println("hello".equals(str2));//false
        //用equals比较的都是字符串的内容，跟字符串的地址值没关系
        System.out.println("=================");
     //   String str5 =null;
      //  System.out.println(str5.equals("abc"));//最好不要这样写，容易出现空指针异常
   //    System.out.println("abc".equals(str5));//这样写比较好

        System.out.println("hello".equalsIgnoreCase("Hello"));//忽略大小写进行比较
        System.out.println("hello".equals("Hello"));//不忽略大小写进行比较


    }
}
