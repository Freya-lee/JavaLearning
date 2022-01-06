package cn.csuft.day01.demo04;
//比较两个数据是否相等
//参数类型为两个byte类型，两个short类型，两个int类型，两个long类型
//并在main方法🀄进行测试

public class Demo02MethodOverloadSame {
    public static void main(String[] args) {
        byte a=10,b=10;
        short c=20,d=30;
        System.out.println(isSame(a,b));
        System.out.println(isSame(c,d));
        System.out.println(isSame(10,23));
        System.out.println(isSame(20l,20l));
    }
    public static boolean isSame(byte a,byte b){
        System.out.println("两个byte类型比较被执行");
        return a==b?true:false;
    }
    public static boolean isSame(short a,short b){
        System.out.println("两个short类型比较被执行");
        return a==b?true:false;
    }
    public static boolean isSame(int a,int b){
        System.out.println("两个int类型比较被执行");
        return a==b?true:false;
    }
    public static boolean isSame(long a,long b){
        System.out.println("两个long类型比较被执行");
        return a==b?true:false;
    }
}
