package com.zipcodewilmington.froilansfarm;

public class TomatoPlant extends Crop<Tomato> {

    @Override
    public Tomato yield() {
        if (!isReadyToYield()) {
            return null;
        }

        return new Tomato();
    }
}