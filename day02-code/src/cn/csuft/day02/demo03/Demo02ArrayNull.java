package cn.csuft.day02.demo03;
//空指针异常
//所有的引用类型变量都可以赋值为一个Null值，但是这代表这里面什么都没雨
//数组必须进行new初始化才能使用其中的元素
//如果只是赋值了一个null值，没有进行new创建，那么将会发生空指针异常NullPointerException
//原因：忘了new
//解决：补上new
public class Demo02ArrayNull {
    public static void main(String[] args) {
        int [] array = null;
        array = new int[3];
        System.out.println(array[0]);
    }
}
