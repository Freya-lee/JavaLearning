package cn.csuft.day08.demo03;

public class Demo02InnerClass {
    public static void main(String[] args) {
        Outer.inner inner = new Outer().new inner();
        inner.methodInner();
    }
}
