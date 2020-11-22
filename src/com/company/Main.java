package com.company;

public class Main {

    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealthBoss(1000);
        boss.setDamageBoss(80);
        boss.setProtectBoss("Mystic");
        System.out.println("Жизнь босса: " + boss.getHealthBoss());
        System.out.println("Урон Босса: " + boss.getDamageBoss());
        System.out.println("Тип выбранной защиты: " + boss.getProtectBoss());
    }

}
