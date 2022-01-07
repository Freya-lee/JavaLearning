package cn.csuft.day02.demo03;
//数组元素反转
//本来的样子【0，1，2，3】
//反转之后【3，2，1，0】
//要求不能使用新数组，必须使用原来的一个数组
//数组元素反转就是对称位置的元素交换
//如何交换两个变量的值
//需要借助第三个空变量temp
public class Demo07ArrayReverse {
    public static void main(String[] args) {
        int [] array = {1,4,76,32,8};
        int r= array.length-1;
        int l=0;
        int temp;
        int count= array.length/2;
        System.out.println(count);
        //也可以不要这个次数，在for循环里面判断min是不是小于max，是的话，r就继续减一，l加一
        //不是的话就说明已经好了
        System.out.println("=======");
        for (int i = 0; i < count; i++) {
            temp=array[r];
            array[r] = array[l];
            array[l] = temp;
            l++;
            r--;
        }


        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("=======");
        //第二种for循环方式
        for (int min = 0,max = array.length-1;min<max;min++,max-- ){
            temp = array[max];
            array[max] = array[min];
            array[min] = temp;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }

}
