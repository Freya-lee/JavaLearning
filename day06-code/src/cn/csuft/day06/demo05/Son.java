package cn.csuft.day06.demo05;

public class Son extends Father{
    @Override//没有这个也叫做覆盖重写，这是可选的，可写可不写
    public void method() {
        System.out.println("Son's method");
    }//覆盖重写

    @Override
    public String method1() {//如果子类权限范围缩小为private
        //那么就是错的
        return null;
    }//在父类方法中，返回值是Object，子类中是String，所以是正确的，但是如果反过来，就是错的
    //因为子类的返回值类型不能比父类的返回值类型大
}
