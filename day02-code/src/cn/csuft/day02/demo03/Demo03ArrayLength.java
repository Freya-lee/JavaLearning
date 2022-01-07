package cn.csuft.day02.demo03;
//数组的长度
//获取数组长度的格式：数组名.length
//数组一旦创建，程序运行期间，长度不可以改变
public class Demo03ArrayLength {
    public static void main(String[] args) {
        //动态初始化的数组可以一眼就看出长度
        int [] array1 = new int[3];
        //静态初始化的时候，太多的元素需要获取长度不能直接看出来
        int [] array2 = {1,2,4,6,3,5,443,89,43,52,23};
        //获取数组的长度
        int length = array2.length;
        System.out.println(length);


        //数组的长度在程序运行期间数不能改变的
        int [] array3 = new int[3];
        System.out.println(array3.length);//3

        array3 = new int[5];
        System.out.println(array3.length);//5
        //第二次的时候已经创建了一个新的数组，跟原来的数组3是不一样的，老数组的长度是不能改变的

    }
}
