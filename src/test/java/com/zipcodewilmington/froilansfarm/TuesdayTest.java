package com.zipcodewilmington.froilansfarm;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class TuesdayTest extends FarmTestSetup {

    @Test
    void froilanShouldHarvestEveryCropInEveryCropRow() {
        CornStalk cornOne = new CornStalk();
        TomatoPlant tomatoOne = new TomatoPlant();
        WheatPlant wheat = new WheatPlant();
        CornStalk cornTwo = new CornStalk();
        TomatoPlant tomatoTwo = new TomatoPlant();

        firstRow.addCrop(cornOne);
        secondRow.addCrop(tomatoOne);
        thirdRow.addCrop(wheat);
        fourthRow.addCrop(cornTwo);
        fifthRow.addCrop(tomatoTwo);

        for (CropRow<?> cropRow : field.getCropRows()) {
            for (Crop<?> crop : cropRow.getCrops()) {
                tractor.harvest(crop);
            }
        }

        assertTrue(cornOne.hasBeenHarvested());
        assertTrue(tomatoOne.hasBeenHarvested());
        assertTrue(wheat.hasBeenHarvested());
        assertTrue(cornTwo.hasBeenHarvested());
        assertTrue(tomatoTwo.hasBeenHarvested());
    }
}