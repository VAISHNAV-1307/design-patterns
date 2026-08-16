package org.example.creational_patterns.factoryMethod;

public class DrinkFactory {

    // The factory method determines which object to create based on input
    public static Drink createDrink(String drinkType) {
        if (drinkType == null){
            return null;
        }
        return switch (drinkType.toUpperCase()) {
            case "LATTE" -> new Latte();
            case "ESPRESSO" -> new Espresso();
            default -> throw new IllegalArgumentException("Unknown drink type: " + drinkType);
        };
    }
}
