package com.zipcodewilmington.froilansfarm;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChickenTest {

    @Test
    void chickenShouldMakeNoise() {
        Chicken chicken = new Chicken();

        String actualNoise = chicken.makeNoise();

        assertEquals("Cluck", actualNoise);
    }

    @Test
    void unfertilizedChickenShouldYieldEdibleEgg() {
        Chicken chicken = new Chicken(false);

        Edible actualEgg = chicken.yield();

        assertNotNull(actualEgg);
    }

    @Test
    void fertilizedChickenShouldNotYieldEdibleEgg() {
        Chicken chicken = new Chicken(true);

        Edible actualEgg = chicken.yield();

        assertNull(actualEgg);
    }
}