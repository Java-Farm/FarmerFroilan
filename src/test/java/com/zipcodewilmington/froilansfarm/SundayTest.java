package com.zipcodewilmington.froilansfarm;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertSame;

class SundayTest extends FarmTestSetup {

    @Test
    void froilanShouldPlantThreeDifferentCrops() {
        CornStalk corn = new CornStalk();
        TomatoPlant tomato = new TomatoPlant();
        WheatPlant wheat = new WheatPlant();

        froilan.plant(corn, firstRow);
        froilan.plant(tomato, secondRow);
        froilan.plant(wheat, thirdRow);

        assertSame(corn, firstRow.getCrops().get(0));
        assertSame(tomato, secondRow.getCrops().get(0));
        assertSame(wheat, thirdRow.getCrops().get(0));
    }
}