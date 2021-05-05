package com.company;

import com.company.devices.Car;
import com.company.devices.Phone;
import com.company.enums.COLOR;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Animal cat = new Animal("Felis catus", 2.0, "Śierściuch", null);
        System.out.println(cat);
        cat.feed();
        cat.feed();
        cat.feed();
        System.out.println(cat);
        cat.takeForAWalk();
        cat.takeForAWalk();
        cat.takeForAWalk();
        cat.takeForAWalk();
        cat.takeForAWalk();
        System.out.println(cat);
        cat.takeForAWalk();
        cat.feed();

        //ex2
        Car audi = new Car("A6", "Audi", LocalDate.of(2016, 9, 07), COLOR.BLACK, 5, 50_000.00);
        Phone phone = new Phone("Apple", "IPhone 8", LocalDate.of(2018, 10, 19), 4.7, "IOS");
        Human human = new Human("Mateusz", "Milewczyk");
        System.out.println(human);

        //ex3
        human.setSalary(12000.00);
        human.getSalary();

        //ex5
        human.setCar(audi);
        System.out.println(human.getCar());

        //ex6
        Car mercedes = new Car("Mercedes", "AMG GT 43", LocalDate.of(2016, 9, 07), COLOR.WHITE, 5, 499_000.00);
        Car audi2 = new Car("Audi", "A6", LocalDate.of(2016, 9, 07), COLOR.BLACK, 5, 50_000.00);
        System.out.println(audi.equals(mercedes));
        System.out.println(audi.equals(audi2));

        System.out.println(mercedes);
        System.out.println(phone);
        System.out.println(cat);
        System.out.println(human);

        //ex7
        mercedes.turnOn();
        phone.turnOn();
        System.out.println(mercedes);
    }
}
