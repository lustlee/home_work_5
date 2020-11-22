package com.company;

public class Hero {
    private int healthHero;
    private int damageHero;
    private String skillHero;

    public int getHealthHero() {
        return healthHero;
    }

    public int getDamageHero() {
        return damageHero;
    }

    public String getSkillHero() {
        return skillHero;
    }

    public Hero(int healthHero, int damageHero, String skillHero){
        this.healthHero = healthHero;
        this.damageHero = damageHero;
        this.skillHero = skillHero;
    };

    public Hero(int healthHero, int damageHero) {
        this.healthHero = healthHero;
        this.damageHero = damageHero;
    }
}
