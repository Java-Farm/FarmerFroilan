package com.zipcodewilmington.froilansfarm;

import java.util.ArrayList;
import java.util.List;

public abstract class Animal implements Eater, NoiseMaker {

    private boolean hasEaten;
    private final List<Edible> consumedFood = new ArrayList<>();

    @Override
    public void eat(Edible food) {
        consumedFood.add(food);
        hasEaten = true;
    }

    public boolean hasEaten() {
        return hasEaten;
    }

    public List<Edible> getConsumedFood() {
        return consumedFood;
    }
}