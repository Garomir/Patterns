package com.ramich.Decorator;

public class KnightWarrior implements Warrior {

    private String name;
    private String weapon;

    public KnightWarrior(String name, String weapon) {
        this.name = name;
        this.weapon = weapon;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getWeapon() {
        return weapon;
    }

    @Override
    public String readyToFight() {
        return name + " take the " + weapon;
    }
}
