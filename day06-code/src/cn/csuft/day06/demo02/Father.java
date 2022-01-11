package cn.csuft.day06.demo02;

public class Father {
    int numFather = 10;
    int num = 5;
    int num2 = 9;
    //定义一个成员方法
    public void methodFather(){
        //使用的是本类的不会找子类的
        System.out.println(num);
    }
}
