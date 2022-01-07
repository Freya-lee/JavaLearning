package cn.csuft.day02.demo03;
//求出数组中的最大值
public class Demo05ArrayMax {
    public static void main(String[] args) {
        int [] array = {1,4,23,57,85,34,24,8};
        int max = array[0];
        for (int i = 0;i<array.length;i++) {
            //如果当前元素比原来的元素大，就替换掉'
            if (array[i]>max)
                max=array[i];
        }
        System.out.println(max);
    }
}

