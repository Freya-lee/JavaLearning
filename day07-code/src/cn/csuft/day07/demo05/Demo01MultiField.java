package cn.csuft.day07.demo05;

//访问成员变量的两种方式
//直接通过对象名称访问成员变量
//看等号左边是谁，优先用谁，没有再向上找
//间接通过成员方法访问成员变量
//看该方法属于谁，优先用谁，没有再向上找

public class Demo01MultiField {
    public static void main(String[] args) {
        Father obj  = new Son();
        System.out.println(obj.num);
      //  System.out.println(obj.age);//错误写法
        //因为等号左边的是Father，而Father中没有age这个变量，但是对于成员变量，是不会向下找的
        //成员变量只会向上找
        System.out.println("=====================");
        obj.showNum();//使用的是Father的方法，因为子类没有覆盖重写
        //子类如果覆盖重写了就是使用子类的


    }

}
