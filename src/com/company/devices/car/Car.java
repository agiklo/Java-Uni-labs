package com.company.devices.car;

import com.company.Human;
import com.company.devices.Device;
import com.company.enums.COLOR;

import java.time.LocalDate;
import java.util.Objects;

public abstract class Car extends Device {

    public COLOR color;
    public final int doors;

    protected Car(String producer, String model, LocalDate yearOfProduction, COLOR color, int doors, Double value) {
        super(producer, model, yearOfProduction, value);
        this.color = color;
        this.doors = doors;
    }

    public abstract void refuel();

    @Override
    public void turnOn() {
        System.out.println("Car is turn on");
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) throws Exception {
        if(!seller.hasCar(this)){
            throw new Exception("Seller doesn't have required car");
        }
        if(!buyer.hasFreeSpace()){
            throw new Exception("Buyer doesn't have enough space in garage");
        }
        if (!hasEnoughMoney(buyer, price)){
            throw new Exception("Buyer doesn't have enough money");
        }
        seller.removeCar(this);
        buyer.addCar(this);
        changeAmountsOfMoney(seller, buyer, price);
        System.out.println("Sold");
    }

    private boolean hasEnoughMoney(Human buyer, Double price) {
        return buyer.cash > price;
    }

    private void changeAmountsOfMoney(Human seller, Human buyer, Double price){
        seller.cash += price;
        buyer.cash -= price;
    }

    @Override
    public String toString() {
        return "\nCar {\n" +
                "   color=" + color +
                ",\n   doors=" + doors +
                ",\n   value=" + value +
                ",\n   producer='" + producer + '\'' +
                ",\n   model='" + model + '\'' +
                ",\n   yearOfProduction=" + yearOfProduction +
                "\n}\n";
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
