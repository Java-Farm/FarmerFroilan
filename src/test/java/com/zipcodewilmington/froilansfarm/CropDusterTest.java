package com.zipcodewilmington.froilansfarm;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class CropDusterTest {

    @Test
    void cropDusterShouldBeAnAircraft() {
        CropDuster cropDuster = new CropDuster();

        assertTrue(cropDuster instanceof Aircraft);
    }

    @Test
    void cropDusterShouldBeAFarmVehicle() {
        CropDuster cropDuster = new CropDuster();

        assertTrue(cropDuster instanceof FarmVehicle);
    }
    @Test
    void cropDusterShouldFertilizeEveryCropInARow() {
        CropDuster cropDuster = new CropDuster();
        CropRow<CornStalk> cropRow = new CropRow<>();
        CornStalk firstCrop = new CornStalk();
        CornStalk secondCrop = new CornStalk();

        cropRow.addCrop(firstCrop);
        cropRow.addCrop(secondCrop);

        cropDuster.fertilize(cropRow);

        assertTrue(firstCrop.hasBeenFertilized());
        assertTrue(secondCrop.hasBeenFertilized());
    }
}