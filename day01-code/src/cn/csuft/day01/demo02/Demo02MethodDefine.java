package cn.csuft.day01.demo02;
//方法就是若干语句的功能集合，
//方法继好比是一个工厂
//原料，产出物==参数，返回值
//参数。进入方法的数据
//返回值。从方法中出来的数据
//定义方法的完整格式：
//修饰符 返回值类型 方法名称 （参数类型 参数名，。。。）{
//   方法体
//   return 返回值；
//  }
//修饰符 现阶段的固定写法：public static
//返回值类型： 最终残剩的数据结果是什么类型
//方法名称： 方法的名字，规则和变量一样，小驼峰
//参数类型： 进入方法的数据是什么类型
//参数名称： 进入方法的数据对于的变量名称
//参数如果有多个使用逗号进行分割
//方法体：方法要做的事情，若干行代码
//return：两个作用 一个是停止当前方法，第二个是将结果值返回给调用处
//return后面的返回值必须和方法名称前面的返回值类型相同

public class Demo02MethodDefine {
    public static void main(String[] args) {
        System.out.println(add(2,3));
    }
    //定义一个两个数字相加的方法
    public static int add(int a ,int b){
        return a+b;
    }
}
