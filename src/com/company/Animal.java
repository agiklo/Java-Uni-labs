package com.company;

import java.io.File;

public class Animal {

    public final String species;
    public Double weight;
    public String name;
    public File pic;

    public Animal(String species, Double weight, String name, File pic) {
        this.species = species;
        this.weight = weight;
        this.name = name;
        this.pic = pic;
    }

    void feed(){
        if (weight > 0) {
            System.out.println("thx for food");
            this.weight++;
        }
        else System.out.println("Your pet is dead");
    }

    void takeForAWalk() {
        if (weight > 0) {
            System.out.println("thx for walk");
            this.weight--;
        }
        else System.out.println("Your pet is dead");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "species='" + species + '\'' +
                ", weight=" + weight +
                ", name='" + name + '\'' +
                ", pic=" + pic +
                '}';
    }
}
