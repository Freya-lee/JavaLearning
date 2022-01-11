package cn.csuft.day06.demo14;

public class User {
    private String name;//姓名
    private int money;//余额

    public void show(){
        System.out.println("姓名："+name+" 余额："+money);
    }

    public String getName() {
        return name;
    }

    public int getMoney() {
        return money;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public User() {
    }

    public User(String name, int money) {
        this.name = name;
        this.money = money;
    }
}
