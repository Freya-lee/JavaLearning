package cn.csuft.day07.demo01;
//问题描述，
//我么需要抽取一个共有方法，用来解决两个默认方法之间重复代码的问题
//但是这个共有方法不应该让实现类使用，应该是私有化的
//解决方法
//从java9开始，接口当中允许定义私有方法
//普通私有方法，解决多个默认方法之间重复代码的问题
//格式：
//private 返回值类型 方法名称（参数列表）{
// 方法体
// }

//静态私有方法，解决多个静态方法之间代码重复的问题
//private static 返回值类型 方法名称（参数列表）{
// 方法体
// }
public interface MyInterfacePrivateA {
    public default void methodDefault1(){
        System.out.println("我是一个接口当中的默认方法1");
        methodCommon();//
    }
    public default void methodDefault2(){
        System.out.println("我是一个接口当中的默认方法2");
        System.out.println("AAA");
        System.out.println("BBB");
        System.out.println("CCC");
    }
    //现在1，2 方法 中有很多重复的地方
//    public default void methodCommon(){
//        System.out.println("AAA");
//        System.out.println("BBB");
//        System.out.println("CCC");
////提取重复的代码，新建一个默认函数//然后把上面两个重复的地方给他替换成这个函数就可以
//        //但是这样不好，因为这个方法可以被接口的实现类调用
//        //所以一般不这样写
//    }
    private   void methodCommon(){
        System.out.println("AAA");
        System.out.println("BBB");
        System.out.println("CCC");
    }// 私有普通方法，只允许这个接口当中的方法使用
}
