package com.zipcodewilmington.froilansfarm;

public class WheatPlant extends Crop<Wheat> {

    @Override
    public Wheat yield() {
        if (!isReadyToYield()) {
            return null;
        }

        return new Wheat();
    }
}