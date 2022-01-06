package cn.csuft.day02.demo01;
//在创建数组的时候，直接指定数组中的元素个数---动态初始化

//在创建数组的时候，直接指定数组的内容--静态初始化
//静态初始化的基本格式
//数据类型[] 数组名称 = new 数据类型[]{数据1，数据2...}
public class Demo02Array {
    public static void main(String[] args) {
        //创建一个静态数组
        int [] Array3 = new int[] {1,2,3,4};
        //创建一个数组，用来装字符串
        String [] Array4 = new String[] {"Hello","World"};
    }
}
