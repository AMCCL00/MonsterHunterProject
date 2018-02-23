package com.company;

public class WeaponType{
    private String weaponType;
    private int damage;
    private int speed;
    private int dodgeChance;

    public WeaponType(String weaponType, int damage, int dodgeChance) {
        this.weaponType = weaponType;
        this.damage = damage;
        this.dodgeChance = dodgeChance;

    }
    public String getWeaponType() {
        return weaponType;
    }

    public void setWeaponType(String weaponType) {
        this.weaponType = weaponType;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getDodgeChance() {
        return dodgeChance;
    }

    public void setDodgeChance(int dodgeChance) {
        this.dodgeChance = dodgeChance;
    }
}
