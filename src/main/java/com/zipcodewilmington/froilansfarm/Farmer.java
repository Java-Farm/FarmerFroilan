package com.zipcodewilmington.froilansfarm;

public class Farmer extends Person implements Rider, Botanist {

    private Rideable currentRide;

    @Override
    public void ride(Rideable rideable) {
        currentRide = rideable;
        rideable.beMounted(this);
    }

    public void mount(Rideable rideable) {
        currentRide = rideable;
        rideable.beMounted(this);
    }

    public void dismount(Rideable rideable) {
        rideable.beDismounted(this);
        currentRide = null;
    }

    @Override
    public void plant(Crop c, CropRow r) {
        // Planting behavior will be completed with the CropRow work.
    }
}