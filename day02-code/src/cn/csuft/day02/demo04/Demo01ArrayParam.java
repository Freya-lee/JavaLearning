package cn.csuft.day02.demo04;
//数组作为方法参数传值
//定义一个方法，在需要打印的时候，就直接调用就好，不用每次都写一堆重复的代码
//方法的三要素：
//返回值类型：void
//方法名称：PrintArray
//参数列表：给数组才能打印出数组中的元素，所以参数是一个数组 ：int[] array
//数组作为参数传递进入方法的时候，传递进方法的其实是数组的地址值
public class Demo01ArrayParam {
    public static void main(String[] args) {
        int [] array = {10,20,30,40,50};
        PrintArray(array);
    }
    public static void PrintArray (int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("==============");
    }

}
