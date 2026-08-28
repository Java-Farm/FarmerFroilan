package com.zipcodewilmington.froilansfarm;

import java.util.ArrayList;
import java.util.List;

public class CropRow<T extends Crop<?>> {

    private final List<T> crops = new ArrayList<>();

    public void addCrop(T crop) {
        crops.add(crop);
    }

    public List<T> getCrops() {
        return crops;
    }
}