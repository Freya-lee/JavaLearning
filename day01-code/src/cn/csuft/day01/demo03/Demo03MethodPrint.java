package cn.csuft.day01.demo03;
//打印指定次数的HelloWorld
public class Demo03MethodPrint {
    public static void main(String[] args) {
        Print(10);
    }
    public static void Print(int a){
        for (int i = 0; i <= a; i++) {
            System.out.println("HelloWorld");
        }
    }
}
