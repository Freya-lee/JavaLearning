package cn.csuft.day08.demo06;

public class Hero {
    private String name;
    private int age;
    private Weapon weapon;//武器

    public String getName() {
        return name;
    }
    public void attack(){
        System.out.println("年龄："+age+" 姓名："+name+" 武器："+weapon.getCode());
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Hero(String name, int age, Weapon weapon) {
        this.name = name;
        this.age = age;
        this.weapon = weapon;
    }

    public Hero() {
    }
}
