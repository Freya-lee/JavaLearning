package cn.csuft.day04.demo03;

import java.util.Random;

//得到1-n的随机数，可以取到1，也可以取到n
//把左右都+1就可以取到这种效果
public class Demo03Random {
    public static void main(String[] args) {
        int n= 5 ;
        Random r= new Random();
      int result =  r.nextInt(n)+1;
      //本来范围是0-n的左闭右开范围，但是现在是0+1-n+1的左闭右开，
        // 所以现在可以取到1-n的所有数字，包括边界
    }
}
