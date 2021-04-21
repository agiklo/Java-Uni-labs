package com.company;

public class Car {

    private final String model;
    private final String producer;
    private COLOR color;
    private final int doors;

    public Car(String model, String producer, COLOR color, int doors) {
        this.model = model;
        this.producer = producer;
        this.color = color;
        this.doors = doors;
    }

    public String getModel() {
        return model;
    }

    public String getProducer() {
        return producer;
    }

    public COLOR getColor() {
        return color;
    }

    public void setColor(COLOR color) {
        this.color = color;
    }

    public int getDoors() {
        return doors;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", producer='" + producer + '\'' +
                ", color=" + color +
                ", doors=" + doors +
                '}';
    }
}
