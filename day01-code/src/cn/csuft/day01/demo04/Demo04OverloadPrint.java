package cn.csuft.day01.demo04;
//byte short int long float double char boolean
//String
public class Demo04OverloadPrint {
    public static void main(String[] args) {
        myPrint(100);
        myPrint("waht");
        char a='a';
        myPrint(0.122);
        myPrint(20l);
        myPrint(a);
        boolean b=false;
        myPrint(b);
        myPrint(29f);

    }
    public static void myPrint(byte num){
        System.out.println(num);
    }
    public static void myPrint(short num){
        System.out.println(num);
    }
    public static void myPrint(int num){
        System.out.println(num);
    }
    public static void myPrint(long num){
        System.out.println(num);
    }
    public static void myPrint(float num){
        System.out.println(num);
    }
    public static void myPrint(double num){
        System.out.println(num);
    }
    public static void myPrint(char num){
        System.out.println(num);
    }
    public static void myPrint(boolean is){
        System.out.println(is);
    }
    public static void myPrint(String str){
        System.out.println(str);
    }

}
