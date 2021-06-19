package com.ramich.Decorator;

public class WarriorWithSecondWeaponDecorator extends WarriorDecorator {
    public WarriorWithSecondWeaponDecorator(Warrior warrior, String secondWeapon) {
        super(warrior, secondWeapon);
    }
}
