package com.company.devices.car;

import com.company.enums.COLOR;

import java.time.LocalDate;

public class Electric extends Car{

    public Electric(String producer, String model, LocalDate yearOfProduction, COLOR color, int doors, Double value) {
        super(producer, model, yearOfProduction, color, doors, value);
    }

    @Override
    public void refuel() {
        System.out.println("The electric car " + producer + " " + model + " has been charged.");
    }
}
