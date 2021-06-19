package com.ramich.Decorator;

public class GladiatorWarrior implements Warrior {

    private String name;
    private String weapon;

    public GladiatorWarrior(String name, String weapon) {
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
