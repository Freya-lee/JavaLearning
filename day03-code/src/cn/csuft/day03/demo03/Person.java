package cn.csuft.day03.demo03;
//问题：定义人的年龄的时候，没办法阻止不合理的年龄写入
//解决方法：用private关键字对要保护的成员变量进行修饰
//一旦使用private进行修饰，本类当中可以随意访问，但是在本类范围之外就不能再进行访问了
//间接访问private变量，就是设置一对get，set方法
//对于get方法来说，不能有参数，返回值类型必须和成员变量相对应
//对于set来说，必须有参数，没有返回值，参数类型必须和成员变量相对应
public class Person {
    String name;//姓名
    private int age;//年龄

    public void show(){
        System.out.println("My name is "+name+". I am "+age);
    }
    //下面这个方法用来设置age的值
    public void setAge(int num){
        if (num<100&&num>=0)
            age=num;
        else
            //  age=-num;
            System.out.println("Error age！");
    }
    //下面这个方法用来得到age的值
    public int getAge(){
        return age;
    }
}
