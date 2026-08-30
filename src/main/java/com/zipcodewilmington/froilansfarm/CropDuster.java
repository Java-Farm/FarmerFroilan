package com.zipcodewilmington.froilansfarm;

public class CropDuster extends FarmVehicle implements Aircraft {

    private boolean flying;

    @Override
    public void operate(Farm farm) {
    }

    @Override
    public void fly() {
        flying = true;
    }

    public boolean isFlying() {
        return flying;
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

    public void fertilize(CropRow<? extends Crop<?>> cropRow) {
        for (Crop<?> crop : cropRow.getCrops()) {
            crop.fertilize();
        }
    }
}