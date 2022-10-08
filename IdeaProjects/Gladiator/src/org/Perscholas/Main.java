package org.Perscholas;
import org.Perscholas.Gladiator.Gladiator;
import org.Perscholas.Arena.Arena;


public class Main {
    public static void main(String[] args) {
        Arena colosseum = new Arena("Colosseum");


        Gladiator max = new Gladiator("Maximus", "Trident");
        Gladiator titus = new Gladiator("Titus", "Club");

        Gladiator andronicus = new Gladiator("Andronicus", "Spear");
        Gladiator thor = new Gladiator("Thor", "Trident");


        colosseum.addGladiator(max, andronicus);
        colosseum.arena();
    }

    }
