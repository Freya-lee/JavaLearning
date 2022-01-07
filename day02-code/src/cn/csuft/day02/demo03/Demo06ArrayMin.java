package cn.csuft.day02.demo03;
//求数组中的最小值
public class Demo06ArrayMin {
    public static void main(String[] args) {
        int [] array = {1,4,23,57,85,34,24,8,0};
        int min = array[0];
        for (int i = 0;i<array.length;i++) {
            //如果当前元素比原来的元素小，就替换掉'
            if (array[i]<min)
                min=array[i];
        }
        System.out.println(min);
    }
}
