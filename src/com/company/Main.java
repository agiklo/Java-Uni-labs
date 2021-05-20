package com.company;

import com.company.devices.Phone;
import com.company.devices.car.Car;
import com.company.devices.car.Disel;
import com.company.devices.car.Electric;
import com.company.devices.car.LPG;
import com.company.enums.COLOR;

import java.net.URL;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) throws Exception {
        Phone iphone = new Phone("Apple", "X", LocalDate.of(2019, 1, 1), 1300.0, 5.3, "IOS");
        iphone.installAnApp("Angry Birds");
        iphone.installAnApp("Angry birds", "1.0.4");
        iphone.installAnnApp("Angry birds", "6.3.1", "angrybirds.appstore.com");

        URL url = new URL(Phone.DEFAULT_APP_PROTOCOL, Phone.DEFAULT_APP_SERVER,Phone.DEFAULT_APP_NAME + "-" + "latest");
        iphone.installAnApp(url);

        String[] names = {"Angry Testers", "Angry Deadlines", "Angry clients"};
        iphone.installAnApp(names);

        Car tesla = new Electric("Tesla", "X", LocalDate.of(2017, 1, 1), COLOR.BLACK, 5, 277_000.0);
        Car mercedes = new LPG("Mercedes-Benz", "E 200", LocalDate.of(2006, 1, 1), COLOR.WHITE, 4, 20_900.0);
        Car ford = new Disel("Ford", "Mondeo", LocalDate.of(2016, 1, 1), COLOR.BLUE, 5, 53_998.0);
        tesla.refuel();
        mercedes.refuel();
        ford.refuel();

        Human human = new Human("Mateusz", "Milewczyk", 3);
        human.setSalary(5_000_000.00);
        human.setCar(0, tesla);
        human.setCar(1, mercedes);
        human.setCar(2, ford);
        System.out.println(human.getTotalValueOfGarage());
        System.out.println(human.sortCarsByProductionYear());
    }
}
