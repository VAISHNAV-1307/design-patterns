package org.example;

import org.example.creational_patterns.factoryMethod.Drink;
import org.example.creational_patterns.factoryMethod.DrinkFactory;

public class Main {

    static void main() {

        // Singleton pattern
        /*
        Singleton instance = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();
        System.out.println(instance);
        System.out.println(instance1);
         */

        // Builder pattern
        /*
        BuilderPattern builderPattern = new BuilderPattern.Builder("wheat", "chicken")
                .addCheese()
                .addLettuce()
                .addTomato()
                .build();
        System.out.println(builderPattern);
         */

        // Lombok builder pattern
        /*
        LombokBuilderPattern lombokBuilderPattern = LombokBuilderPattern.builder()
                .setBun("wheat")
                .setPatty("chicken")
                .addCheese()
                .addLettuce()
                .addTomato()
                .build();
        System.out.println(lombokBuilderPattern);
         */

        // Factory Method pattern
        Drink latte = DrinkFactory.createDrink("LATTE");
        latte.prepare();
        Drink espresso = DrinkFactory.createDrink("ESPRESSO");
        espresso.prepare();

    }

}
