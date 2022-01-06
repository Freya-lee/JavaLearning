package cn.csuft.day01.demo03;
//定义一个方法，看两个数字是否相同
public class Demo01MethodSame {
    public static void main(String[] args) {
        System.out.println(isSame(10,20));
    }
//    三要素：
//    返回值类型：bool
//    方法名：isSame
//    参数列表：int a int b
    public static boolean isSame(int a , int b ){
//        boolean same;
//        if (a==b) {
//            same=true;
//        }else {
//            same=false;
//        }
 //       boolean same= a==b;
        return  a==b;
    }
}
