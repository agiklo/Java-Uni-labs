package com.company.devices;

import java.time.LocalDate;

public abstract class Device {
    public final String producer;
    public final String model;
    public final LocalDate yearOfProduction;

    public Device(String producer, String model, LocalDate yearOfProduction) {
        this.producer = producer;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
    }

    public void turnOn(){
        System.out.println("Device is turn on");
    }

    @Override
    public String toString() {
        return "Device{" +
                "producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                '}';
    }
}
