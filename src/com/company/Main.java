package com.company;

public class Main {

    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setBossHealth(200);
        boss.setBossDamage(50);
        boss.setBossDefenceType(" 20");
        System.out.println("Boss health: " + boss.getBossHealth() + "BossDamage"
                + boss.getBossDamage() + "BossDefenceType" + boss.getBossDefenceType());
        createHeroes();

        for (Hero hero: createHeroes()) {
            System.out.println(hero.getHeals() + hero.getDamage() + hero.getSupers());
        }
    }




    public static Hero[] createHeroes() {
        Hero hero1 = new Hero(100, 5, "Magical");
        Hero hero2 = new Hero(150, 15, "Physical");
        Hero hero3 = new Hero(200, 25, "Genetic");
        return new Hero[]{hero1, hero2, hero3};
    }
}
