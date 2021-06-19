package com.ramich.Decorator;

public class App {
    public static void main(String[] args) {
        Warrior knight = new KnightWarrior("Artur", "sword");
        Warrior knightWithBow = new WarriorWithSecondWeaponDecorator(knight, "bow");
        Warrior knightWithBowAndShild = new WarriorWithThirdWeaponDecorator(knightWithBow, "shild");

        System.out.println(knightWithBowAndShild.readyToFight());
    }
}
