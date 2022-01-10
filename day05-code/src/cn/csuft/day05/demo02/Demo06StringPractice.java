package cn.csuft.day05.demo02;
//定义一个方法，把数组（1，2，3）按照指定格式拼接成为一个字符串，参照格式如下：
//[word1#word2#word3],
//首先准备一个数组，内容是1，2，3
//定义一个方法将数组用来变成字符串
//
public class Demo06StringPractice {
    public static void main(String[] args) {
        int[] num = {1,2,3};
        String results= fromArraytoString(num);
        System.out.println(results);

    }
   public static String fromArraytoString(int[] array){
        String str1="[";
       for (int i = 0; i < array.length; i++) {
           if (i<array.length-1) {//如果不是最后一个元素
               str1 += "word" + array[i] + "#";
           }
           else
               str1+="word"+array[i]+"]";
       }
        return str1;
   }
}
