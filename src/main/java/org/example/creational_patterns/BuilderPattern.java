package org.example.creational_patterns;

public class BuilderPattern {

    // Let's consider we are constructing burger

    // All fields are final because once the burger is served, you can't alter it (immutability)
    private final String bun;       // Required
    private final String patty;     // Required
    private final boolean cheese;   // Optional
    private final boolean lettuce;  // Optional
    private final boolean tomato;   // Optional

    // 1. Private constructor: Forces instantiation exclusively through the Builder
    private BuilderPattern(Builder builder) {
        this.bun = builder.bun;
        this.patty = builder.patty;
        this.cheese = builder.cheese;
        this.lettuce = builder.lettuce;
        this.tomato = builder.tomato;
    }

    // Getters only (No setters, keeping the object immutable)
    public String getBun() { return bun; }
    public String getPatty() { return patty; }
    public boolean hasCheese() { return cheese; }
    public boolean hasLettuce() { return lettuce; }
    public boolean hasTomato() { return tomato; }

    @Override
    public String toString() {
        return "BuilderPattern{" +
                "bun='" + bun + '\'' +
                ", patty='" + patty + '\'' +
                ", cheese=" + cheese +
                ", lettuce=" + lettuce +
                ", tomato=" + tomato +
                '}';
    }

    // 2. The Static Inner Builder (The assembly line worker)
    public static class Builder {
        private final String bun;   // Required
        private final String patty; // Required

        // Optionals initialized to safe default values
        private boolean cheese = false;
        private boolean lettuce = false;
        private boolean tomato = false;

        // The builder constructor mandates the absolute minimum required fields
        public Builder(String bun, String patty) {
            this.bun = bun;
            this.patty = patty;
        }

        // Fluent "setter" methods that modify the builder and return "this" (the builder itself)
        public Builder addCheese() {
            this.cheese = true;
            return this; // Returning 'this' allows us to chain methods!
        }

        public Builder addLettuce() {
            this.lettuce = true;
            return this;
        }

        public Builder addTomato() {
            this.tomato = true;
            return this;
        }

        // 3. The final "wrap it up" step
        public BuilderPattern build() {
            return new BuilderPattern(this);
        }
    }
}
