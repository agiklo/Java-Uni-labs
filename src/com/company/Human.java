package com.company;

import java.time.LocalDateTime;

public class Human {

    public String firstName;
    public String lastName;
    public Animal pet;
    public Phone phone;
    public Car car;
    private Double salary;

    public Human(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Human(String firstName, String lastName, Animal pet, Phone phone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.pet = pet;
        this.phone = phone;
    }

    public Human(String firstName, String lastName, Animal pet, Phone phone, Car car) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.pet = pet;
        this.phone = phone;
        this.car = car;
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
                '}';
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
