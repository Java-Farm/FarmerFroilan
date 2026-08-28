package com.zipcodewilmington.froilansfarm;

public abstract class Animal implements Eater, NoiseMaker {

    private boolean hasEaten;

    @Override
    public void eat(Edible food) {
        hasEaten = true;
    }

    public boolean hasEaten() {
        return hasEaten;
    }
}