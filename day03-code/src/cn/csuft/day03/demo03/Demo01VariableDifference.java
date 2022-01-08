package cn.csuft.day03.demo03;
//成员变量和局部变量的区别
//定义的位置不一样
//成员变量在方法的外部，直接写在类当中
//局部变量在方法的内部
//作用的范围不一样
//成员变量在整个类当中都可以使用
//局部变量只有在方法中才能够使用，出了方法就不能使用
//默认值不同
//局部变量没有默认值，要想使用必须手动进行赋值
//成员变量默认值要根据数据类型来确定
//内存的位置不一样
//成员变量在堆内存
//局部变量在栈内存
//生命周期不一样
//局部变量，随着方法进栈而诞生，随着方法出栈而消失
//成员变量，随着对象创建而诞生，随着对象被垃圾回收而消失
public class Demo01VariableDifference {
    public static void main(String[] args) {

    }
    String name;//成员变量
    public  void method(){
        String code;//局部变量
        System.out.println(name);//null 有默认值null
      //  System.out.println(code);//错误写法 因为局部变量必须要有初始值
        code="What";
        System.out.println(code);//赋值之后才能够使用
    }
    public  void methodB(int param){
        //参数在方法调用的时候是一定会被赋值的
     //   System.out.println(code);//错误写法 局部变量只能在自己的方法中使用
        int age = 20;

        System.out.println(age);
        System.out.println(name+param);
        name="Lily";
        System.out.println(name);
        //成员变量只要在类中，不管在哪里都能够使用
    }
}
