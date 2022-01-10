package cn.csuft.day05.demo04;
//Arrays是一个与数组相关的工具类，里面提供类大量的静态方法，用来实现数组的常见操作
//public static String toString(数组)，将参数的数组转为字符串形式并作为返回值返回
//按照默认格式：[元素1，元素2。。。]
//public static void sort(数组);//对数组元素进行排序
//如果是数值，那么默认按照升序排序
//如果是字符串，默认按照字母顺序排序
import java.util.Arrays;
public class Demo01Arrays {
    public static void main(String[] args) {
        int[] num={1,2,3};

        System.out.println(Arrays.toString(num));
        char[] chars={'a','b','c'};
        System.out.println(Arrays.toString(chars));
        int[] sorts={45,23,532,5,61,53,43};
        Arrays.sort(sorts);

        System.out.println(Arrays.toString(sorts));
    }
}
