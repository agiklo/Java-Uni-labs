package com.company;

import com.company.creatures.Animal;
import com.company.creatures.FarmAnimal;
import com.company.creatures.Pet;

public class Main {

    public static void main(String[] args) {
        Animal cat = new Pet("Felis catus", 2.0, "Śierściuch", null);
        Animal cow = new FarmAnimal("Krowowata", 60.0, "Krowka", null);
        System.out.println(cat);
        cat.feed();
        cow.feed();
        cow.feed(3.0);
        cat.feed(1.0);
        System.out.println(cat);
        System.out.println(cow);
        cat.takeForAWalk();
        cow.takeForAWalk();
        ((FarmAnimal) cow).beEaten();
    }
}
