package com.company.devices.car;

import com.company.Human;
import com.company.devices.Device;
import com.company.enums.COLOR;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public abstract class Car extends Device {

    public COLOR color;
    public final int doors;
    public List<Human> owners = new ArrayList<>();

    protected Car(String producer, String model, LocalDate yearOfProduction, COLOR color, int doors, Double value, Human owner) {
        super(producer, model, yearOfProduction, value);
        this.color = color;
        this.doors = doors;
        owner.addCar(this);
        owners.add(owner);
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
        if (!isLastOwner(seller)){
            throw new Exception("Seller is not a last owner");
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
        owners.add(buyer);
    }

    private boolean isLastOwner(Human seller){
        return owners.get(owners.size() - 1).equals(seller);
    }

    private boolean hasEnoughMoney(Human buyer, Double price) {
        return buyer.cash > price;
    }

    private void changeAmountsOfMoney(Human seller, Human buyer, Double price){
        seller.cash += price;
        buyer.cash -= price;
    }

    public boolean hasBeenAnOwner(Human human){
        return owners.contains(human);
    }

    public boolean hasBeenASeller(Human seller, Human buyer) {
        int indexOfSeller = owners.indexOf(seller);
        return owners.get(++indexOfSeller).equals(buyer);
    }

    public int amountOfTransactions(){
        return owners.size() - 1;
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
