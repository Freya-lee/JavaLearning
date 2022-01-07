package cn.csuft.day02.demo03;
//数组索引越界异常
//数组的索引从0开始，到"数组的长度-1"为止
//如果访问数组元素的时候，索引编号不存在，那么将会发生
//数组索引越界异常 ArrayIndexOutOfBoundsException
//原因：索引编号写错了
//解决：修改成为正确的索引编号
public class Demo01ArrayIndex {
    public static void main(String[] args) {
        int [] array = {5,10,15};
        System.out.println(array[0]);//5
        System.out.println(array[1]);//10
        System.out.println(array[2]);//15

        //错误写法，因为3号元素是不存在的
        System.out.println(array[3]);//索引越界
    }

}