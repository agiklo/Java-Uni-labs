package com.company;

public class Human {

    private String firstName;
    private String lastName;
    private Animal pet;
    private Phone phone;
    private Car car;

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

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Animal getPet() {
        return pet;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public void setPet(Animal pet) {
        this.pet = pet;
    }

    public Phone getPhone() {
        return phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Human{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", pet=" + pet +
                ", phone=" + phone +
                ", car=" + car +
                '}';
    }
}
