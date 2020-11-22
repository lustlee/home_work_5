package com.company;

public class Main {

    public static void main(String[] args) {
        Boss boss = new Boss(1000,80,"Mystic");
        System.out.println("Жизнь босса: " + boss.getHealthBoss());
        System.out.println("Урон Босса: " + boss.getDamageBoss());
        System.out.println("Тип выбранной защиты: " + boss.getProtectBoss());
    }
}
