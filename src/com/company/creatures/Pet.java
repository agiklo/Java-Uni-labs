package com.company.creatures;

import java.io.File;

public class Pet extends Animal{
    public Pet(String species, Double weight, String name, File pic) {
        super(species, weight, name, pic);
    }

    @Override
    public void feed(Double foodWeight) {
        if (weight > 0) {
            System.out.println("thx for food, now I weigh " + this.weight + foodWeight + "kg, cool");
            this.weight += foodWeight;
        }
        else System.out.println("Your pet is dead, sorry");
    }
}
