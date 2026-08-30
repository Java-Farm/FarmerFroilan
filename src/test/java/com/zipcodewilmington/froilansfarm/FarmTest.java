package com.zipcodewilmington.froilansfarm;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

class FarmTest {

    @Test
    void farmShouldStoreStables() {
        Farm farm = new Farm();
        Stable stable = new Stable();

        farm.addStable(stable);

        assertEquals(1, farm.getStables().size());
        assertSame(stable, farm.getStables().get(0));
    }

    @Test
    void farmShouldStoreChickenCoops() {
        Farm farm = new Farm();
        ChickenCoop chickenCoop = new ChickenCoop();

        farm.addChickenCoop(chickenCoop);

        assertEquals(1, farm.getChickenCoops().size());
        assertSame(chickenCoop, farm.getChickenCoops().get(0));
    }

    @Test
    void farmShouldStoreOneFarmHouse() {
        Farm farm = new Farm();
        FarmHouse farmHouse = new FarmHouse();

        farm.setFarmHouse(farmHouse);

        assertSame(farmHouse, farm.getFarmHouse());
    }
}