package com.company.devices.car;

import com.company.Human;
import com.company.enums.COLOR;

import java.time.LocalDate;

public class LPG extends Car{

    public LPG(String producer, String model, LocalDate yearOfProduction, COLOR color, int doors, Double value, Human owner) {
        super(producer, model, yearOfProduction, color, doors, value, owner);
    }

    @Override
    public void refuel() {
        System.out.println("The lpg car " + producer + " " + model + " was refueled.");
    }
}
