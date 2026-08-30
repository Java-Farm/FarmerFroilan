package com.zipcodewilmington.froilansfarm;

public class Chicken extends Animal implements Produce {

    private boolean fertilized;

    public Chicken() {
        this(false);
    }

    public Chicken(boolean fertilized) {
        this.fertilized = fertilized;
    }

    @Override
    public String makeNoise() {
        return "Cluck";
    }

    @Override
    public Edible yield() {
        if (fertilized) {
            return null;
        }

        return new EdibleEgg();
    }
}