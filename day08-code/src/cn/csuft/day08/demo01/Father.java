package cn.csuft.day08.demo01;
//当使用final关键字修饰一个方法的时候，这个方法就是最终方法，也就是不能被覆盖重写的方法
//格式：修饰符 final 返回值类型 方法名称（参数列表）
public class Father {
    public final void method (){//现在用final修饰了，那么子类就不能覆盖重写了
        System.out.println("我是父类方法");
    }
}
