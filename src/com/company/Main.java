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
        Human human = new Human("Mateusz", "Milewczyk", cat, null, car);
        System.out.println(human);
    }
}
