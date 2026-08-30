package com.zipcodewilmington.froilansfarm;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class MondayTest extends FarmTestSetup {

    @Test
    void froilandaShouldFlyAndFertilizeEveryCropRow() {
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

        froilanda.fly(cropDuster);

        for (CropRow<?> cropRow : field.getCropRows()) {
            cropDuster.fertilize(cropRow);
        }

        assertTrue(cropDuster.isFlying());
        assertTrue(cornOne.hasBeenFertilized());
        assertTrue(tomatoOne.hasBeenFertilized());
        assertTrue(wheat.hasBeenFertilized());
        assertTrue(cornTwo.hasBeenFertilized());
        assertTrue(tomatoTwo.hasBeenFertilized());
    }
}