package org.example.creational_patterns.singleton;

public class Singleton {

    public static volatile Singleton instance;

    private Singleton() {
        System.out.println("Instance from Singleton class");
    }

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
