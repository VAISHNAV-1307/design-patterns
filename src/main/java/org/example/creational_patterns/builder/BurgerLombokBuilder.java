package org.example.creational_patterns.builder;

public class BurgerLombokBuilder {

    // All fields are final because once the burger is served, you can't alter it (immutability)
    private final String bun;
    private final String patty;
    private final boolean cheese;
    private final boolean lettuce;
    private final boolean tomato;

    // 1. Private constructor: Forces instantiation exclusively through the Builder
    private BurgerLombokBuilder(Builder builder) {
        this.bun = builder.bun;
        this.patty = builder.patty;
        this.cheese = builder.cheese;
        this.lettuce = builder.lettuce;
        this.tomato = builder.tomato;
    }

    // Getters only (No setters, keeping the object immutable)
    public String getBun() {return bun;}
    public String getPatty() {return patty;}
    public boolean isCheese() {return cheese;}
    public boolean isLettuce() {return lettuce;}
    public boolean isTomato() {return tomato;}

    @Override
    public String toString() {
        return "LombokBuilderPattern{" +
                "bun='" + bun + '\'' +
                ", patty='" + patty + '\'' +
                ", cheese=" + cheese +
                ", lettuce=" + lettuce +
                ", tomato=" + tomato +
                '}';
    }

    // Lombok generates this static method for you!
    public static Builder builder() {
        return new Builder();
    }

    // 2. The Static Inner Builder (The assembly line worker)
    public static class Builder {
        private String bun;
        private String patty;
        private boolean cheese;
        private boolean lettuce;
        private boolean tomato;

        // Fluent "setter" methods that modify the builder and return "this" (the builder itself)
        public Builder addCheese(){
            this.cheese = true;
            return this;
        }

        public Builder addLettuce(){
            this.lettuce = true;
            return this;
        }

        public Builder addTomato(){
            this.tomato = true;
            return this;
        }

        public Builder setBun(String bun) {
            this.bun = bun;
            return this;
        }

        public Builder setPatty(String patty) {
            this.patty = patty;
            return this;
        }

        // 3. The final "wrap it up" step
        public BurgerLombokBuilder build() {
            return new BurgerLombokBuilder(this);
        }
    }
}
