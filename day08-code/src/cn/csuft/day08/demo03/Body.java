package cn.csuft.day08.demo03;

public class Body {//外部类
    public class Heart{//成员内部类
        public void beat(){
            System.out.println("心脏跳动");
            System.out.println("我叫"+name);//正确，不报错

        }


    }
    private String name ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void methodBody(){
        System.out.println("外部类的方法");
        new Heart().beat();//匿名类调用方法

    }
}
