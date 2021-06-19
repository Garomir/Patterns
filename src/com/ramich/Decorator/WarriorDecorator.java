package com.ramich.Decorator;

public class WarriorDecorator implements Warrior {

    private Warrior warrior;
    private String additionalWeapon;

    public WarriorDecorator(Warrior warrior, String additionalWeapon) {
        this.warrior = warrior;
        this.additionalWeapon = additionalWeapon;
    }

    @Override
    public String getName() {
        return warrior.getName();
    }

    @Override
    public String getWeapon() {
        return warrior.getWeapon();
    }

    @Override
    public String readyToFight() {
        return warrior.readyToFight() + " and " + additionalWeapon;
    }
}
