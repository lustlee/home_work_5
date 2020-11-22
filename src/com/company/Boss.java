package com.company;

public class Boss {
    private int healthBoss;
    private int damageBoss;
    private String protectBoss;

    public int getHealthBoss() {
        return healthBoss;
    }

    public void setHealthBoss(int healthBoss) {
        if (healthBoss < 700){
            System.out.println("Слишклм мало жизней, босс проиграет =( ");
        }
        this.healthBoss = healthBoss;
    }

    public int getDamageBoss() {
        return damageBoss;
    }

    public void setDamageBoss(int damageBoss) {
        if (damageBoss >= 200){
            System.out.println("Босс слишком сильный, игра закончится быстро =) ");
        }
        this.damageBoss = damageBoss;
    }

    public String getProtectBoss() {
        return protectBoss;
    }

    public void setProtectBoss(String protectBoss) {
        this.protectBoss = protectBoss;
    }
}
