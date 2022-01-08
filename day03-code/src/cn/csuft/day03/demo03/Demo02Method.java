package cn.csuft.day03.demo03;
//面向对象的三大特征：封装继承和多态
//方法就是一种封装
//关键字private也是一种封装
//封装就是将一些细节的东西隐藏起来，对于外界不可见
public class Demo02Method {
    public static void main(String[] args) {
        int[] array={2,41,53,645,3,5,1,0,98};
          int Max= getMax(array);
        System.out.println("最大值为："+Max);
    }
    public static  int getMax(int[]  array){
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max<array[i]){
                max=array[i];
            }
        }
        return max;
    }
}
