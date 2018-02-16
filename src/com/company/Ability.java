package com.company;

public class Ability extends Monster{

    private String abilityName;
    private int abilityDamage;

    public Ability(String abilityName, int abilityDamage, String name, int Health, int monsterDamage) {
        super(name, Health, monsterDamage);
        this.abilityName = abilityName;
        this.abilityDamage = abilityDamage;
    }

    public String getAbilityName() {
        return abilityName;
    }

    public void setAbilityName(String abilityName) {
        this.abilityName = abilityName;
    }

    public int getAbilityDamage() {
        return abilityDamage;
    }

    public void setAbilityDamage(int abilityDamage) {
        this.abilityDamage = abilityDamage;
    }
}
