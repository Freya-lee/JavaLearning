package cn.csuft.day08.demo07;

public class DemoMain {


    public static void main(String[] args) {
        Hero hero = new Hero();
        hero.setName("Lina");
//        Skill skill = new Skill() {
//            @Override
//            public void use() {
//                System.out.println("呼风唤雨");
//            }
//        };
//          hero.setSkill(skill)//这里使用类匿名内部类
        //使用单独定义的实现类
  //    hero.setSkill(new SkillImpl());//使用了匿名对象
        //同时使用匿名内部类和匿名对象
        hero.setSkill(new Skill() {
            @Override
            public void use() {
                System.out.println("匿名对象匿名内部类");
            }
        });
        hero.attack();




    }
}
