package org.example.creational_patterns.factoryMethod;

public class Espresso implements Drink {

    @Override
    public void prepare() {
        System.out.println("Espresso preparing...");
    }

}
