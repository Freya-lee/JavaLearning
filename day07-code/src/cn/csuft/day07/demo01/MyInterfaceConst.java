package cn.csuft.day07.demo01;
//接口当中也可以定义成员变量，但是必须使用public static final这三个关键字进行修饰
//从效果上看，这其实就是接口的常量
//格式：
//public static final 数据类型 常量名称 = 数据值；
//一旦使用final关键字进行修饰，说明不可改变
//我们接口当中的常量 可以省略这从三个关键词，但是不写会默认给你加上，是一个意思
//接口当中的常量必须进行赋值，不能不赋值
//接口中常量的名称要使用完全大写的字母，使用下划线连接
public interface MyInterfaceConst {
    //这其实就是一个常量，一旦赋值，不可以修改
    public static final int NUM_OF_MY_CLASS = 10;
    //public ：大家都能随便用的意思


}
