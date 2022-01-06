package cn.csuft.day02.demo02;
//研究数组到底是内存怎么变的
public class Demo01Array1 {
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

    }
}
