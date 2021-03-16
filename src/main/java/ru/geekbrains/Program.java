package ru.geekbrains;

import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {
        ArrayList<Cat> cats = new ArrayList<>();
        cats.add(new Cat("Cat1", 5));
        cats.add(new Cat("Cat2", 3));
        cats.add(new Cat("Cat3", 6));
        cats.add(new Cat("Cat3", 10));

        Plate plate = new Plate(100);
        plate.info();
        cats.forEach((cat) -> cat.eat(plate));
        cats.forEach((cat) -> System.out.printf("Cat %s has sitost %b\n", cat.getName(), cat.isSitost()));
        plate.info();
    }
}
