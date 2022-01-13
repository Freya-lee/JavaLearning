package cn.csuft.day08.demo06;

public class DemoMain {
    public static void main(String[] args) {

        Hero hero=  new Hero();
        hero.setAge(23);
        hero.setName("Lina");
        //创建一个武器
        Weapon weapon = new Weapon("流星锤");
        hero.setWeapon(weapon);
        hero.attack();

    }
}
