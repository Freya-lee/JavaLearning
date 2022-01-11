package cn.csuft.day06.demo10;

public class Son extends Father{
    int num = 20;
    @Override
    public void method(){

        System.out.println("子类方法");
        super.method();//调用了父类方法

    }
    public void show(){
        int num = 30 ;
        System.out.println("局部变量num："+num);
        System.out.println("本类中的num："+this.num);
        System.out.println("父类的num："+super.num);

    }
}
