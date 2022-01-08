package cn.csuft.day03.demo01;

import java.util.Arrays;

//面向对象：当需要实现一个具体的功能时，不需要具体的步骤，而是找一个已经具有该功能的人，帮我做事
//面向过程：当要实现一个具体的功能的时候，每一个具体的步骤都有亲力亲为，详细处理每一个细节
public class Demo01PrintArray {

//下面用两种思想来遍历数组
public static void main(String[] args) {
    int [] array ={10,20,30,40,50};
    //面向过程，每一个步骤都要亲力亲为
    //打印格式为[10,20,30,40,50]
    System.out.print("[");
    for (int i = 0; i < array.length; i++) {
        if (i== array.length-1){
            System.out.println(array[i]+"]");
        }
        else {
            System.out.print(array[i]+"，");
        }
    }
    System.out.println("===========");
   //面向对象
    System.out.println(Arrays.toString(array));
    //找一个jdk给我们提供好的Arrays类
    //其中有一个toString方法，直接就能把数组变成想要格式的字符串
}
   
    //面向过程就强调步骤
    //面向过程就强调对象

}
