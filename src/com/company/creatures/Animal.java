package com.company.creatures;

import com.company.Human;
import com.company.Salleable;

import java.io.File;

public abstract class Animal implements Salleable, Feedable {

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

    public void feed(){
        if (weight > 0) {
            System.out.println("thx for food");
            this.weight++;
        }
        else System.out.println("Your pet is dead");
    }

    public void takeForAWalk() {
        if (weight > 0) {
            System.out.println("thx for walk");
            this.weight--;
        }
        else System.out.println("Your pet is dead");
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) {
        if (hasAnimal(seller) && hasEnoughMoney(buyer, price)) {
            trade(seller, buyer, price);
            System.out.println("Transaction is done");
        } else {
            System.out.println("Transactin cannot be done");
        }
    }

    private boolean hasAnimal(Human seller) {
        return seller.pet == this;
    }

    private boolean hasEnoughMoney(Human buyer, Double price) {
        return buyer.cash > price;
    }

    private void trade(Human seller, Human buyer, Double price) {
        changeAmountsOfMoney(seller, buyer, price);
        switchOwners(seller, buyer);
    }

    private void changeAmountsOfMoney(Human seller, Human buyer, Double price){
        seller.cash = seller.cash + price;
        buyer.cash = buyer.cash - price;
    }

    private void switchOwners(Human seller, Human buyer){
        buyer.pet = seller.pet;
        seller.pet = null;
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
