package com.company.devices;

import com.company.enums.COLOR;

import java.time.LocalDate;
import java.util.Objects;

public class Car extends Device{

    public COLOR color;
    public final int doors;
    public Double value;

    public Car(String producer, String model, LocalDate yearOfProduction, COLOR color, int doors, Double value) {
        super(producer, model, yearOfProduction);
        this.color = color;
        this.doors = doors;
        this.value = value;
    }

    @Override
    public void turnOn() {
        System.out.println("Car is turn on");
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
