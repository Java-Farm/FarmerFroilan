package com.zipcodewilmington.froilansfarm;

public class Horse extends Animal implements Rideable {

    private boolean mounted;

    @Override
    public String makeNoise() {
        return "Neigh";
    }

    @Override
    public void beMounted(Rider rider) {
        mounted = true;
    }

    @Override
    public void beDismounted(Rider rider) {
        mounted = false;
    }

    public boolean isMounted() {
        return mounted;
    }
}