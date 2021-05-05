package com.company.devices;

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
