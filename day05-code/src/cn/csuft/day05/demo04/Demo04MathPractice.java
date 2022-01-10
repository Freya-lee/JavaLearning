package cn.csuft.day05.demo04;
//计算；
// 在-10.8到5.9之间绝对值大于6或者小于2.1的整数有多少个？
//分析
//确定类范围，使用for循环
//起点位置-10.8应该转换成为-10
//每个数字都是整数，所以步进表达式应该是num++，
//拿到绝对值abs（）
//一旦发现一个数字，就要让计数器加1
public class Demo04MathPractice {


    public static void main(String[] args) {
        int count=0 ;
        double l=-10.8;
        double r=5.9;
        l=Math.ceil(l);
  //      System.out.println(l);
        for (int i=(int)l;i<r;i++){
            int abs = Math.abs(i);
            if (abs>6||abs<2.1){
                count++;
            }
        }
        System.out.println("一共有："+count+"个");
    }

}
