package cn.csuft.day04.demo02;
//对象的标准格式
//类名称 对象名 =  new 类名称（）；
//匿名对象只能使用唯一的一次，下次再用就必须创建一个新对象
//使用建议：在确定对象只使用一次的时候就可以使用匿名对象
public class Demo01Anonymous {
    public static void main(String[] args) {
        //左边的就是对象的名字
        Person one = new Person();
        one.name="Lina";
        one.showName();
        System.out.println("============");
        //匿名对象
        new Person().name="Tina";//第二个对象，是匿名的
        new Person().showName();//第三个新对象，也是匿名的
    }
}
