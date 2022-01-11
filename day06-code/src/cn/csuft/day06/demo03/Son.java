package cn.csuft.day06.demo03;



public class Son extends Father {
    int num =20;
    public void method(){
        int num = 30;//局部变量
        //现在成员变量和局部变量是重名的
        System.out.println(num);
        System.out.println(this.num);//输出本类的成员变量
        System.out.println(super.num);//输出的是父类的成员变量

    }
}
