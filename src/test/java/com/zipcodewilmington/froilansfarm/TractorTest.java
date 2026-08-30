package com.zipcodewilmington.froilansfarm;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class TractorTest {

    @Test
    void tractorShouldBeAFarmVehicle() {
        Tractor tractor = new Tractor();

        assertTrue(tractor instanceof FarmVehicle);
    }

    @Test
    void tractorShouldHarvestACrop() {
        Tractor tractor = new Tractor();
        CornStalk crop = new CornStalk();

        tractor.harvest(crop);

        assertTrue(crop.hasBeenHarvested());
    }
}