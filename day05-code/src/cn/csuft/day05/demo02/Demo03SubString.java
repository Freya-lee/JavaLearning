package cn.csuft.day05.demo02;
//字符串的截取方法
//public String substring(int index);截取从参数位置一直到字符串末尾的字符串并且返回新字符串
//public String substring（int begin,int end）;截取从begin开始到end结束的中间的字符串
//备注，含首不含尾
public class Demo03SubString {


    public static void main(String[] args) {
        String str1= "HelloWorld";
        String str2=str1.substring(5);
        System.out.println("原来的字符串是："+str1);
        System.out.println("被截取的字符串是："+str2);
        System.out.println("截取之后的原字符串变为："+str1);
//所以截取之后原字符串是没有改变的
        String str3=str1.substring(2,6);
        System.out.println("被截取的内容是："+str3);
        //下面这种写法，字符串的内容是没有改变的
        //下面有两个字符串："Hello"，"Java"
        //strA当中保存的是地址值
        //后面改变了，其实只是strA的地址值改变了
        // 原来的字符串还在字符串常量值当中
        //字符串一直不变，在改变的只是变量里面存储的地址值
        String strA = "Hello";
        System.out.println(strA);
        strA = "Java";
        System.out.println(strA);

    }
}
