package com.zipcodewilmington.froilansfarm;

import java.util.ArrayList;
import java.util.List;

public abstract class Person implements Eater, NoiseMaker {

    private String name;
    private List<Edible> consumedFood = new ArrayList<>();

    @Override
    public void eat(Edible food) {
        consumedFood.add(food);
    }

    @Override
    public String makeNoise() {
        return "Hello";
    }
}