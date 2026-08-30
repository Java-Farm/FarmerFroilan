package com.zipcodewilmington.froilansfarm;

public class Farmer extends Person implements Rider, Botanist {

    private Rideable currentRide;

    @Override
    public void mount(Rideable rideable) {
        currentRide = rideable;
        rideable.beMounted(this);
    }

    @Override
    public void dismount(Rideable rideable) {
        rideable.beDismounted(this);
        currentRide = null;
    }

    @Override
    public void plant(Crop crop, CropRow cropRow) {
        cropRow.addCrop(crop);
    }
}