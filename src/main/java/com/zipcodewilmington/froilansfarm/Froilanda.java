package com.zipcodewilmington.froilansfarm;

public class Froilanda extends Person implements Rider, Pilot {

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
    public void fly(Aircraft aircraft) {
        aircraft.fly();
    }
}