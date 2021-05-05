package com.company.devices;

import com.company.Human;

import java.time.LocalDate;
import java.util.Objects;

public class Phone extends Device{

    public final Double screenSize;
    public String operatingSystem;

    public Phone(String producer, String model, LocalDate yearOfProduction, Double screenSize, String operatingSystem) {
        super(producer, model, yearOfProduction);
        this.screenSize = screenSize;
        this.operatingSystem = operatingSystem;
    }

    @Override
    public void turnOn() {
        System.out.println("Phone is turn on");
    }

    @Override
    public String toString() {
        return "Phone{" +
                "producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                ", screenSize=" + screenSize +
                ", operatingSystem='" + operatingSystem + '\'' +
                '}';
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) {
        if (hasPhone(seller) && hasEnoughMoney(buyer, price)) {
            trade(seller, buyer, price);
            System.out.println("Transaction is done");
        } else {
            System.out.println("Transactin cannot be done");
        }
    }

    private boolean hasPhone(Human seller) {
        return seller.phone == this;
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
        buyer.phone = seller.phone;
        seller.phone = null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Phone phone = (Phone) o;
        return Objects.equals(screenSize, phone.screenSize) && Objects.equals(operatingSystem, phone.operatingSystem);
    }

    @Override
    public int hashCode() {
        return Objects.hash(screenSize, operatingSystem);
    }
}
