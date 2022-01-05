package cn.csuft.day01.demo02;
/*
题目要求  1：定义一个方法，用来求两个数字之和.（你帮我算，算完知乎把结果告诉我）
         2：定义一个方法，打印求两个数字之和. (直接计算然后打印)

*
* */
public class Demo04MethodReturn {
    public static void main(String[] args) {
        System.out.println("结果为："+sub(3,4));
        sub2(4,5);
    }
    //1
    //负责两个数字相加
    //返回值int
    public static int sub(int a,int b){
        return a+b;
    }
    //2
    //直接打印俩个数字之和
    //没有返回值
    public static void sub2(int c ,int d){
        int e=c+d;
        System.out.println("结果为："+e);
    }

}
