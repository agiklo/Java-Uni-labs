package com.company;

import com.company.creatures.Animal;
import com.company.devices.car.Car;
import com.company.devices.Phone;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Human{

    public String firstName;
    public String lastName;
    public Animal pet;
    public Phone phone;
    public Car[] garage;
    private Double salary;
    public Double cash;

    public Human(String firstName, String lastName, int sizeOfGarage) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.garage = new Car[sizeOfGarage];
    }

    public Human(String firstName, String lastName, Animal pet, Phone phone, int sizeOfGarage, Double cash) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.pet = pet;
        this.phone = phone;
        this.garage = new Car[sizeOfGarage];
        this.cash = cash;
    }

    public Car getCar(int parking){
        return garage[parking];
    }

    public double getTotalValueOfGarage(){
        double value = 0;
        for(Car car: garage){
            value = value + car.value;
        }
        return value;
    }

    public List<Car> sortCarsByProductionYear(){
        return Arrays.stream(garage)
                .sorted(Comparator.comparing(car -> car.yearOfProduction))
                .collect(Collectors.toList());
    }

    public void setCar(int parking, Car car) {
        if (salary > car.value) {
            System.out.println("You managed to buy a car with cash");
            garage[parking] = car;
        }
        else if (salary > car.value/12) {
            System.out.println("You bought a car on credit");
            garage[parking] = car;
        }
        else {
            System.out.println("Enroll in college and find a new job or take a raise!");
        }
    }

    public Double getSalary() {
        LocalDateTime time = LocalDateTime.now();
        System.out.println("Date: " + time  + ", Salary: " + salary);
        return salary;
    }

    public void setSalary(Double salary) {
        if (salary < 0) {
            throw new IllegalArgumentException("Salary have to be greater than 0");
        }
        sendToAccountingSystem();
        collectAnnex();
        informZusandUS();
        this.salary = salary;
    }

    private void sendToAccountingSystem(){
        System.out.println("The data has been sent to the accounting system");
    }

    private void collectAnnex(){
        System.out.println("The need to collect the annex to the contract from Ms Hania from HR");
    }

    private void informZusandUS(){
        System.out.println("ZUS and US already know about the change in payment, it makes no sense to hide your income");
    }

    public boolean hasCar(Car newCar){
        for (Car car: garage) {
            if(car == newCar) return true;
        }
        return false;
    }

    public boolean hasFreeSpace(){
        for (Car car: garage) {
            if(car == null) return true;
        }
        return false;
    }

    public void removeCar(Car carToRemove){
        for (int i = 0; i < garage.length; i++){
            if (this.garage[i] == carToRemove){
                this.garage[i] = null;
            }
        }
    }

    public void addCar(Car newCar){
        for (int i = 0; i < garage.length; i++){
            if (this.garage[i] == null){
                this.garage[i] = newCar;
            }
        }
    }

    @Override
    public String toString() {
        return "Human{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", pet=" + pet +
                ", phone=" + phone +
                ", garage=" + Arrays.toString(garage) +
                ", salary=" + salary +
                ", cash=" + cash +
                '}';
    }
}
