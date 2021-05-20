package com.company.devices;

import com.company.Human;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.LocalDate;
import java.util.Objects;

public class Phone extends Device{

    public final Double screenSize;
    public final String operatingSystem;
    public static final String DEFAULT_APP_PROTOCOL = "Https";
    public static final String DEFAULT_APP_SERVER = "agiklo.apps.appstore.com";
    public static final String DEFAULT_APP_NAME = "photomath";

    public Phone(String producer, String model, LocalDate yearOfProduction, Double screenSize, String operatingSystem) {
        super(producer, model, yearOfProduction);
        this.screenSize = screenSize;
        this.operatingSystem = operatingSystem;
    }

    public void installAnApp(String name) throws Exception {
        if (name.equals("")) {
            throw new Exception("The application must have a name");
        }
        this.installAnApp(name, "latest");
    }

    public void installAnApp(String name, String version) throws MalformedURLException {
        URL url = new URL(DEFAULT_APP_PROTOCOL, DEFAULT_APP_SERVER,name + "-" + version);
        this.installAnApp(url);
    }

    public void installAnnApp(String name, String version, String serverAdress){
        System.out.println("Correctly installed " + name + "-" + version + " from " + serverAdress);
    }

    public void installAnApp(String[] names) throws Exception {
        if (names.length == 0) {
            throw new Exception("No applications were specified");
        }
        for (String name : names) {
            this.installAnApp(name);
        }
    }

    public void installAnApp(URL url){
        System.out.println("Correctly installed " + url.getFile() + " from " + url.getHost());
    }

    @Override
    public void turnOn() {
        System.out.println("Phone is turn on");
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) {
        if (hasPhone(seller) && hasEnoughMoney(buyer, price)) {
            trade(seller, buyer, price);
            System.out.println("Transaction is done");
        } else {
            System.out.println("Transactin cannot be done");
        }
    }

    private boolean hasPhone(Human seller) {
        return seller.phone == this;
    }

    private boolean hasEnoughMoney(Human buyer, Double price) {
        return buyer.cash > price;
    }

    private void trade(Human seller, Human buyer, Double price) {
        changeAmountsOfMoney(seller, buyer, price);
        switchOwners(seller, buyer);
    }

    private void changeAmountsOfMoney(Human seller, Human buyer, Double price){
        seller.cash = seller.cash + price;
        buyer.cash = buyer.cash - price;
    }

    private void switchOwners(Human seller, Human buyer){
        buyer.phone = seller.phone;
        seller.phone = null;
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
