package com.company.devices;

import com.company.enums.COLOR;

import java.util.Objects;

public class Car {

    public final String model;
    public final String producer;
    public COLOR color;
    public final int doors;
    public Double value;

    public Car(String model, String producer, COLOR color, int doors, Double value) {
        this.model = model;
        this.producer = producer;
        this.color = color;
        this.doors = doors;
        this.value = value;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", producer='" + producer + '\'' +
                ", color=" + color +
                ", doors=" + doors +
                ", value=" + value +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return doors == car.doors &&
                Objects.equals(model, car.model) &&
                Objects.equals(producer, car.producer) &&
                color == car.color &&
                Objects.equals(value, car.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, producer, color, doors, value);
    }
}
