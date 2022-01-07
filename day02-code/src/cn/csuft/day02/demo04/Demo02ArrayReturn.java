package cn.csuft.day02.demo04;
//数组作为方法的返回值
//一个方法只能有一个或0个返回值
//如果想有多个返回值，那么使用一个数组作为返回值
public class Demo02ArrayReturn {
    public static void main(String[] args) {
        int[] result = calculate(10,20,30);
        System.out.println("总和为："+result[0]+"平均数为："+result[1]);

    }
    public static int[] calculate(int a ,int b,int c){
        int sum = a+c+b;
        int avg=sum/3;
        int [] array = {sum,avg};
//        array[0]=sum;
//        array[1]=avg;

        return array;

    }
}
