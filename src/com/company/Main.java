package com.company;

import com.company.devices.car.Car;
import com.company.devices.car.Electric;
import com.company.enums.COLOR;

import java.time.LocalDate;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws Exception {
        Human human = new Human("Mateusz", "Milewczyk", 5);
        Human huma2 = new Human("Mirek", "Mar", 5);
        human.setSalary(5_000_000.00);
        huma2.setSalary(5_000_000.00);
        human.cash = 3223223.0;
        huma2.cash= 200000.0;

        Car tesla = new Electric("Tesla", "X", LocalDate.of(2017, 1, 1), COLOR.BLACK, 5, 277_000.0, human);

        System.out.println(tesla.amountOfTransactions());
        System.out.println(tesla.hasBeenAnOwner(human));
        System.out.println(tesla.hasBeenAnOwner(huma2));

        tesla.sell(human, huma2, 1000.0);
        System.out.println(tesla.hasBeenASeller(human, huma2));
        System.out.println(tesla.amountOfTransactions());

        Arrays.stream(huma2.garage).forEach(System.out::println);
        Arrays.stream(human.garage).forEach(System.out::println);
    }
}
