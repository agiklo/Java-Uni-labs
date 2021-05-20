package com.company.devices.car;

import com.company.Human;
import com.company.devices.Device;
import com.company.enums.COLOR;

import java.time.LocalDate;
import java.util.Objects;

public abstract class Car extends Device {

    public COLOR color;
    public final int doors;
    public Double value;

    protected Car(String producer, String model, LocalDate yearOfProduction, COLOR color, int doors, Double value) {
        super(producer, model, yearOfProduction);
        this.color = color;
        this.doors = doors;
        this.value = value;
    }

    public abstract void refuel();

    @Override
    public void turnOn() {
        System.out.println("Car is turn on");
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) {
        if (hasCar(seller) && hasEnoughMoney(buyer, price)) {
            trade(seller, buyer, price);
            System.out.println("Transaction is done");
        } else {
            System.out.println("Transactin cannot be done");
        }
    }

    private boolean hasCar(Human seller) {
        return seller.getCar() == this;
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
        buyer.boughtCar(seller.getCar());
        seller.soldCar();
    }

    @Override
    public String toString() {
        return "Car{" +
                "color=" + color +
                ", doors=" + doors +
                ", value=" + value +
                ", producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return doors == car.doors && color == car.color && Objects.equals(value, car.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, doors, value);
    }
}
