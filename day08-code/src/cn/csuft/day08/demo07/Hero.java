package cn.csuft.day08.demo07;

public class Hero {
    private String name;
    private Skill skill;//英雄的法术技能

    public Hero() {
    }

    public String getName() {
        return name;
    }
    public void attack(){
        System.out.println("我是英雄类当中的攻击方法");
        skill.use();//调用接口当中的抽象方法
        System.out.println("使用技能完成");
    }

    public void setName(String name) {
        this.name = name;
    }

    public Skill getSkill() {
        return skill;
    }

    public void setSkill(Skill skill) {
        this.skill = skill;
    }

    public Hero(String name, Skill skill) {
        this.name = name;
        this.skill = skill;
    }
}
