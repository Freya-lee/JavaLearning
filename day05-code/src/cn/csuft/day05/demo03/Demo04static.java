package cn.csuft.day05.demo03;

//静态内容总是优先于非静态
//所以静态方法总是先比构造方法执行
//静态代码块的典型用法：
//用来一次性的对静态成员变量进行赋值
public class Demo04static {
    public static void main(String[] args) {
        Person one = new Person();
        Person two = new Person();
    }


}
