package cn.csuft.day06.demo12;

public class Son extends Father{
        public Son(){
            System.out.println("子类构造方法执行");
        }
    @Override
    public void eat() {
        System.out.println("吃饭");
    }
}
