package cn.csuft.day02.demo01;
//使用动态初始化的时候，数组中的元素会自动拥有一个默认值，默认值的规则如下：
//如果是整数类型，默认为0
//如果是浮点类型，默认为0。0
//如果是字符类型，默认为'/u0000'
//如果是布尔类型，默认为false
//如果是引用类型，默认为null
//静态初始化其实也有默认值，但是系统马上把默认值替换为大括号中的值
public class Demo05ArrayUse {
    public static void main(String[] args) {
        //动态初始化一个数组
        int [] array = new int[3];
        //数组的名称就是一个局部变量
        System.out.println(array[0]);
        //给数组的某一个赋值
        array[1]=123;
    }
}
