package cn.csuft.day07.demo05;
//在多态的代码中，成员方法的访问规则是
//看new的是谁，没有就向上找
//编译看左边，运行看右边
//对比一下
//成员变量：编译看左边，运行还看左边
//成员方法：编译看左边，运行看右边
public class Demo02MultiMethod {


    public static void main(String[] args) {
        Father obj = new Son();
        obj.showNum();//看new的是谁，是Son那么就使用Son的成员方法
        obj.methodFather();//子类没有，就向上找
        //编译看左边，左边是Father，Father当中没有methodSon方法，所以编译报错
      //  obj.methodSon();//错误写法



    }

}
