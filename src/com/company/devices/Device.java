package com.company.devices;

import com.company.Salleable;

import java.time.LocalDate;

public abstract class Device implements Salleable {
    public final String producer;
    public final String model;
    public final LocalDate yearOfProduction;

    public Device(String producer, String model, LocalDate yearOfProduction) {
        this.producer = producer;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
    }

    public abstract void turnOn();

    @Override
    public String toString() {
        return "Device{" +
                "producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                '}';
    }
}
