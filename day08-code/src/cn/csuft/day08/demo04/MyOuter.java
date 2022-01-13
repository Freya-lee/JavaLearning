package cn.csuft.day08.demo04;
//局部内部类
//局部内部类，如果希望访问所在方法的局部变量， 那么这个局部变量必须是【有效final】的
//备注：从Java8开始，只要局部变量事实不变，那么这个final关键字可以省略
//原因：
//1，new出来的对象在堆内存中
//2，局部变量是跟着方法走的，在栈内存当中
//3，方法运行之后，立刻出栈，局部变量就会立刻消失
//4，new出来的对象会在堆内存当中，直到垃圾回收为止
//
public class MyOuter {
    public void methodOuter(){
        int num = 10;//所在方法的局部变量
       // num = 20;//如果这样改变了，那么后面局部内部类在使用的时候就会报错，因为要求这个必须是有效而且final的
        class MyInner{
            //这个是局部内部类
            public void methodInner(){
                System.out.println("我是局部内部类");
                System.out.println(num);
            }

        }
    }

}
