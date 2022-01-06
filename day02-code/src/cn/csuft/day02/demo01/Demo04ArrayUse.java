package cn.csuft.day02.demo01;

public class Demo04ArrayUse {
    public static void main(String[] args) {
        //省略格式
        int [] Array={10,15,20};
        //尝试打印
        System.out.println(Array);//直接打印数组名，打印出的是内存地址哈希值
        //访问数组元素的格式
        //数组名称 [索引值]
        //索引值就是一个int数字，数组的索引从0开始直到"数组的长度-1"为止
        System.out.println(Array[0]);

        //把数组中的元素交给一个变量
        int num=Array[2];
        System.out.println("num的值为"+num);

    }
}
