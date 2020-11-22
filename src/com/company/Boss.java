package com.company;

public class Boss {
    private int healthBoss;
    private int damageBoss;
    private String protectBoss;

    public int getHealthBoss() {
        return healthBoss;
    }

    public void setHealthBoss(int healthBoss) {
        this.healthBoss = healthBoss;
    }

    public int getDamageBoss() {
        return damageBoss;
    }

    public void setDamageBoss(int damageBoss) {
        this.damageBoss = damageBoss;
    }

    public String getProtectBoss() {
        return protectBoss;
    }

    public void setProtectBoss(String protectBoss) {
        this.protectBoss = protectBoss;
    }

    public Boss(int healthBoss, int damageBoss, String protectBoss){
        this.healthBoss = healthBoss;
        this.damageBoss = damageBoss;
        this.protectBoss = protectBoss;
    }
}
