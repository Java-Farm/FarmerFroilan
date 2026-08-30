package com.zipcodewilmington.froilansfarm;

public class Tractor extends FarmVehicle {

    @Override
    public void operate(Farm farm) {
    }

    public void harvest(Crop<?> crop) {
        crop.harvest();
    }

    @Override
    public String makeNoise() {
        return "Vroom";
    }

    @Override
    public void beMounted(Rider rider) {
    }

    @Override
    public void beDismounted(Rider rider) {
    }
}