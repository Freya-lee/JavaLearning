package cn.csuft.day02.demo03;

public class Demo04Array {
    public static void main(String[] args) {
        int [] array = {2,4,2,34,5,6,75};
        //首先使用原始的代码
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array[4]);
        System.out.println(array[5]);
        System.out.println(array[6]);
        System.out.println("==================");
        //使用循环，次数就是数组的长度
        for (int i = 0; i < 7; i++) {
            System.out.println(array[i]);
        }
        System.out.println("==================");
        //不要写死，可以自动获取数组的长度
        int len= array.length;
        for (int i = 0; i < len; i++) {
            System.out.println(array[i]);
        }
        System.out.println("==================");
        //更简便的写法
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);

        }
    }
}
