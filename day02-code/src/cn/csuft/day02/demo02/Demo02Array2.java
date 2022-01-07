package cn.csuft.day02.demo02;

public class Demo02Array2 {
    public static void main(String[] args) {
        int [] array1= new int[3];
        System.out.println(array1);//地址值
        System.out.println(array1[0]);//默认值0
        System.out.println(array1[1]);//默认值0
        System.out.println(array1[2]);//默认值0
        //给后两个赋值
        array1[1]=10;
        array1[2]=20;
        System.out.println(array1);//地址值
        System.out.println(array1[0]);//默认值0
        System.out.println(array1[1]);//10
        System.out.println(array1[2]);//20


        int [] array2= new int[3];
        System.out.println(array2);//地址值
        System.out.println(array2[0]);//默认值0
        System.out.println(array2[1]);//默认值0
        System.out.println(array2[2]);//默认值0
        //给后两个赋值
        array2[1]=100;
        array2[2]=200;
        System.out.println(array2);//地址值
        System.out.println(array2[0]);//默认值0
        System.out.println(array2[1]);//100
        System.out.println(array2[2]);//200

        //这样做两个数组各干各的没有什么联系
    }
}
