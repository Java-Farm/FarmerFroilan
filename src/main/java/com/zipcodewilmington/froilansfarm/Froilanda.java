package com.zipcodewilmington.froilansfarm;

public class Froilanda extends Person implements Rider, Pilot {

    private Rideable currentRide;

    @Override
    public void ride(Rideable rideable) {
        currentRide = rideable;
        rideable.beMounted(this);
    }

    @Override
    public void fly(Aircraft aircraft) {
        // Flying behavior will be connected when Aircraft is implemented.
    }

    public void dismount(Rideable rideable) {
        rideable.beDismounted(this);
        currentRide = null;
    }
}