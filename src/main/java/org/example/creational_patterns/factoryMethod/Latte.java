package org.example.creational_patterns.factoryMethod;

public class Latte implements Drink {

    @Override
    public void prepare() {
        System.out.println("Latte preparing...");
    }

}
