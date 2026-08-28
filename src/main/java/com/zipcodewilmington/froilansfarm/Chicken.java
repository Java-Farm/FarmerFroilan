package com.zipcodewilmington.froilansfarm;

public class Chicken {

    private boolean fertilized;

    public Chicken() {
        this(false);
    }

    public Chicken(boolean fertilized) {
        this.fertilized = fertilized;
    }

    public String makeNoise() {
        return "Cluck";
    }

    public Edible yield() {
        if (fertilized) {
            return null;
        }

        return new EdibleEgg();
    }
}