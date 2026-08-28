package com.zipcodewilmington.froilansfarm;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class WheatPlantTest {

    @Test
    void wheatPlantShouldYieldWheat() {
        WheatPlant wheatPlant = new WheatPlant();

        wheatPlant.fertilize();
        wheatPlant.harvest();

        assertNotNull(wheatPlant.yield());
    }
}