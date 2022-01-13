package cn.csuft.day07.demo05;



public class Son extends Father {
    int num =20;
    int age = 16;

    @Override
    public void showNum() {
        System.out.println(num);
        System.out.println(age);
    }
    public void methodSon(){
        System.out.println("这个是子类特有的方法");
    }
}
