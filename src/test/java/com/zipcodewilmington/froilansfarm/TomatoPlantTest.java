package com.zipcodewilmington.froilansfarm;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class TomatoPlantTest {

    @Test
    void tomatoPlantShouldYieldTomato() {
        TomatoPlant tomatoPlant = new TomatoPlant();

        tomatoPlant.fertilize();
        tomatoPlant.harvest();

        assertNotNull(tomatoPlant.yield());
    }
}