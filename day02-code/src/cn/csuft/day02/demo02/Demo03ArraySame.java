package cn.csuft.day02.demo02;
//让2中的两个数组产生联系
//意思就是两个引用指向同一个数组
//只要地址相同，就是同一个数组
public class Demo03ArraySame {
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


        int [] array2= array1;//修改这一行代码
        //将array1的地址值给array2
        //此时他们指向的就是同一个数组
        //这个时候修改array2的值，其实array1的值也会跟着改变

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

        System.out.println(array1);//地址值
        System.out.println(array1[0]);//默认值0
        System.out.println(array1[1]);//100
        System.out.println(array1[2]);//200


    }
}
