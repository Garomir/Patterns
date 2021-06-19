package com.ramich.Decorator;

public class WarriorWithThirdWeaponDecorator extends WarriorDecorator {
    public WarriorWithThirdWeaponDecorator(Warrior warrior, String additionalWeapon) {
        super(warrior, additionalWeapon);
    }
}
