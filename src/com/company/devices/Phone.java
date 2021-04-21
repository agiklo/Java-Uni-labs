package com.company.devices;

public class Phone {

    public final String producer;
    public final String model;
    public final Double screenSize;
    public String operatingSystem;

    public Phone(String producer, String model, Double screenSize, String operatingSystem) {
        this.producer = producer;
        this.model = model;
        this.screenSize = screenSize;
        this.operatingSystem = operatingSystem;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", screenSize=" + screenSize +
                ", operatingSystem='" + operatingSystem + '\'' +
                '}';
    }
}
