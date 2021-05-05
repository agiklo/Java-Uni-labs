package com.company;

import com.company.creatures.Animal;
import com.company.devices.Car;
import com.company.devices.Phone;

import java.time.LocalDateTime;

public class Human{

    public String firstName;
    public String lastName;
    public Animal pet;
    public Phone phone;
    private Car car;
    private Double salary;
    public Double cash;

    public Human(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Human(String firstName, String lastName, Animal pet, Phone phone, Double cash) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.pet = pet;
        this.phone = phone;
        this.cash = cash;
    }

    public Human(String firstName, String lastName, Animal pet, Phone phone, Car car, Double cash) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.pet = pet;
        this.phone = phone;
        this.car = car;
        this.cash = cash;
    }

    @Override
    public String toString() {
        return "Human{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", pet=" + pet +
                ", phone=" + phone +
                ", car=" + car +
                ", salary=" + salary +
                ", cash=" + cash +
                '}';
    }

    public Car getCar(){
        return car;
    }

    public void boughtCar(Car car){
        this.car = car;
    }

    public void soldCar(){
        car = null;
    }

    public void setCar(Car car) {
        if (salary > car.value) {
            System.out.println("You managed to buy a car with cash");
            this.car = car;
        }
        else if (salary > car.value/12) {
            System.out.println("You bought a car on credit");
            this.car = car;
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
}
