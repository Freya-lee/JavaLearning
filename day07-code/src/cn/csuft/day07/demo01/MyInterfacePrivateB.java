package cn.csuft.day07.demo01;

public interface MyInterfacePrivateB {
    public static void methodStatic1(){//这是静态方法，所以使用的也应该是静态方法，所以下面的私有方法也应该是静态的
        System.out.println("我是一个接口当中的静认方法1");
        methodCommon();
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
    private static void methodCommon(){
        System.out.println("AAA");
        System.out.println("BBB");
        System.out.println("CCC");
    }// 私有普通方法，只允许这个接口当中的方法使用
}
