package cn.csuft.day08.demo01;
//final 关键字的代表最终，不可改变的
//常见的四种用法
//可以用来修饰一个类
//可以用来修饰一个方法
//可以用来修饰一个局部变量
//可以用来修饰一个成员变量
public class Demo01Final {
    public static void main(String[] args) {
        int num = 10;
        System.out.println(num);
        num = 20;
        System.out.println(num);
        //一旦使用final关键字来修饰局部变量，那么这个变量就是最终变量，就不可以再被改变
      final   int num2 = 200;
      //对基本数据来说 不可变说的是变量当中的数值不可以改变
        //对于引用类型来说，不可变说的就是变量当中的地址值不可以改变
        Student student = new Student("Lily");
        System.out.println(student);
        System.out.println(student.getName());
        student = new Student("Tommy");
        System.out.println(student);
        System.out.println(student.getName());
        //这两个里面，地址值发生来改变
     //   如果使用final修饰词修饰
     final Student student1 = new Student("Lisa");
        System.out.println(student1);
        System.out.println(student1.getName());
      //  student1 = new Student("Dobby");//错误写法，不能再改变对象的地址值
     student1.setName("Nana");
        System.out.println(student1);
        System.out.println(student1.getName());






    }

}
