package com.company;

public class Hero {

    private int heals;
    private int damage;
    private String supers;


    public Hero(int heals, int damage, String supers) {
        this.heals = heals;
        this.damage = damage;
        this.supers = supers;
    }
    public Hero(int heals, int damage) {
        this.heals = heals;
        this.damage = damage;
    }

    public int getHeals() {
        return heals;
    }

    public void setHeals() {
        this.heals = heals;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage() {
        this.damage = damage;
    }

    public String getSupers() {
        return supers;
    }

    public void setSupers() {
        this.supers = supers;
    }


}
