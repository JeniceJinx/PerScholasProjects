package org.Perscholas.Arena;

import org.Perscholas.Gladiator.Gladiator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Arena {
    String name;

    ArrayList<Gladiator> battlefield = new ArrayList<Gladiator>();
//    private Gladiator fighter2;

    public Arena(String name) {
        this.name = name;
        System.out.println();
    }


    public void addGladiator(Gladiator fighter1, Gladiator fighter2) {
        battlefield.add(fighter1);
        System.out.println(battlefield.get(0).getName());
        battlefield.add(fighter2);
        System.out.println(battlefield.get(1).getName());
    }

    public void arena() {
        if (battlefield.get(0).getWeapon() == "Spear") {
            if (battlefield.get(1).getWeapon() == "Spear") {
                battlefield.remove(1);
                battlefield.remove(0);
                System.out.println("The two warriors have both eliminated each other. No winners.");
            } else if (battlefield.get(1).getWeapon() == "Trident") {
                battlefield.remove(0);
                System.out.println("The mighty " + battlefield.get(0).getName() + " is standing as the victor with his mighty " + battlefield.get(0).getWeapon());
            } else {
                battlefield.remove(1);
                System.out.println("The mighty " + battlefield.get(0).getName() + " is standing tall with his " + battlefield.get(0).getWeapon() + " raised above his head.");
            }
        } else if (battlefield.get(0).getWeapon() == "Trident") {
            if (battlefield.get(1).getWeapon() == "Trident") {
                battlefield.remove(1);
                battlefield.remove(0);
                System.out.println("The two warriors have both eliminated each other. No winners.");
            } else if (battlefield.get(1).getWeapon() == "Club") {
                battlefield.remove(0);
                System.out.println("The mighty " + battlefield.get(0).getName() + " is standing as the victor with his mighty " + battlefield.get(0).getWeapon());
            } else {
                battlefield.remove(1);
                System.out.println("The mighty " + battlefield.get(0).getName() + " is standing tall with his " + battlefield.get(0).getWeapon() + " raised above his head.");
            }
        } else {
            if (battlefield.get(1).getWeapon() == "Club") {
                battlefield.remove(1);
                battlefield.remove(0);
                System.out.println("The two warriors have both eliminated each other. No winners.");
            } else if (battlefield.get(1).getWeapon() == "Spear") {
                battlefield.remove(0);
                System.out.println("The mighty " + battlefield.get(0).getName() + " is standing as the victor with his mighty " + battlefield.get(0).getWeapon());
            } else {
                battlefield.remove(1);
                System.out.println("The mighty " + battlefield.get(0).getName() + " is standing tall with his " + battlefield.get(0).getWeapon() + " raised above his head.");
            }
        }
    }
}








