package com.company;

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
        Car car = new Car("A6", "Audi", COLOR.BLACK, 5);
        Phone phone = new Phone("Apple", "IPhone 8", 4.7, "IOS");
        Human human = new Human("Mateusz", "Milewczyk", cat, phone, car);
        System.out.println(human);

        //ex3
        human.setSalary(2000.2);
        human.getSalary();
    }
}
