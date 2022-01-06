package cn.csuft.day01.demo03;
//定义一个方法求出1-100间所有数字的和
public class Demo02MethodSum {
    public static void main(String[] args) {
        System.out.println("1-100的和为："+Sum());
    }
    public static int Sum(){
        int sum=0;
        for (int i = 0; i <=100; i++) {
            sum=sum+i;
        }
        return sum;
    }
}
