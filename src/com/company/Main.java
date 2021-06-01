package com.company;

import com.company.devices.Application;
import com.company.devices.Phone;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) throws Exception {
        Phone iphone = new Phone("Apple", "X", LocalDate.of(2019, 1, 1), 2000.0, 5.3, "IOS");
        Application facebook = new Application("facebook", "latest", 0.0);
        Application twitter = new Application("twitter", "latest", 0.0);
        Application netflix = new Application("netflix", "latest", 42.0);
        Application hbo = new Application("hbo", "latest", 21.0);

        Human human = new Human("Mateusz", "Milewczyk", null, iphone, 5, 4000.0);
        human.setSalary(5_000_000.00);

        iphone.installAnApp(facebook, human);
        System.out.println(iphone.isApplicationInstalled("facebook"));
        System.out.println(iphone.isApplicationInstalled(facebook));
        System.out.println(iphone.isApplicationInstalled("twitter"));
        System.out.println(iphone.isApplicationInstalled(twitter));

        iphone.installAnApp(twitter, human);
        iphone.installAnApp(netflix, human);
        iphone.installAnApp(hbo, human);

        System.out.println("============ FREE APPS ============");
        iphone.getFreeApplications();

        System.out.println("============ ASCENDING SORTED BY NAME ============");
        iphone.getApplicationsSortedAscByName();

        System.out.println("Total value of apps: " + iphone.getTotalValueOfApplications());

        System.out.println("============ ASCENDING SORTED BY PRICE ============");
        iphone.getApplicationsSortedAscByPrice();


    }
}
