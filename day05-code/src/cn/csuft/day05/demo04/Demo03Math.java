package cn.csuft.day05.demo04;
//Math是数学相关的工具类
//里面提供类大量的静态方法，完成与数学相关的操作
//public static double abs(double num)//获取绝对值
//public static double ceil(double num)//向上取整
//public static double floor(double num)//向下取整
//public static long round(double num)//四舍五入
//Math.PI//取圆周率的常量
public class Demo03Math {
    public static void main(String[] args) {
        //获取绝对值
        System.out.println(Math.abs(-12.56));
        //向上取整
        System.out.println(Math.ceil(-12.56));
        //向下取整
        System.out.println(Math.floor(-12.56));
        //四舍五入
        System.out.println(Math.round(-12.56));
        //圆周率
        System.out.println(Math.PI);
    }
}
