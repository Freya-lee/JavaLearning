package cn.csuft.day01.demo02;
/*
有参数：小括号当中有内容，当一个方法需要一些数据条件，才嫩好完成任务的时候，就是有参数
例如：两个数字相加需要知道两个数字各自是多少，才能相加
无参数：小括号中留空，一个方法不需要任何数据条件，自己就能独立完成任务，就是无参数
*/
public class Demo03MethodParam {
    public static void main(String[] args) {
        System.out.println("结果是"+method1(2,3));
        method2();
    }
    //两个数字相乘
    //有参数
    public static int method1(int a ,int b ){
        return a*b;
    }
    //无参数的方法，例如，打印输出固定字符串的方法
    //输出3*4的正方形，用*填充
    public static void method2(){
        for (int j = 0; j < 3; j++) {
            for (int i = 0; i < 4; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
