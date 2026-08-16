package org.example.creational_patterns;

public class SingletonPattern {

    public static volatile SingletonPattern instance;

    private SingletonPattern() {
        System.out.println("Instance from Singleton class");
    }

    public static SingletonPattern getInstance() {
        if (instance == null) {
            synchronized (SingletonPattern.class) {
                if (instance == null) {
                    instance = new SingletonPattern();
                }
            }
        }
        return instance;
    }
}
