package com.zipcodewilmington.froilansfarm;

public abstract class Crop<T extends Edible> implements Produce<T> {

    private boolean hasBeenFertilized;
    private boolean hasBeenHarvested;

    public void fertilize() {
        hasBeenFertilized = true;
    }

    public void harvest() {
        hasBeenHarvested = true;
    }

    public boolean hasBeenFertilized() {
        return hasBeenFertilized;
    }

    public boolean hasBeenHarvested() {
        return hasBeenHarvested;
    }

    protected boolean isReadyToYield() {
        return hasBeenFertilized && hasBeenHarvested;
    }
}