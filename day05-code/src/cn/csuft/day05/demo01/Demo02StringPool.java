package cn.csuft.day05.demo01;
//字符串常量池，程序当中直接写上的双引号字符串，就在字符串常量池中
//对于基本类型来说，==是进行数值比较的
//对于引用类型来说，==是进行【地址值】的比较
//双引号直接写的在常量池当中，new的不在常量池当中
public class Demo02StringPool {
    public static void main(String[] args) {
        String str1= "abc";
        String str2= "abc";

        char[] charArray = {'a','b','c'};
        String str3  = new String(charArray);
        //new了，这就是一个新的地址值了
        System.out.println(str1==str2);//true
        System.out.println(str1==str3);//false
        System.out.println(str2==str3);//false
        //其实str1和str2都是指向同一个常量的地址值
        // 意思就是他们指向的是"abc"的地址值，要把"abc"看成一个常量
    }
}
